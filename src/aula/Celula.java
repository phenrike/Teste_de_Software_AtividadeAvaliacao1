package aula;

public class Celula {
	private String nome;
	private Celula anterior;
	private Celula proxima;

	Celula(String nome) throws Exception {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			throw new Exception("Parâmetro inválido");
		}
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public Celula getProxima() {
		return proxima;
	}

	public String getNome() {
		return nome;
	}
}