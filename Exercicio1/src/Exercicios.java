
public class Exercicios {
	
	public static void main(String[] args) {
		TimeFutebol novotime = new TimeFutebol("Palmeiras");
		novotime.registrarVitoria();
		novotime.registrarVitoria();
		novotime.registrarEmpate();
		novotime.registrarVitoria();
		novotime.registrarVitoria();
		novotime.registrarEmpate();
		novotime.registrarEmpate();
		
		System.out.println(novotime.toString());
	}
}
