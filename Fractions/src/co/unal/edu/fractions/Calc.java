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


public class Calc {
    
    static Sum a = new Sum();
    static Minus b = new Minus();
    static Multiply c = new Multiply();
    static Divide d = new Divide();
    
    public static void main(String[] args){
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(5, 4);
        Fraction[] result = new Fraction[4];
        result[0] = a.operate(f1,f2);
        result[1] = b.operate(f1,f2);
        result[2] = c.operate(f1,f2);
        result[3] = d.operate(f1,f2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
