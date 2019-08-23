import java.util.ArrayList;


public class Carrinho {

	ArrayList<Vendavel> cart;
	
	public void iniciador() {
		cart= new ArrayList<Vendavel>();
	}
	
	public void adicionaVendavel(Vendavel v) {
		cart.add(v);
	}
	
	public void exibeTributavel () {
		System.out.println("\nLista de carros:");
		for (Vendavel v: cart) {
			System.out.println(v);
		}
	}
	
	public double CalculaTotalVenda() {
		double total =0;
		for(Vendavel v: cart) {
			total += v.getValorVenda();
		}
		return total;
	}
}
