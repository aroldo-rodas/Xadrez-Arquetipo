package xadrez;

import boardgame.Tabuleiro;

public class PartidaXadez {
    //Atributos
    private Tabuleiro tabuleiro;

    //Construtor
    public PartidaXadez() {
        this.tabuleiro = new Tabuleiro(8, 8);
    }

    //Métodos
    public PecaXadrez[][] getPecas() {
        PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];

        //Faz um Downcasting das peças, interpretar como peça de xadrez ao invés de peça comum
        for(int i = 0; i < tabuleiro.getLinhas(); i++) {
            for(int j = 0; j < tabuleiro.getColunas(); j++) {
                matriz[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }

        return matriz;
    }

}
