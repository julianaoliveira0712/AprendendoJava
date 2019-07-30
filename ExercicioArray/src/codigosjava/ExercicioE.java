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
 * @author JULIANASOU, 30 de jul de 2019, 11:42:00
 */// </editor-fold>
public class ExercicioE {
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {
        
        String mostrarResultado = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\nQuantas números FATORIAIS você quer digitar?  ");
        int qtdNumerosLidos = sc.nextInt();
        System.out.print("\n");

        int[] numeroFatorial = new int[qtdNumerosLidos];
        int[] resultadoFatorial = new int[qtdNumerosLidos];
        
        for (int cont = 0; cont < qtdNumerosLidos; cont++) {
            System.out.print( (cont + 1) + "º Fatorial: ");
            numeroFatorial[cont] = sc.nextInt();
            resultadoFatorial[cont] = calcularFatorial(numeroFatorial[cont]);
        }
        
        for (int cont = 0; cont < qtdNumerosLidos; cont++) {
            mostrarResultado += "[" + cont + "] - " + numeroFatorial[cont] + "!  = " + resultadoFatorial[cont] + "\n";
        }
        
        System.out.println(mostrarResultado);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        int auxiliar = 0;
//        int fat=1;
//        int conti = 1;
//

//        for (int i = 1; i < 4; i++) {
//            System.out.println("Digite um número na matriz A");
//            numerosA[i] = sc.nextInt();
//            
//           
//        }
//         for (int j = 1; j <= numerosA[conti]; j++) {
//                fat += fat*j;
//               // numerosB[j]=fat;
//                    System.out.println(fat);
//
//            }
//            
//       for (  int cont = 1; cont < 4; cont++) {
//            mostrarResultado += "[" + cont +  "]"+ numerosA[cont] + " - " + "[" + cont + "]"+numerosB[cont]+"\n";
//        }
//    
//        System.out.println(mostrarResultado); 
// 
      /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
        System.out.println(calcularFatorial(4));
        
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    public static int calcularFatorial(int numeroFatorial){
        
        int resultado = 1;
        
        for (int contNum = 1; contNum <= numeroFatorial; contNum++) {
//            resultado = resultado * contNum;
            resultado *= contNum;
        }
        
        return resultado;
    }
    //</editor-fold>
    
}//class
