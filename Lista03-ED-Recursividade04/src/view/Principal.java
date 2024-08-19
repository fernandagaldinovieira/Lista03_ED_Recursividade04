package view;

import javax.swing.JOptionPane;

import controller.ConversaoController;

public class Principal {

	public static void main(String[] args) {

		ConversaoController binario = new ConversaoController();
		
		int n;
		do {
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 2000: "));
		} while (n < 0 && n > 2000);
		
		String resultado = binario.Conversao(n);
		System.out.println("Número " + n + " em binário: " + resultado);

	}
}
