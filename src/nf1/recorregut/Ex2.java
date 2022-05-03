/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1.recorregut;

import java.util.Scanner;

/**
 * Donat un número llegit per teclat, calcula el número de dígits que té.
 * @author Albert Canela
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int num, digits = 0;
        System.out.print("Introdueix un valor positiu:");
        num = teclat.nextInt();
        while (num > 0) {
            digits++;
            num = num / 10;

        }
        System.out.println("El número té " + digits + " dígits");

    }
}
