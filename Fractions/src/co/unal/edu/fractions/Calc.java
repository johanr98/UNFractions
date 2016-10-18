/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unal.edu.fractions;

import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class Calc {

    static Random a = new Random();
    static Higher b = new Higher();

    public static void main(String[] args) {

        Fraction[] base = new Fraction[20];
        for (int i = 0; i < base.length; i++) {
            base[i] = new Fraction(a.nextInt(1000), a.nextInt(1000));
        }
        System.out.println("\ninicial\n");
        for (int i = 0; i < base.length; i++) {
            System.out.println(base[i]);
        }
        for (int i = 0; i < base.length; i++) {
            base[i].simplify();
        }
        System.out.println("\nsimplificadas\n");
        for (int i = 0; i < base.length; i++) {
            System.out.println(base[i]);
        }
        Fraction temp;
        for (int i = base.length - 1; i < base.length; i--) {
            for (int j = 0; j < i; j++) {
                if (b.operate(base[j], base[j + 1])) {
                    temp = base[j + 1];
                    base[j + 1] = base[j];
                    base[j] = temp;
                }
            }
        }
        System.out.println("\nordenadas\n");
        for (int i = 0; i < base.length; i++) {
            System.out.println(base[i]);
        }
    }
}
