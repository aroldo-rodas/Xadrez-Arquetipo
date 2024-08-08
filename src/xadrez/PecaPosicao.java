package xadrez;

import boardgame.Posicao;

public class PecaPosicao {
    //Atributos
    private char coluna;
    private int linha;

    //Construtor
    public PecaPosicao(char coluna, int linha) {
        if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
            throw new XadrezException("Valor inválido!");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    //Getters
    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
    
    protected Posicao toPosition() {
        return new Posicao(8 - linha, coluna - 'a');
    }
    
    protected static PecaPosicao fromPosition(Posicao posicao) {
        return new PecaPosicao((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
    }

    @Override
    public String toString() {
        return "" + coluna + linha;
    }
}
