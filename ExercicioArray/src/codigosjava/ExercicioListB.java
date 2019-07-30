package codigosjava;

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
 * @author JULIANASOU, 30 de jul de 2019, 11:04:14
 */// </editor-fold>
public class ExercicioListB {
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {
        String mostrarResultado = "";
        
        Scanner sc = new Scanner(System.in);

        int[] numerosA = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número");
            numerosA[i] = sc.nextInt();

        }

        int[] numerosB = new int[8];

        for (int j = 0; j < 8; j++) {

            numerosB[j] = numerosA[j] * 3;

        }

       for (int cont = 0; cont < 8; cont++) {
            mostrarResultado += "[" + cont +  "]"+ numerosA[cont] + " - " + "[" + cont + "]"+numerosB[cont]+ "\n";
            

        }
        System.out.println(mostrarResultado); 
 

        
        
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    
    //</editor-fold>
    
}//class
