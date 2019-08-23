package exemplo_abstrato;

public class Horista extends Funcionario {
	// Atributos
	private int horas; // qtd de horas trabalhadas no mes
	private double valorhora; // vlr ganho por hora trabalhada
		
	
	public Horista(int codigo, String nome, int horas, double valorhora) {
		super(codigo, nome);
		this.horas = horas;
		this.valorhora = valorhora;
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorhora() {
		return valorhora;
	}
	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}

	@Override
	public double calcsalario() {
		// TODO Auto-generated method stub
		return horas * valorhora;
	}

	@Override
	public String toString() {
		return "Horista [ + " + super.toString() + "\n horas=" + horas + ", valorhora=" + String.format("R$2f", valorhora) +
				", salario=" + String.format("R$ %.2f", calcsalario()) + "]";
	}

	
	
	
}
