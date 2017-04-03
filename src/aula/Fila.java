package aula;

public class Fila {
	private Celula primeira, ultima;

	public void add(String nome) throws Exception {
		Celula celula = new Celula(nome);
		/* quando a fila está vazia */ 
		if (primeira == null) {
			primeira = celula;
			ultima = celula;
		} /* quando existe somente um ou mais elementos na fila */ 
		else {
			celula.setAnterior(ultima);
			ultima.setProxima(celula);
			ultima = celula;
		}
	}

	/* remove o primeiro elemento da fila */ 
	public String remover() {
		if (primeira != null) {
			Celula celula = primeira;
			/* fila só tem um elemento */ 
			if (primeira.getProxima() == null) {
				primeira = null;
				ultima = null;
			} else {
				primeira = primeira.getProxima();
				primeira.setAnterior(null);
			}
			return celula.getNome();
		}
		return null;
	}

	public String getFinal() {
		return ultima.getNome();
	}

	/* imprime na ordem crescente e decrescente */ 
	public void imprimir(boolean ascendente) {
		Celula celula;
		if (ascendente) {
			celula = primeira;
			while (celula != null) {
				System.out.println(celula.getNome());
				celula = celula.getProxima();
			}
		} else {
			celula = ultima;
			while (celula != null) {
				System.out.println(celula.getNome());
				celula = celula.getAnterior();
			}
		}
	}
}