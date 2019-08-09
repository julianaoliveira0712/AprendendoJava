package exercicio2;

public class Circulo extends Figura {

	double r;
	
	@Override
	public double calculaArea() {
		return (2 * Math.PI) * r;
	}

	@Override
	public String toString() {
		return "Circulo [r=" + r + ", cor=" + cor + ", espContorno=" + espContorno + ", calculaArea()=" + calculaArea()
				+ "]";
	}
	
	
}
