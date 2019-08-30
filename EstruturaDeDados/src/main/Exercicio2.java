package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String[] nomes= new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um nome:");
            nomes[i]= leitor.nextLine();
            }

        System.out.println("digite um nome:");
        String nome = leitor.next();
        boolean achou = false;

        for (int i = 0; i < nomes.length-1 ; i++) {
            if(nomes[i].equals(nome)){
               achou = true;
                System.out.println("o nome "+ nome+ " está na lista, na posição:"+ i);
            }
        }

        if(!achou){
            System.out.println("nome inexistente");
        }
    }
}
