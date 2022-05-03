/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1.recorregut;

import java.util.Scanner;

/**
 *
 * @author albert
 */
public class Ex7 {

    public static void main(String[] args) {
        int camio, pesSac, carrega, capacitat, numSac;
        Scanner teclat = new Scanner(System.in);
        numSac = 1;
        for (camio = 1; camio <= 20; camio++) {
            System.out.print("Introdueix la capacitat del camió " + camio+":");
            capacitat = teclat.nextInt();
            carrega = 0;
            System.out.print("Introdueix el pes del sac " + numSac+":");
            pesSac = teclat.nextInt();
            while (carrega + pesSac <= capacitat) {
                System.out.println("Carregant el sac " + numSac + " al camió " + camio);
                carrega = carrega + pesSac;
                numSac++;
                System.out.print("Introdueix el pes del sac  " + numSac+":");
                pesSac = teclat.nextInt();

            }
            System.out.println("No carreguis aquest sac");
            System.out.println("Que surti el camió "+ camio);
            carrega=0;
           

        }
        System.out.println("Finalitzada la càrrega del dia");

    }

}

