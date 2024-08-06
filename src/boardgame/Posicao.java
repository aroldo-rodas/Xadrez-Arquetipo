package boardgame;

public class Posicao {
    //Atributos
    private int linha;
    private int coluna;

    //Construtor
    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    //Getters e Setters
    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    //Métodos
    @Override
    public String toString() {
        return this.linha + ", " + this.coluna;
    }
}
