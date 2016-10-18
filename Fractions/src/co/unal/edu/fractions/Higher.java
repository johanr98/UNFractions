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
public class Higher implements Comparable {

    static Minus b = new Minus();

    @Override
    public boolean operate(Fraction firstArgument, Fraction secondArgument) {
        if (b.operate(firstArgument, secondArgument).getNumerator() > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public Higher(){
        
    }

}
