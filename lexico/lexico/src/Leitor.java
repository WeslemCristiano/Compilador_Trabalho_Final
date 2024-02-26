import java.io.*;

public class Leitor {

    InputStream is;
    int tam_buffer = 30;
    int[] bufferLeitura;
    int ponteiro;
    int bufferAtual;
    int inicioLexema;
    String lexema;
    public Leitor(String arquivo) {
        try {
            is = new FileInputStream(new File(arquivo));
            inicializarBuffer();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro ao ler arquivo: " + ex);
        }
    }

    private void inicializarBuffer(){
        bufferAtual = 2;
        inicioLexema = 2;
        lexema = "";
        ponteiro = 0;
        bufferLeitura = new int[tam_buffer * 2];
        recarregarBuffer();
    }

    private void recarregarBuffer(){
        if(bufferAtual == 2) {
            bufferAtual = 1;

            for (int i = 0; i < tam_buffer; i++) {
                try {
                    bufferLeitura[i] = is.read();
                    if (bufferLeitura[i] == -1) {
                        break;
                    }
                } catch (IOException ex) {
                    System.out.println("nao foi possivel recarregar o ponteiro: " + ex);
                }
            }
        }
    }

    private void recarregarBuffer2(){
        if(bufferAtual == 1) {
            bufferAtual = 2;

            for (int i = tam_buffer; i < tam_buffer * 2; i++) {
                try {
                    bufferLeitura[i] = is.read();
                    if (bufferLeitura[i] == -1) {
                        break;
                    }
                } catch (IOException ex) {
                    System.out.println("nao foi possivel recarregar o buffer: " + ex);
                }
            }
        }
    }

    private void incrementarPonteiro(){
        ponteiro++;
        if(ponteiro == tam_buffer){
            recarregarBuffer2();
        } else if (ponteiro == tam_buffer * 2) {
            recarregarBuffer();
            ponteiro = 0;
        }
    }

    private int proxCaracterBuffer() {
        int ret = bufferLeitura[ponteiro];
        System.out.print(this);
        incrementarPonteiro();
        return ret;
    }

    public int proxCaracter() {
        int c = proxCaracterBuffer();
        lexema += (char)c;
        return c;
    }

    public void retroceder(){
        ponteiro--;
        lexema = lexema.substring(0, lexema.length() - 1);
        if(ponteiro < 0){
            ponteiro = tam_buffer * 2 - 1;
        }
    }

    public void zerar() {
        ponteiro = inicioLexema;
        lexema = "";
    }

    public void confirmar(){
        inicioLexema = ponteiro;
        lexema = "";
    }

    public String getLexema(){
        return lexema;
    }

    @Override
    public String toString(){
        String ret = "Buffer:[";
        for(int i : bufferLeitura){
            char c = (char) i;
            if(Character.isWhitespace(c)){
                ret += ' ';
            } else {
                ret += (char) i;
            }
        }
        ret += "]\n";
        ret += "       ";
        for(int i = 0; i < tam_buffer * 2; i++){
            if(i == inicioLexema && i == ponteiro){
                ret += "%";

            }else if (i == inicioLexema){
                ret += "^";
            } else {
                ret += " ";
            }
        }
        return ret;
    }
}
