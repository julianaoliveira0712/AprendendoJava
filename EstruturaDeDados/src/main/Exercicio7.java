package main;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] numeros= new int[] {3, 2, 1, 2, 32, 123, 23, 12, 32, 12, 2,3 ,0 ,3, 3, 5, 6, 7, 8, 9, 9, 0};
        int[] numeros2= new int[2];
        int[] auxiliar= new int[2];

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite um numero:");
//            numeros[i]= leitor.nextInt();
//            System.out.println("Digite um numero:");
//            numeros2[i]= leitor.nextInt();
//        }

        numeros = ordenarArray(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }
    }

    public static int[] ordenarArray(int[] array) {
//        while (true) {
//            boolean mudou = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    if(j + 1 < array.length) {
                        if(array[i] > array[j + 1]) {
//                        mudou = true;
                            int a = array[i];
                            int b = array[j + 1];
                            array[i] = b;
                            array[j + 1] = a;
                        }
                    }
                }
            }

//            if(!mudou)
//                break;
//        }
        return array;
    }
}
