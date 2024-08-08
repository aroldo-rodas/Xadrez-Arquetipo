package boardgame;

public class Tabuleiro {
    //Atributos
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    //Construtor
    public Tabuleiro(int linhas, int colunas) {
        if(linhas < 1 || colunas < 1) {
            throw new BoardExceptions("Erro criando tabuleiro");
        }
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

    //Métodos
    public Peca peca(int linha, int coluna) {
        if(!posicaoExite(linha, coluna)) {
            throw new BoardExceptions("Posicao nao existe!");
        }
        return pecas[linha][coluna];
    }
    
    public Peca peca(Posicao posicao) {
        if(!posicaoExite(posicao)) {
            throw new BoardExceptions("Posicao nao existe!");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void posicaoPeca(Peca peca, Posicao posicao) {
        if(existeUmaPeca(posicao)) {
            throw new BoardExceptions("Existe uma peca na posição!");
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    private boolean posicaoExite(int linha, int coluna) {
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }

    public boolean posicaoExite(Posicao posicao) {
        return posicaoExite(posicao.getLinha(), posicao.getColuna());
    }
    
    public boolean existeUmaPeca(Posicao posicao) {
        if(!posicaoExite(posicao)) {
            throw new BoardExceptions("Posicao nao existe!");
        }
        return (peca(posicao) != null);
    }
}
