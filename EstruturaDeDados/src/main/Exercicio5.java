package main;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] numeros= new int[10];
        int cont=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            numeros[i]= leitor.nextInt();
        }

        System.out.println("Digite um numero qualquer:");
        int numeroqlq = leitor.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if(numeroqlq == numeros[i]){
                cont++;
            }
        }
        System.out.println("o numero "+ numeroqlq + " aparece "+ cont + "vezes");
    }

}
