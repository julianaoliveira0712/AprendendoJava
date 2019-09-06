package canoa;

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author JULIANASOU, 6 de set de 2019, 10:23:36
 */// </editor-fold>
public class AdministracaoPartida {

    //<editor-fold defaultstate="collapsed" desc="attributes...">
    Jogador player1;
    Jogador player2;

    //    <editor-fold defaultstate="collapsed" desc="main attributes...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="constants attributes...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="static attributes...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    //    </editor-fold>
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors...">
    public AdministracaoPartida(Jogador player1, Jogador player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="methods...">
    //    <editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="override methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="static methods...">
    //    </editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="main methods...">
    public void mensagemEmpate() {
        System.out.println("A partida acabou empatada entre " + player1.nickname + " e " + player2.nickname);
    }

    public void mensagemVitoriaPlayer1() {
        System.out.println("O vencedor foi: " + player1.nickname);
    }

    public void mensagemVitoriaPlayer2() {
        System.out.println("O vencedor foi: " + player2.nickname);
    }

    public boolean terminouJogo() {
        return player1.canoa.estaDestruida() || player2.canoa.estaDestruida();
    }

    public boolean turno(int posicaoCanoa1, int posicaoCanoa2, int posicaoTiro1, int posicaoTiro2) {
        //movendo canoas
        player1.rio.posicionarCanoaNoRio(posicaoCanoa1);
        player2.rio.posicionarCanoaNoRio(posicaoCanoa2);
        
        //dando tiros
        player1.rio.receberTiro(posicaoTiro1);
        player2.rio.receberTiro(posicaoTiro2);
        
        //atualizando canoas
        player1.rio.atualizarCanoa();
        player2.rio.atualizarCanoa();
        
        //validando e fechamento turno
        return terminouJogo();
    }
    //    </editor-fold>

    //</editor-fold>
}//class
