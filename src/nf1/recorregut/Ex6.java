/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1.recorregut;

import java.util.Scanner;

/**
 *
 * @author Albert Canela
 */
public class Ex6 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int anterior, actual;
        System.out.println("Introdueix un valor positiu + "
                + "(per acabar -1");
        actual = teclat.nextInt();
        anterior = actual;

        while (actual != -1) {
            if (actual == anterior + 1) {
                System.out.println(anterior + "-" + actual);

            }
            anterior = actual;
            System.out.println("Introdueix un valor positiu + "
                    + "(per acabar -1");
            actual = teclat.nextInt();

        }
    }
}
