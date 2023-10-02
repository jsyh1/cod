/**CodDeCod Juan Camilo Velandia
 *diseñado para crear una forma simple de codificar  y decodificar texto */
package cod;

import javax.swing.JOptionPane;

import codifi.CandDca;

public class Inicio {

	public static void main(String[] args) {
		Menu();
	}
	public static void Menu() {
		String op1 = JOptionPane.showInputDialog("1: Codificar; 2: Decodificar; 3: Salir");
		JOptionPane.showMessageDialog(null, "Opcion: " + op1);
		int op = Integer.parseInt(op1);
		do {
			switch (op) {
				case 1 :
					CandDca.codificar();
					break;
				case 2 :
					CandDca.decodificador();
					break;
			}
		} while (op != 3);
		JOptionPane.showMessageDialog(null, "Adios :)");
	}
}
