package main;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int media=0;
        int total=0;
        Scanner leitor = new Scanner(System.in);
        int[] numeros= new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um numero:");
            numeros[i]= leitor.nextInt();
            total += numeros[i];
        }
            media = total/ numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]> media){
                System.out.println("nota:"+ numeros[i]+" está acima da média");
            }
        }

        System.out.println("A média é:"+media);


    }
}
