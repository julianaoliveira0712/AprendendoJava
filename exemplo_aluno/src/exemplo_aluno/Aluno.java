package exemplo_aluno;

public abstract class Aluno {
	private String nome;
	private String RA;
	
	
	// metodos
	public Aluno(String nome, String RA) {
		super();
		this.nome = nome;
		this.RA = RA;
	}
	
	public abstract double calculaMedia();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String RA) {
		this.RA = RA;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + "]";
	}
	
	
	
	
	
	
	
	
}
