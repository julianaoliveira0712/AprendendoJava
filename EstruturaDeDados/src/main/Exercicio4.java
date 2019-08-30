package main;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int diaAno=0;
        int mesAno=0;
        int[] meses= new int[]{30,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("digite um dia de 1 a 31:");
        int dia = leitor.nextInt();

        System.out.println("digite um mes de 1 a 12:");
        int mes = leitor.nextInt();

        for (int i = 0; i <  mes - 1; i++) {
            mesAno += meses[i];
        }

        diaAno = mesAno+dia;

        System.out.println("O dia é "+ dia+ " é o dia "+ diaAno+ " do mês");

    }
}
