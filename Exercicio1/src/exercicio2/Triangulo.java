package exercicio2;

public class Triangulo extends Figura{

	double base;
	double altura;
	
	@Override
	public double calculaArea() {
		return (base * altura) / 2;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", cor=" + cor + ", espContorno=" + espContorno
				+ ", calculaArea()=" + calculaArea() + "]";
	}
	
	
}
