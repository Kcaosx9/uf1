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
public class Exercicis_for {

    public static void main(String[] args) {

        //1
        /*
     for(int i=1;i<=100;i++){
         System.out.println(i);}
         */
        //2
        /*
     for(int i=0;i<=98;i=i+2){
         System.out.println(i);}
         */
        //3
        /*
     for(int i = 100;i>=1;i--){
         System.out.println(i);}
         */
        //4
        /*
     Scanner sc = new Scanner (System.in);
        int suma = 0;
        for(int i = 1;i<= 5;i++){
            System.out.println("Introdueix un numero: ");
            int num = sc.nextInt();
            suma = suma+num;
        }
        System.out.println("El total es: "+suma);
         */
        //5
        /*
      Scanner sc = new Scanner (System.in);
        int suma = 0;
        for(int i = 1;i<= 5;i++){
            System.out.println("Introdueix un numero: ");
            int num = sc.nextInt();
            if(num > 10){
            suma = suma+num;}
        }
        System.out.println("El total es: "+suma);

         */
        //10.-Cuadrado:
//        int num = 5;
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
        //11.-cuadrado vacio
//        int num = 5;
//        for (int i = 1; i <= num; i++) {
//            if (i == 1 || i == num) {
//                for (int j = 1; j <= num; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for (int j = 1; j < num - 1; j++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        //12
//        int num = 5;
//        for(int i = 1; i <= num;i++){
//            for(int j = 1;j <= i;j++){
//                System.out.print(" "+j);
//            }
//            System.out.println();
//        }
        //13: lo mismo q el 12 pero prntando asteriscos
        //14
//        int num = 5;
//        for (int i = 0; i <= num; i++) {
//            for (int j = i; j<num;++j) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        //15 triangulo lateral
//        int num = 5;
//        for (int i = 0; i <= num; i++) {
//            for (int j = 0; j <= num - i; j++) {
//                System.out.print("  ");//depende de como pongas el espacio sera un triangulo diferente
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println("");
//
//        }
        //16 triangulo lateral invertido
        int num = 5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");//depende de como pongas el espacio sera un triangulo diferente
            }
            for(int j = 0; j < num-i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

}
