public class AnalisadorLexico {
    Leitor leitor;

    public AnalisadorLexico(String arquivo){
        leitor = new Leitor(arquivo);
    }

    public Token proximoToken() {
        int caracterlido = -1;

        while ((caracterlido = leitor.proxCaracter()) != -1) {
            char c = (char) caracterlido;
            if (c == ' ' || c == '\n') continue;

            if (c == ':') {
                return new Token(TokenEnum.Delim, ":");
            } else if (c == '*') {
                return new Token(TokenEnum.OpAritMult, "*");
            } else if (c == '/') {
                return new Token(TokenEnum.OpAritDiv, "/");
            } else if (c == '-'){
                return new Token(TokenEnum.OpAritSub, "-");
            } else if (c == '('){
                return new Token(TokenEnum.AbrePar, "(");
            } else if (c == ')'){
                return new Token(TokenEnum.FechaPar, ")");
            }
            else if (c == '!'){
                c = (char) leitor.proxCaracter();
                if(c == '='){
                    return new Token(TokenEnum.OpRelDif, "!=");
                }
            } else if (c == '>'){
                c = (char) leitor.proxCaracter();
                if(c != '='){
                    return new Token(TokenEnum.OpRelMaior, ">");
                }
                leitor.retroceder();
                return new Token(TokenEnum.OpRelMaiorIgual, ">=");
            } else if (c == '<'){
                c = (char) leitor.proxCaracter();
                if(c != '='){
                    return new Token(TokenEnum.OpRelmenor, "<");
                }
                leitor.retroceder();
                return new Token(TokenEnum.OpRelMenorIgual, "<=");
            }

        }
        return null;
    }
}
