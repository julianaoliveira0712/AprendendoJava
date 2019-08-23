package exemplo_aluno;

public class AlunoGraduacao extends Aluno {
	private double nota1;
	private double nota2;
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	
	public AlunoGraduacao(String nome, String RA, double nota1, double nota2) {
		super(nome, RA);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	@Override
	public String toString() {
		return "Aluno: " + super.toString() + "\n Aluno Graduação: " + "\n notas: \n " + "Nota 1= " + nota1 + 
				"Nota 2 =" + nota2 + 
				"Média: " + calculaMedia();
	}
	
	@Override
	public double calculaMedia() {
		// TODO Auto-generated method stub
		return this.nota1 + this.nota2 / 2;
	}
	
	
	
	
	
	
	
	
}
