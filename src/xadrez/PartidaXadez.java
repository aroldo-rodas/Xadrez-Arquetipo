package xadrez;

import java.awt.Color;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import pecas.Rei;
import pecas.Torre;

public class PartidaXadez {
    //Atributos
    private Tabuleiro tabuleiro;

    //Construtor
    public PartidaXadez() {
        this.tabuleiro = new Tabuleiro(8, 8);
        iniciarPartida();
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

    private void iniciarPartida() {
        tabuleiro.posicaoPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
        tabuleiro.posicaoPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0, 4));
        tabuleiro.posicaoPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7, 4));
    }
}
