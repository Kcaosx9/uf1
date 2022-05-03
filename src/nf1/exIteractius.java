/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1;

import java.util.Scanner;

/**
 *
 * @author isolis.daw1r
 */
public class exIteractius {

    public static void main(String[] args) {
//        for (int i = 2; i < 1000; i++) {
//            int num1 = i % 10;//saber el ultimo numero
//            int num2 = (i / 10) % 10;//saber el segundo
//            int num3 = i / 100;//saber el primero
//            int suma = (num1 * num1 * num1) + (num2 * num2 * num2) + (num3 * num3 * num3);
//            if (suma == i) {
//                System.out.println(i);
//            }
//        }

//Escribir una f con asteriscos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        //int quants = num;

        for(int i = 0;i<=num-1;i++){
            if(i == 0 || i == num/2){
            for(int j = 0;j<=num-1;j++){
                System.out.print("* ");
            }
            System.out.println();
            }
            else{
                System.out.println("* ");
            }
        }
        //piramide invertido con numeros
//        for (int i = 0; i <= num / 2; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for(int j = 1;j<= quants;j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println("");
//            quants=quants-2;
//
//        }
    }
}
