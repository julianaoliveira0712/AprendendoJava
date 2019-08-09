package exercicio2;

public class Retangulo extends Figura {
	
	double altura;
	double largura;
	
	@Override
	public double calculaArea() {
		return altura * largura;
	}

	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", largura=" + largura + ", cor=" + cor + ", espContorno=" + espContorno
				+ ", calculaArea()=" + calculaArea() + "]";
	}
	
	
}
