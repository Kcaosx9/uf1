/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1;

import com.sun.jdi.IntegerValue;
import java.util.Scanner;

public class While {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        final int num_secret = 8;
//        final int max_intents = 3;
//        System.out.println("Introduce el numero secreto: ");
//        int num = sc.nextInt();
//        int intentos = 1;
//        while (num != num_secret && intentos != 3) {
//            System.out.println("El numero esta entre el 1 al 10");
//            num = sc.nextInt();
//            intentos++;
//        }
//        if (num == num_secret) {
//            System.out.println("Correcte");
//
//        } else{
//            System.out.println("inutil");
//
//        }

//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        int max = 0;
//        int min = 9999;
//        while (num != -1) {
//            System.out.println("Introdueix un numero per teclat: ");
//            num = sc.nextInt();
//            if (max < num) {
//                max = num;
//            } else if (min > num && num != -1) {
//                min = num;
//            }
//        }
//        System.out.println("el numero mes gran es: " + max);
//        System.out.println("el numero mes petit es: " + min);

      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce un numero: ");
      int num = sc.nextInt();
      int suma = 0;
      while(num!=0){
          suma = suma+(num%10);
          num = num/10;     
      }
        System.out.println("el total es: " +suma);
    }
}
