package nf1.recorregut;

import java.util.Scanner;

/**
 * Escriu un programa que llegeixi números enters positius i mostri el més petit
 * i el més gran. El programa finalitzarà quan ens introdueixin un número
 * negatiu.
 *
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int num, max, min;
        max = 0;
        min = Integer.MAX_VALUE;
        System.out.println("Introdueix un valor positiu + "
                + "(per acabar negatiu)");
        num = teclat.nextInt();
        //Suposem que a mínim ens entren un número
        while (num >= 0) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            System.out.println("Introdueix un valor positiu + "
                    + "(per acabar negatiu)");
            num = teclat.nextInt();
        }
        System.out.println("El valor màxim és: " + max);
        System.out.println("El valor mínim és: " + min);
    }
}
