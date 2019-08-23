package exemplo_abstrato;

public class exemplo_abstrato {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor(1234 , "Roberval", 15000, 0.10);
		System.out.println(v1);
		
		Vendedor v2 = new Vendedor(4567, "Jonas" , 30000 , 0.20);
		
		Horista h1 = new Horista(5678 , "Maria Oliveira" , 40,10);
		System.out.println(h1);
		
		System.out.println("Numero de vendedores= " + Vendedor.getContVendedor());
	}

}
