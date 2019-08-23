
public class Servico implements Vendavel{
	
	String descricao;
	int codigo;
	int qtdHoras;
	double valorHora;
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	@Override
	public double getValorVenda() {
		// TODO Auto-generated method stub
		
		return qtdHoras*valorHora;
	}

	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", codigo=" + codigo + ", qtdHoras=" + qtdHoras + ", valorHora="
				+ valorHora + ", getValorVenda()=" + getValorVenda() + "]";
	}
	
	
	
	
}
