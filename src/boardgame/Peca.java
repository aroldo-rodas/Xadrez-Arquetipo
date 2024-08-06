package boardgame;

public class Peca {
    //Atributos
    protected Posicao posicao;
    private Tabuleiro tabuleiro;
    
    //Construtores
    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    //Getter
    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
