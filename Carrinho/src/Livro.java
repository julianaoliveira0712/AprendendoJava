
public class Livro extends Produto {
	
	String nome;
	String autor;
	String isbn;
	
	public Livro(int codigo, double precoCusto, String nome, String autor, String isbn) {
		super(codigo, precoCusto);
		// TODO Auto-generated constructor stub
		this.nome=nome;
		this.autor =autor;
		this.isbn =isbn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public double getValorVenda() {
		// TODO Auto-generated method stub
		return precoCusto += (10*precoCusto)/100;	
	}
	
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", isbn=" + isbn + ", codigo=" + codigo + ", precoCusto="
				+ precoCusto + ", getValorVenda()=" + getValorVenda() + "]";
	}
	
	

}
