package aula;

import java.util.Arrays;

public class Sena {
	private int[] nros;

	public Sena(int quant) throws Exception {

		/* uma aposta por ter [6,12] números */
		if (quant >= 6 && quant <= 12) {
			nros = new int[quant];

			/* gera os números aleatórios */
			for (int i = 0; i < quant; i++) {
				nros[i] = (int) (Math.random() * 60 + 1);
			}
			Arrays.sort(nros);
			/* ordena o array */ } 
		else {
			throw new Exception("Uma aposta precisa ter [6,12] números");
		}
	}

	/* verifica se o nro existe em nros */
	public boolean hasNro(int nro) {
		for (int i = 0; i < nros.length; i++) {
			if (nros[i] == nro) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String r = "" + nros[0];
		for (int i = 1; i < nros.length; i++) {
			r += ";" + nros[i];
		}
		return r;
	}
}