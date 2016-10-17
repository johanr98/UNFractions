package co.unal.edu.fractions;

public class Fraction {
	final private static String fractionDivider = "/";
	private int numerator;
	private int denominator;

	/**
	 * If denominator is 0 sets it as 1
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator != 0 ? denominator : 1;
		simplify();
	}

	public Fraction() {
		this(0, 1);
	}

	public void simplify() {
		// TODO
	}

	@Override
	public String toString() {
		return numerator + fractionDivider + denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	
//	public static void main(String[] args) {
//		Fraction f1 = new Fraction();
//		Fraction f2 = new Fraction(5, 3);
//		Fraction f3 = new Fraction(5, 0);
//		System.out.println("First fraction:" + f1);
//		System.out.println("Second fraction:" + f2);
//		System.out.println("Third fraction:" + f3);
//		System.out.println("Fractions work!!");
//	}
}