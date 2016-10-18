/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unal.edu.fractions;

/**
 *
 * @author johanr98 jsromerod@unal.edu.co
 */
public class Equals implements Comparable {

    @Override
    public boolean operate(Fraction firstArgument, Fraction secondArgument) {
        firstArgument.simplify();
        secondArgument.simplify();
        if (firstArgument.getNumerator() == secondArgument.getNumerator() && firstArgument.getDenominator() == secondArgument.getDenominator()) {
            return true;
        } else {
            return false;
        }
    }
    
    public Equals(){
        
    }

}
