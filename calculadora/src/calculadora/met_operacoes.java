package calculadora;

public class met_operacoes {
	public static double adicao(int n1, int n2) {
		return n1 + n2;
	}
	public static double subtracao(int n1, int n2) {
		return n1 - n2;
	}
	public static double multiplicacao(int n1, int n2) {
		return n1 * n2;
	}
	public static double divisao(int n1, int n2) {
		if(n2 != 0) {
			return(double) n1/n2;
		}else {
			throw new ArithmeticException("Divisão por zero não é permitida.");
		}
		
	}

}
