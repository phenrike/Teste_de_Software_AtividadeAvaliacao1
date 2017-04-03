package aula;

public class Lista {
	private No inicio;

	public void add(int valor) {
		/* lista est� vazia */ 
		if (inicio == null) {
			inicio = new No(valor);
		} /* lista n�o est� vazia */ 
		else {
			add(inicio, valor);
		}
	}

	private void add(No atual, int valor) {
		/* checa se � para ir para a direita */ 
		if (atual.valor < valor) {
			/* verificar se existe n� a direita */ 
			if (atual.proximo == null) {
				No no = new No(valor);
				atual.proximo = no;
				no.anterior = atual;
			} /*
				 * verifica se o pr�ximo n� possui valor MENOR do que o que
				 * estamos querendo adicionar, desta forma, precisamos continuar
				 * percorrendo a lista para a direita
				 */ 
			else if (atual.proximo.valor < valor) {
				add(atual.proximo, valor);
			} else {
				No no = new No(valor);
				/* colocar entre dois n�s */ 
				no.proximo = atual.proximo;
				atual.proximo.anterior = no;
				atual.proximo = no;
				no.anterior = atual;
			}
		} /* ir para esquerda */ 
		else {
			/* verificar se existe n� a esquerda */ 
			if (atual.anterior == null) {
				No no = new No(valor);
				/* coloca o novo n� no in�cio da lista */ 
				atual.anterior = no;
				no.proximo = atual;
			} else {
				/* continua procurando onde colocar o novo n� */ 
				add(atual.anterior, valor);
			}
		}
	}

	public void printLeft2Right() {
		/* posiciona no n� mais � esquerda */ 
		No atual = getMostLeft();
		/* percorre a lista enquanto existir n� a direita */ 
		while (atual != null) {
			System.out.print(atual.valor + " < ");
			atual = atual.proximo;
		}
		System.out.println();
		/* quebra de linha */ 
		}

	public void printRight2Left() {
		/* posiciona no n� mais a direita */ 
		No atual = getMostRight();
		/* percorre a lista enquanto existir n� a esquerda */ 
		while (atual != null) {
			System.out.print(atual.valor + " > ");
			atual = atual.anterior;
		}
		System.out.println();
		/* quebra de linha */ 
		}

	/* retorna o n� mais � esquerda */ 
	private No getMostLeft() {
		No no = inicio;
		/* verifica se a lista est� vazia */ 
		if (no != null) {
			/* repete enquanto existir n� a esquerda */ 
			while (no.anterior != null) {
				no = no.anterior;
			}
		}
		return no;
	}

	/* retorna o n� mais a direita */ 
	private No getMostRight() {
		No no = inicio;
		/* verifica se a lista est� vazia */ 
		if (no != null) {
			/* repete enquanto existir n� a direita */ 
			while (no.proximo != null) {
				no = no.proximo;
			}
		}
		return no;
	}
}