package vetor;

import java.util.Scanner;

public class Exemplovetor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
//		public void exibirVetor(int[] vetor) {
//			for(int i=0; i<vetor.length; i++) {
//				System.out.println(vetor[i]);
//			}	
//		}
		
		String[] meses;
		int mes=12;
		
		for (int i = 0; i < mes; i++) {
			System.out.println("Qual dia do ano?");
			meses[i] =leitor.nextLine();
			
		}
		
		
	}
}
