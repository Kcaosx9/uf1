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
public class Figuras_con_asteriscos {

    public static void main(String[] args) {

        /*
        //piramide
        int fila = 5;
        int altura = 0;
       for(altura=0;altura<=fila;altura++){
           for(int j = 0;j<=fila-altura;j++){
               System.out.print(" ");
           }
           for(int asteriscos = 1;asteriscos<=(altura*2)-1;asteriscos++){
           System.out.print("*");
           }
           System.out.println();
       
       }
         */
 /*
       //media piramide
       int num = 10;
       for(int i=0;i<num;i++){
           for(int j = 0;j<i;j++){
               System.out.print("*");//si fuese printando numeros printariamos la j
           }
            System.out.println();
           
           }
         */
//        //triangulo
//        int filas = 5;
//
//        for (int altura = 0; altura < filas; altura++) {
//            //espacios
//            for (int espacios = 0; espacios < filas - altura; espacios++) {
//                System.out.print(" ");
//            }
//            System.out.print("");
//
//            //espacios
//            for (int asteriscos = 0; asteriscos < (altura * 2) - 1; asteriscos++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //triangulo invertido
//        int filas = 7;
//
//        for (int altura = 0; altura < filas; altura++) {
//            //espacios
//            for (int espacios = 0; espacios < altura; espacios++) {
//                System.out.print(" ");
//            }
//            //asteriscos
//            for (int asteriscos = filas - altura; asteriscos > 0; asteriscos--) {
//                System.out.print(" *");
//            }
//            System.out.println("");
//        }
        //rombo:
//        int num = 5;
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println("");
//        }
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < num-i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println("");
//        }
        // letra n
//        int num = 5;
//        for (int i = 0; i <= num; i++) {
//            if (i == 0 || i == num) {
//                System.out.print("* ");
//                for (int j = 0; j <= num - 2; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            } else {
//                System.out.print("*");
//                for (int j = 0; j < i - 1; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//                for(int j = 0; j < num-i;j++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//
//                
//
//            }
//            System.out.println("");
//        }
        //reloj de arena
//        int num = 6;
//        for (int j = 1; j <num; j++) {
//            for (int k = 1; k <= j; k++) {
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= num-j;k++){
//                System.out.print(" "+k);
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <num; i++) {
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <=i; j++) {
//                System.out.print(" "+j);
//            }
//            System.out.println("");
//        }

    }
}
