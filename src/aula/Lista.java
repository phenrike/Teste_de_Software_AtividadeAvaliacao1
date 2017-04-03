package aula;

public class Lista {
	private No inicio;

	public void add(int valor) {
		/* lista está vazia */ 
		if (inicio == null) {
			inicio = new No(valor);
		} /* lista não está vazia */ 
		else {
			add(inicio, valor);
		}
	}

	private void add(No atual, int valor) {
		/* checa se é para ir para a direita */ 
		if (atual.valor < valor) {
			/* verificar se existe nó a direita */ 
			if (atual.proximo == null) {
				No no = new No(valor);
				atual.proximo = no;
				no.anterior = atual;
			} /*
				 * verifica se o próximo nó possui valor MENOR do que o que
				 * estamos querendo adicionar, desta forma, precisamos continuar
				 * percorrendo a lista para a direita
				 */ 
			else if (atual.proximo.valor < valor) {
				add(atual.proximo, valor);
			} else {
				No no = new No(valor);
				/* colocar entre dois nós */ 
				no.proximo = atual.proximo;
				atual.proximo.anterior = no;
				atual.proximo = no;
				no.anterior = atual;
			}
		} /* ir para esquerda */ 
		else {
			/* verificar se existe nó a esquerda */ 
			if (atual.anterior == null) {
				No no = new No(valor);
				/* coloca o novo nó no início da lista */ 
				atual.anterior = no;
				no.proximo = atual;
			} else {
				/* continua procurando onde colocar o novo nó */ 
				add(atual.anterior, valor);
			}
		}
	}

	public void printLeft2Right() {
		/* posiciona no nó mais à esquerda */ 
		No atual = getMostLeft();
		/* percorre a lista enquanto existir nó a direita */ 
		while (atual != null) {
			System.out.print(atual.valor + " < ");
			atual = atual.proximo;
		}
		System.out.println();
		/* quebra de linha */ 
		}

	public void printRight2Left() {
		/* posiciona no nó mais a direita */ 
		No atual = getMostRight();
		/* percorre a lista enquanto existir nó a esquerda */ 
		while (atual != null) {
			System.out.print(atual.valor + " > ");
			atual = atual.anterior;
		}
		System.out.println();
		/* quebra de linha */ 
		}

	/* retorna o nó mais à esquerda */ 
	private No getMostLeft() {
		No no = inicio;
		/* verifica se a lista está vazia */ 
		if (no != null) {
			/* repete enquanto existir nó a esquerda */ 
			while (no.anterior != null) {
				no = no.anterior;
			}
		}
		return no;
	}

	/* retorna o nó mais a direita */ 
	private No getMostRight() {
		No no = inicio;
		/* verifica se a lista está vazia */ 
		if (no != null) {
			/* repete enquanto existir nó a direita */ 
			while (no.proximo != null) {
				no = no.proximo;
			}
		}
		return no;
	}
}