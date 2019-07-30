// <editor-fold defaultstate="collapsed" desc="cabeçalho de código...">
package codigosjava; //esse é nome da "pasta" que seu código está, pois assim tudo fica mais organizado

import static entradasaida.JanelaPopup.*;
import static ferramentas.Conversoes.*;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArrayA {

    public static void main(String[] args) {
        String nome;
        ArrayList<String> nomes = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        int cont =0;
        
        for (int i = 0; i < 10; i++) {
             System.out.println("Qual seu nome?");
            nome = leitor.nextLine();
            nomes.add(nome);
        
        }
          
                   System.out.println(nomes);

       
        
        
        
        
        
        //seu código termina aqui :0     
// <editor-fold defaultstate="collapsed" desc="rodapé de código...">
        println("\n\n\n     [Fim] :) -----------------------------------------------------------------------------------------------------------\n\n");
    }//métdo main
}//classe Executavel
// </editor-fold>
