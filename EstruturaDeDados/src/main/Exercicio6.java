package main;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        String[] carros= new String[5];
        int[] consumo= new int[5];
        int menor=10000000;
        int indice=0;

        for (int i = 0; i < carros.length; i++) {
            System.out.println("Digite um nome de carro:");
            carros[i] = leitor.nextLine();
            System.out.println("Digite o consumo desse carro:");
            consumo[i] = leitor2.nextInt();
        }

        for (int i = 0; i < consumo.length; i++) {
            if(consumo[i] < menor ){
                menor = consumo[i];
                indice =i;
            }
        }
        System.out.println("O carro mais economico é "+carros[indice]+" com o consumo de "+ menor);


    }
}
