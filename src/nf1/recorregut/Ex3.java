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
public class Ex3 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int num, suma = 0;
        System.out.print("Introdueix un valor positiu:");
        num = teclat.nextInt();
        while (num > 0) {
           suma=suma+(num%10);
           num=num/10;                                    
        }
        System.out.println("La suma dels dígits és: "+suma);

    }
}
