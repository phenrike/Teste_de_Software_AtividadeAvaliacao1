package aula;

public class Principal {
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.add(10);
		lista.add(17);
		lista.add(8);
		lista.add(20);
		lista.add(18);
		lista.add(8);
		lista.add(9);
		lista.add(17);
		lista.add(20);
		lista.add(11);
		System.out.println("Do menor para o maior valor:");
		lista.printLeft2Right();
		System.out.println("Do maior para o menor valor:");
		lista.printRight2Left();
	}
}