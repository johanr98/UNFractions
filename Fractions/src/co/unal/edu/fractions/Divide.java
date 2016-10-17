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
public class Divide implements BinaryOperator {

    public Divide(int numerador, int denominador, int nu, int de) {

        this.operate(new Fraction(numerador, denominador), new Fraction(nu, de));

    }

    public Divide() {

    }

    @Override
    public Fraction operate(Fraction firstArgument, Fraction secondArgument) {
        int numerador = firstArgument.getNumerator() * secondArgument.getDenominator();
        int denominator = firstArgument.getDenominator() * secondArgument.getNumerator();
        return new Fraction(numerador, denominator);
    }

    @Override
    public String explainOperation(Fraction firstArgument, Fraction secondArgument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
