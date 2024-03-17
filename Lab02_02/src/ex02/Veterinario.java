package ex02;

public class Veterinario {

	public static void cuidaDoCachorro(Cachorro cachorro) {
		System.out.println("Recebendo " + cachorro.getNome());
		if(!cachorro.getIsDoente()) {
			System.out.println("O cachorro está saudável");
			System.out.println("...");
			return;
		}

		System.out.println("Dando injeção para o animalzinho");
		cachorro.darInjecao();
		cachorro.latir();
		cachorro.comer();
		cachorro.dormir();
		System.out.println("saindo do veterinario");
		System.out.println("...");
	}

	public static void cuidaDoGato(Gato gato) {
		System.out.println("Recebendo " + gato.getNome());
		if(!gato.getIsDoente()) {
			System.out.println("O gato está saudável");
			System.out.println("...");
			return;
		}

		System.out.println("Dando injeção para o animalzinho");
		gato.darInjecao();
		gato.latir();
		gato.comer();
		gato.dormir();
		System.out.println("saindo do veterinario");
		System.out.println("...");
	}

	public static void cuidaDoPato(Pato pato) {
		System.out.println("Recebendo " + pato.getNome());
		if(!pato.getIsDoente()) {
			System.out.println("O pato está saudável");
			System.out.println("...");
			return;
		}

		System.out.println("Dando injeção para o animalzinho");
		pato.darInjecao();
		pato.latir();
		pato.comer();
		pato.dormir();
		System.out.println("saindo do veterinario");
		System.out.println("...");
	}

}