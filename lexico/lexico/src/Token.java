public class Token {
    public TokenEnum nome;
    public String lexema;

    public Token(TokenEnum nome, String lexema) {
        this.nome = nome;
        this.lexema = lexema;
    }

    @Override
    public String toString() {
        return "< "+nome+","+lexema+" >";
    }
}
