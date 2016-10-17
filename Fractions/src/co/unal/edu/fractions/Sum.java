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
public class Sum implements BinaryOperator{
    
    public Sum(){
        
    }
    
    public Fraction operate(Fraction x, Fraction y){
        
        if(x.getDenominator()==y.getDenominator()){
            int num = x.getNumerator()+y.getNumerator();
            int den = x.getDenominator()+y.getDenominator();
            Fraction z = new Fraction(num,den);
            return z;
        } else{
            int num1 = x.getNumerator()*y.getDenominator();
            int num2= x.getDenominator()*y.getNumerator();
            int num=num1+num2;
            int den = x.getDenominator()*y.getDenominator();
            Fraction z = new Fraction(num,den);
            return z;
        }
        
    }
    
    public String explainOperation(Fraction firstArgument, Fraction secondArgument){
        return "";
    }
}
