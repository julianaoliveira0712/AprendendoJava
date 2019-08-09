package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Figura {
	String cor;
	double espContorno;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getEspContorno() {
		return espContorno;
	}
	public void setEspContorno(double espContorno) {
		this.espContorno = espContorno;
	}
	
	public double pedirValor(String texto) {
		System.out.println(texto);
		
		return 0;
	}
	
//	public double valor() {
//		System.out.println("Quantos medidas é necessaria para calcular a area?");
//		Scanner leitor = new Scanner(System.in);
//		double qtdmedida = leitor.nextDouble();
//		ArrayList<Double> medidas = new ArrayList<>();
//		
//			for (int i = 0; i < qtdmedida ; i++) {
//				System.out.println("Insira uma medida medida[i]:");
//				medidas.add(leitor.nextDouble());
//			
//		}
//		return 0;
//	}
	
	public abstract double calculaArea();
}
