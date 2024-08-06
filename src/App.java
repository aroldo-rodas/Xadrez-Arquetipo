import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.PartidaXadez;

public class App {
    public static void main(String[] args) throws Exception {
        PartidaXadez partidaXadez = new PartidaXadez();
        UI.printTabuleiro(partidaXadez.getPecas());
    }
}
