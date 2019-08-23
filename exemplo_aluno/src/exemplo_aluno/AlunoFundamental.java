package exemplo_aluno;

public class AlunoFundamental extends Aluno {
	//
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public AlunoFundamental(String nome, String RA, double nota1, double nota2, double nota3, double nota4) {
		super(nome, RA);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	// Métodos
	@Override
	public double calculaMedia() {
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno: " + super.toString() + "\n Aluno Fundamental: " + "\n notas: \n " + "Nota 1= " + nota1 + 
				"Nota 2 =" + nota2 + 
				"Nota 3" + nota3 + 
				"Média: " + calculaMedia();
	}
	
	
	
}
