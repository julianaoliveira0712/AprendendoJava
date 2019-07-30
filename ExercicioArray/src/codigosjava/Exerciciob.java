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
 * @author JULIANASOU, 30 de jul de 2019, 10:44:28
 */// </editor-fold>
public class Exerciciob {
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<Integer> numerosB = new ArrayList();
        int num =0;
        int multiplicar =0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um valor inteiro:");
            num= leitor.nextInt();
            numeros.add(num);
            multiplicar = num*3;
            
            numerosB.add(multiplicar);
        }
        System.out.println("Vetor A:"+numeros+"\n"+
                           "Vetor B:"+ numerosB);
        
        
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    
    //</editor-fold>
    
}//class
