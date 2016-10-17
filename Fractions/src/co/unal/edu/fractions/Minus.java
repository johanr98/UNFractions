/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unal.edu.fractions;

/**
 *
 * @author Estudiante
 */
public class Minus implements BinaryOperator {

    private double a, b, c;

    public Minus() {

    }

    @Override
    public Fraction operate(Fraction firstArgument, Fraction secondArgument) {
        int numerador;
        int denominador;
        numerador = firstArgument.getNumerator() * secondArgument.getDenominator() - firstArgument.getDenominator() * secondArgument.getNumerator();
        denominador = firstArgument.getDenominator() * secondArgument.getDenominator();
        return new Fraction(numerador, denominador);

    }

    @Override
    public String explainOperation(Fraction firstArgument, Fraction secondArgument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
