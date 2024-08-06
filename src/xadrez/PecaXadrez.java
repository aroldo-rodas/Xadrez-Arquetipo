package xadrez;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class PecaXadrez extends Peca{
    //Atributos
    private Cor cor;

    //Construtor
    public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    //Getter
    public Cor getCor() {
        return cor;
    }

    
    
}
