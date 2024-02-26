lexer grammar GramaticaCompilador;

Letra: 'a'..'z'|'A'..'Z';
Digito: '0'..'9';
PCAlgoritmo: 'ALGORITMO';
Variavel: Letra (Letra | Digito)* {System.out.println("[Var," + getText()+" ] ");};


