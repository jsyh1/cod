package codifi;

import java.util.Scanner;

public class CandDca {
	// descodificador
	public static void decodificador() {
		// Cambiar Scanner por JOption
		Scanner sc = new Scanner(System.in);
		int d = 0;
		char ABC[][] = {{'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'},
				{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}};
		do {
			System.out.println("Ingrese caracter: ");
			String c = sc.next();
			char s = c.charAt(0);
			boolean encontrado = false;

			for (int f = 0; f < ABC[0].length; f++) {
				if (s == ABC[0][f]) {
					int nuevaPosicion = (f - 3 + ABC[0].length) % ABC[0].length;
					System.out.println("[" + ABC[0][nuevaPosicion] + "]");
					encontrado = true;
					break;
				}
			}
			if (!encontrado) {
				System.out.println("Caracter no encontrado en el alfabeto.");
			}
			d++;
		} while (d < 400);
		sc.close();
	}

	// codificador

	public static void codificar() {
		Scanner sc = new Scanner(System.in);
		int d = 0;
		char ABC[][] = {{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
				{'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'}};
		do {
			System.out.println("Ingrese caracter: ");
			String c = sc.next();
			char s = c.charAt(0);
			boolean encontrado = false;

			for (int f = 0; f < ABC[0].length; f++) {
				if (s == ABC[0][f]) {
					int nuevaPosicion = (f - 3 + ABC[0].length) % ABC[0].length;
					System.out.println("[" + ABC[0][nuevaPosicion] + "]");
					encontrado = true;
					break;
				}
			}
			if (!encontrado) {
				System.out.println("Caracter no encontrado en el alfabeto.");
			}
			d++;
		} while (d < 400);
		sc.close();
	}
}
