package exemplo_abstrato;

public class Vendedor extends Funcionario {
	// atributos
	private double vendas; // valor das vendas realizadas no mes
	private double taxa;  // taxa de comissão ganho sobre as vendas
	private static int contVendedor = 0;
	
	
	// Constructor
	public Vendedor(int codigo, String nome, double vendas, double taxa) {
		super(codigo, nome);
		this.vendas = vendas;
		this.taxa = taxa;
		contVendedor++;
	}

	
	// metodos 
	
	
	
	@Override
	public double calcsalario() {
		return vendas * taxa;
	}

	public static int getContVendedor() {
		return contVendedor;
	}


	@Override
	public String toString() {
		return "Vendedor [" + super.toString() + "vendas=" + vendas + ", taxa=" + taxa + "salario=" + calcsalario() + "]";
	}


	public double getVendas() {
		return vendas;
	}
	


	public void setVendas(double vendas) {
		this.vendas = vendas;
	}


	public double getTaxa() {
		return taxa;
	}


	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	
	
}
