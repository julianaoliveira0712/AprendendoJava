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
 * @author JULIANASOU, 5 de set de 2019, 09:00:33
 */// </editor-fold>
public class OldCanoaExecutavel {

    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    //</editor-fold>
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {

        String nickname1 = "";
        String nickname2 = "";
        boolean[] canoa1 = new boolean[2];
        boolean[] canoa2 = new boolean[2];
        boolean[] rio1 = new boolean[10];
        boolean[] rio2 = new boolean[10];
        int posicao = 0;
        int tiro = 0;
        int cont1 = canoa1.length;
        int cont2 = canoa2.length;
        boolean desclassificado1 = false;
        boolean desclassificado2 = false;
        boolean fim = false;

        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        for (int i = 0; i < canoa1.length; i++) {
            canoa1[i] = true;
        }
        //System.out.println(canoa1[1]);

        for (int i = 0; i < canoa2.length; i++) {
            canoa2[i] = true;
        }
        //System.out.println(canoa2[2]);

        System.out.println("Qual o nick do jogador 1 ?");
        nickname1 = leitor.nextLine();

        System.out.println("Qual o nick do jogador 2 ?");
        nickname2 = leitor.nextLine();

        while ( fim != true) {
            if (cont1 == 0) {
                desclassificado1 = true;
            }
            if (cont2 == 0) {
                desclassificado2 = true;
            }
            if (desclassificado1 == true && desclassificado2 == true) {
                System.out.println("A competição acabou empatada!!!");
                fim = true;
                break;

            } else if (desclassificado1 == false && desclassificado2 == true) {
                System.out.println("O Player2 foi eliminado. O campeão foi o jogador " + nickname1);
                fim = true;
                break;

            } else if (desclassificado1 == true && desclassificado2 == false) {
                System.out.println("O Player1 foi eliminado. O campeão foi o jogador " + nickname2);
                fim = true;
                break;
            }

            System.out.println("Próxima rodada");

            System.out.println(" Player 1: Onde você quer posicionar a canoa?");
            posicao = leitor2.nextInt();
            for (int j = 0;j < canoa1.length ; j++) {
                rio1[posicao] = canoa1[j];
                posicao++;
            }

            System.out.println("Player 2: Onde você quer posicionar a canoa?");
            posicao = leitor2.nextInt();
            for (int j = 0;j < canoa2.length ; j++) {
                rio2[posicao] = canoa2[j];
                posicao++;
            }

            System.out.println("Player 1: Onde você quer atirar?");
            tiro = leitor2.nextInt();
            if (rio2[tiro]) {
                rio2[tiro] = false;
                for (int i = 0; i < canoa2.length; i++) {
                    canoa2[i] = rio2[tiro];
                    tiro++;
                }
                for (int j = 0; j < canoa2.length; j++) {
                    if (canoa2[j] == false) {
                        cont2--;

                    }
                }
            }

            System.out.println("Player 2: Onde você quer atirar?");
            tiro = leitor2.nextInt();
            if (rio1[tiro] == true) {
                rio1[tiro] = false;
                 for (int i = 0; i < canoa1.length; i++) {
                    canoa1[i] = rio1[tiro];
                    tiro++;
                }
                for (int k = 0; k < canoa1.length; k++) {
                    if (canoa1[k] == false) {
                        cont1--;
                        System.out.println("Total de partes da canoa 1 :"+cont1);
                        System.out.println("Total de partes da canoa 2 :"+cont2);

                    }

                }
            }
        }

    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    public static void exibirStatusCanoa(int indiceCanoa, boolean[] canoa) {
        String desenho = "Canoa " + indiceCanoa + "\n+---+---+---+---+\n";

        for (int cont = 0; cont < canoa.length; cont++) {
            desenho += "|" + (canoa[cont] ? " x " : "   ");
        }

        desenho = "|\n+---+---+---+---+\n";
    }
    
//    public static void resultado(){
//        
//    }
//    public static void colocandoCanoaNoRio(boolean[] canoa, boolean rio, int posicaoRio){
//        for (int i = 0; i < canoa.length; i++) {
//        rio[posicaoRio] = canoa[0];
//
//        }
//    }
    //</editor-fold>

}//class
