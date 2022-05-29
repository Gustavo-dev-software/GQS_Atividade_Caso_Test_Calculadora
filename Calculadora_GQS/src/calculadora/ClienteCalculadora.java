package calculadora;

public class ClienteCalculadora {
	public static void main(String[] args) {

		Calculadora calcSoma = new Calculadora();
		double resultSoma = calcSoma.somar(3, 4);
		System.out.println(resultSoma);
		
		Calculadora calcSubtrair = new Calculadora();
		double resultSubtrair = calcSoma.somar(5, 4);
		System.out.println(resultSubtrair);
		
		Calculadora calcDividir = new Calculadora();
		double resultDividir = calcSoma.somar(3, 3);
		System.out.println(resultDividir);
		
		Calculadora calcMultiplicar = new Calculadora();
		double resultMultiplicar= calcSoma.somar(2, 8);
		System.out.println(resultMultiplicar);
	}

}
