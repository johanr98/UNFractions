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
public class Multiply implements BinaryOperator {

    public Fraction operate(Fraction firstArgument, Fraction secondArgument) {
        return new Fraction(firstArgument.getNumerator() * secondArgument.getNumerator(), firstArgument.getDenominator() * secondArgument.getDenominator());
    }

    public String explainOperation(Fraction firstArgument, Fraction secondArgument) {
        //TO DO
        return "";
    }

    public Multiply() {

    }

}
