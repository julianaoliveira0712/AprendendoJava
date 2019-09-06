package canoa;

// <editor-fold defaultstate="collapsed" desc="imports...">
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author JULIANASOU, 6 de set de 2019, 08:24:04
 */// </editor-fold>
public class PlayGame {
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {
    
       Canoa canoa1 = new Canoa("canoazinha", 3);
       Canoa canoa2 = new Canoa("canoaLegal", 3);
       Rio rio1 = new Rio(10, canoa1);
       Rio rio2 = new Rio(10, canoa2);
       Jogador jogador1 = new Jogador("tiago", canoa1, rio1);
       Jogador jogador2 = new Jogador("ju", canoa2, rio2);
       AdministracaoPartida novaPartida = new AdministracaoPartida(jogador1, jogador2);
       
       do{
           novaPartida.turno(3, 4, 2, 4);
       }while(novaPartida.terminouJogo());

    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    
    //</editor-fold>
    
}//class
