package utils;

public class CurrencyConverter {
	public static double convertToReais(double dollarPrice, double quantity) {
		return (dollarPrice*quantity*0.06)+(dollarPrice*quantity);
	}
}
