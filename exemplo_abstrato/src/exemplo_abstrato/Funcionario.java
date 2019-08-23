package exemplo_abstrato;

public abstract class Funcionario {
	// Atributos
	private int codigo;
	private String nome;
	
	// Constructor
	public Funcionario(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	
	
	
	// metodos
	
	// metodos abstratos
	
	public abstract double calcsalario();
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\n Funcionario [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	
}
