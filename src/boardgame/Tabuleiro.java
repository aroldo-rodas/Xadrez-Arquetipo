package boardgame;

public class Tabuleiro {
    //Atributos
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    //Construtor
    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    //Getters e Setters
    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    //Métodos
    public Peca peca(int linha, int coluna) {
        return pecas[linha][coluna];
    }
    
    public Peca peca(Posicao posicao) {
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void posicaoPeca(Peca peca, Posicao posicao) {
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    

    
}
