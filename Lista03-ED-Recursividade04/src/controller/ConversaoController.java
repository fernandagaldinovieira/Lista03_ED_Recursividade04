package controller;

public class ConversaoController {

	public ConversaoController() {
		super();
	}

	public String Conversao(int n) {
		// Comdição de parada: Se o número for 0 ou 1, a função retorna o próprio número
		if (n == 0) {
			return "0";
		} else if (n == 1) {
			return "1";
		} else {
			return Conversao(n / 2) + String.valueOf(n % 2);
		}
	}
}
