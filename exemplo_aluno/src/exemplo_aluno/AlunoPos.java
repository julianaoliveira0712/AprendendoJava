package exemplo_aluno;

public class AlunoPos extends Aluno {
	private double nota1;
	private double nota2;
	private double notaMonografia;
	
	public AlunoPos(String nome, String RA, double nota1, double nota2, double notaMonografia) {
		super(nome, RA);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaMonografia = notaMonografia;
	}

	@Override
	public double calculaMedia() {
		return (this.nota1 + this.nota2 + this.notaMonografia) / 3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno: " + super.toString() + " \n Aluno Pós: " + "\n notas: \n " + "Nota 1= " + nota1 + 
				"Nota 2 =" + nota2 + 
				"Nota Monografia" + notaMonografia + 
				"Média: " + calculaMedia();
	}
}
