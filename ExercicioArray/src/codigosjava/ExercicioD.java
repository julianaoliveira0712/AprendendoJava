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
 * @author JULIANASOU, 30 de jul de 2019, 11:25:22
 */// </editor-fold>
public class ExercicioD {
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {
        
        String mostrarResultado = "";
        
        Scanner sc = new Scanner(System.in);

        int[] numerosA = new int[15];
        int[] numerosB = new int[15];
      


        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um número na matriz A");
            numerosA[i] = sc.nextInt();
            numerosB[i] = numerosA[i]* numerosA[i];


        }


       for (int cont = 0; cont < 15; cont++) {
            mostrarResultado += "[" + cont +  "]"+ numerosA[cont] + " - " + "[" + cont + "]"+numerosB[cont]+"\n";
        }
       
        System.out.println(mostrarResultado); 
 
        
        
        
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    
    //</editor-fold>
    
}//class
