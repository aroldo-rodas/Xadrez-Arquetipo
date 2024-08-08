package xadrez;

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

    private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) {
        tabuleiro.posicaoPeca(peca, new PecaPosicao(coluna, linha).toPosition());
    }

    private void iniciarPartida() {
        colocarNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
        colocarNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
    }
}
