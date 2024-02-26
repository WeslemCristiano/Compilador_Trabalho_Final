public class AnalisadorLexico {
    Leitor leitor;

    public AnalisadorLexico(String arquivo){
        leitor = new Leitor(arquivo);
    }

    public Token proximoToken() {
        Token proximo = null;
        espacosEComentarios();
        leitor.confirmar();

        proximo = fim();
        if(proximo == null){
            leitor.zerar();
        } else {
            leitor.confirmar();
            return proximo;
        }

        proximo = palavrasChave();
        if(proximo == null){
            leitor.zerar();
        } else {
            leitor.confirmar();
            return proximo;
        }

        proximo = variavel();
        if(proximo == null){
            leitor.zerar();
        } else {
            leitor.confirmar();
            return proximo;
        }

        proximo = numeros();
        if(proximo == null){
            leitor.zerar();
        } else {
            leitor.confirmar();
            return proximo;
        }

        proximo = operadorAritmetico();
        if(proximo == null){
            leitor.zerar();
        } else {
            leitor.confirmar();
            return proximo;
        }

        proximo = delimitador();
        if(proximo == null){
            leitor.zerar();
        } else {
            leitor.confirmar();
            return proximo;
        }

        proximo = Cadeia();
        if(proximo == null){
            leitor.zerar();
        } else {
            leitor.confirmar();
            return proximo;
        }

        proximo = operadorRel();
        if(proximo == null){
            leitor.zerar();
        } else {
            leitor.confirmar();
            return proximo;
        }

        System.out.println("ERRO LEXICO!");

       return null;
    }

    private Token operadorAritmetico(){
        int caracter = leitor.proxCaracter();
        char c = (char) caracter;

        if (c == '*') {
            return new Token(TokenEnum.OpAritMult, leitor.getLexema());
        } else if (c == '/') {
            return new Token(TokenEnum.OpAritDiv, leitor.getLexema());
        } else if (c == '-'){
            return new Token(TokenEnum.OpAritSub, leitor.getLexema());
        } else if (c == '+') {
            return new Token(TokenEnum.OpAritSoma, leitor.getLexema());
        } else {
            return null;
        }
    }

    private Token delimitador() {
        int caracter = leitor.proxCaracter();
        char c = (char) caracter;
        if (c == ':') {
            return new Token(TokenEnum.Delim, leitor.getLexema());
        }
        return null;
    }

    private Token parenteses(){
        int caracter = leitor.proxCaracter();
        char c = (char) caracter;
        if(c == '('){
            return new Token(TokenEnum.AbrePar, leitor.getLexema());
        } else if (c == ')'){
            return new Token(TokenEnum.FechaPar, leitor.getLexema());
        } else {
            return null;
        }
    }

    private Token numeros() {
        int estado = 1;
        while (true) {
            char c = (char) leitor.proxCaracter();
            if (estado == 1) {
                if (Character.isDigit(c)) {
                    estado = 2;
                } else {
                    return null;
                }
            } else if (estado == 2) {
                if (c == '.') {
                    c = (char) leitor.proxCaracter();
                    if (Character.isDigit(c)) {
                        estado = 3;
                    } else {
                        return null;
                    }
                } else if (!Character.isDigit(c)) {
                    leitor.retroceder();
                    return new Token(TokenEnum.NumInt, leitor.getLexema());
                }
            } else if (estado == 3){
                if (!Character.isDigit(c)) {
                    leitor.retroceder();
                    return new Token(TokenEnum.NumReal, leitor.getLexema());
                }
            }
        }
    }

    private Token variavel(){
        int estado = 1;
        while(true) {
            char c = (char) leitor.proxCaracter();
            if(estado == 1){
                if(Character.isLetter(c)){
                    estado = 2;
                } else {return null;}
            } else if (estado == 2) {
                if(!Character.isLetterOrDigit(c)) {
                    leitor.retroceder();
                    return new Token(TokenEnum.Var, leitor.getLexema());
                }
            }
        }
    }

    private Token Cadeia() {
        int estado = 1;
        while(true) {
            char c = (char) leitor.proxCaracter();
            if(estado == 1){
                if(c == '\''){
                    estado = 2;
                }
                else {
                    return null;
                }
            } else if (estado == 2) {
                if (c == '\n'){
                    return null;
                }
                if(c == '\''){
                    return new Token(TokenEnum.Cadeia, leitor.getLexema());
                }
            }
        }
    }

    private void espacosEComentarios(){
        int estado = 1;
        while(true){
            char c = (char) leitor.proxCaracter();
            if(estado == 1) {
                if (Character.isWhitespace(c) || c == ' ') {
                    estado = 2;
                } else if (c == '%') {
                    estado = 3;
                } else {
                    leitor.retroceder();
                    return;
                }
            } else if (estado == 2){
                if(c == '%') {
                    estado = 3;
                } else if (!(Character.isWhitespace(c) || c == ' ')){
                    leitor.retroceder();
                    return;
                }
            } else if (estado == 3){
                if(c == '\n'){
                    return;
                }
            }
        }
    }

    private Token palavrasChave() {
        while(true){
            char c = (char) leitor.proxCaracter();
            if(!Character.isLetter(c)) {
                leitor.retroceder();
                String lexema = leitor.getLexema();
                if(lexema.equals("DECLARACOES")){
                    return new Token(TokenEnum.PcDeclaracoes, lexema);
                } else if(lexema.equals("PCAlgoritmo")){
                    return new Token(TokenEnum.PcAlgoritmo, lexema);
                } else if(lexema.equals("PCInteiro")){
                    return new Token(TokenEnum.PCInterio, lexema);
                } else if(lexema.equals("PCReal")){
                    return new Token(TokenEnum.PCReal, lexema);
                } else if(lexema.equals("PCAtribuir")){
                    return new Token(TokenEnum.PCAtribuir, lexema);
                } else if(lexema.equals("A")){
                    return new Token(TokenEnum.PCA, lexema);
                } else if(lexema.equals("PCLer")){
                    return new Token(TokenEnum.PCLer, lexema);
                }
            }
        }
    }

    private Token fim(){
        int caracter = leitor.proxCaracter();
        if (caracter == -1) {
            return new Token(TokenEnum.Fim, "Fim");
        }
        return null;
    }

    private Token operadorRel () {
            int caracter = leitor.proxCaracter();
            char c = (char) caracter;

            if (c == '!') {
                c = (char) leitor.proxCaracter();
                if (c == '=') {
                    return new Token(TokenEnum.OpRelDif, "!=");
                }
            } else if (c == '>') {
                c = (char) leitor.proxCaracter();
                if (c != '=') {
                    return new Token(TokenEnum.OpRelMaior, ">");
                }
                leitor.retroceder();
                return new Token(TokenEnum.OpRelMaiorIgual, ">=");
            } else if (c == '<') {
                c = (char) leitor.proxCaracter();
                if (c != '=') {
                    return new Token(TokenEnum.OpRelmenor, "<");
                }
                leitor.retroceder();
                return new Token(TokenEnum.OpRelMenorIgual, "<=");
            } else if (c == '=') {
                c = (char) leitor.proxCaracter();
                if (c != '=') {
                    return new Token(TokenEnum.PcDeclaracoes, "=");
                }
                return new Token(TokenEnum.OpRelIgual, "==");
            }
            return null;
        }

    }
