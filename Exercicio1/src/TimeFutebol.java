
public class TimeFutebol {
	String nome;
	int empate=1;
	int vitoria=3;
	int derrota=0;
	int ponto=0;
	int contempate=0;
	int contderrota =0;
	int contVitoria=0;
	
	public TimeFutebol(String nome) {
		super();
		this.nome = nome;
	}


	public int getEmpate() {
		return empate;
	}


	public int getVitoria() {
		return vitoria;
	}


	public int getDerrota() {
		return derrota;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}
	
	public void registrarVitoria() {
		contVitoria++;
	}
	
	public void registrarEmpate() {
		 contempate++;
	}
	
	public void registrarDerrota() {
		 contderrota++;
	}
	
	public int getPontuacao() {
		return ponto = (contVitoria * 3) +contempate;
	}
	
	public String isInvicto() {
		return contderrota == 0 ? "sim": "não";
			
		
	}


	@Override
	public String toString() {
		return "TimeFutebol [nome:" + nome + "\n empates:" + contempate + "\n vitorias:" + contVitoria + "\n derrotas:" + contderrota
				+ "\n total de pontos:" + getPontuacao() + "\n invencibilidade:" + isInvicto()+ "]";
	}
	
	
}
