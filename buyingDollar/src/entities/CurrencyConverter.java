package entities;

public class CurrencyConverter {
	public static final double dollar = 3.10;
	
	public static double converter(double valor) {
		return (dollar * valor * 6 / 100) + dollar * valor;
	}
}
