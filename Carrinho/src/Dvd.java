
public class Dvd extends Produto{
	
	String nome;
	String gravadora;
	
	public Dvd(int codigo, double precoCusto, String nome, String gravadora) {
		super(codigo, precoCusto);
		this.nome = nome;
		this.gravadora = gravadora;
	}
	@Override
	public double getValorVenda() {
		// TODO Auto-generated method stub
		return precoCusto += (20*precoCusto)/100;	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	@Override
	public String toString() {
		return "Dvd [nome=" + nome + ", gravadora=" + gravadora + ", getValorVenda()=" + getValorVenda() + "]";
	}
	
	
	
}
