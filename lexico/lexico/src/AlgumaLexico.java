import java.io.*;

public class AlgumaLexico {

    public AlgumaLexico(String arg) {
    }

    public static void main(String[] args) {
       AnalisadorLexico lex = new AnalisadorLexico(args[0]);
       Token t = null;

       while((t = lex.proximoToken()) != null) {
           System.out.print(t);
       }

    }
}
