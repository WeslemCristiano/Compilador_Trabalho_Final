package compilador;

import lexico.GramaticaCompilador;
import org.antlr.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        GramaticaCompilador lex = new GramaticaCompilador(cs);

        while(lex.nextToken().getType() != Token.EOF){
            System.out.println("Ola");
        }
    }
}
