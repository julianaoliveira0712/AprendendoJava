package exercicio2;

public class Quadrado extends Figura {

	double lado;

	@Override
	public double calculaArea() {
		return lado * lado;
	}

	
	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", cor=" + cor + ", espContorno=" + espContorno + ", calculaArea()="
				+ calculaArea() + "]";
	}

}
