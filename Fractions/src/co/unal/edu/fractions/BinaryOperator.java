package co.unal.edu.fractions;

public interface BinaryOperator {

	Fraction operate(Fraction firstArgument, Fraction secondArgument);
	
	String explainOperation(Fraction firstArgument, Fraction secondArgument);

}