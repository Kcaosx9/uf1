/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author isolis.daw1r
 */
public class Ex_Recorregut {

    public static void main(String[] args) {

        //divisors de un numero con while
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        int cont = 2;
        System.out.print("divisors de "+num+": ");
        while (cont < num) {
            if (num % cont == 0) {
                System.out.println(cont);
                cont++;
            } else {
                cont++;
            }

        }
         */
        //con for: 
        /*
        for(int i = 1;i<20;i++){
            if(num%i==0){
                System.out.println("Divisors de num: "+i);
            }
            
        }
         */
 /*
        //acceder 1r element
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num != 10 && num != -1) {
            System.out.println("Introduce una serie de numeros: ");
            num = sc.nextInt();
            if(num == 10){
                System.out.println("si que hay un 10");}
        }
         */
        //Ex1
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
        //Ex2:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce un numero: ");
//        int num = sc.nextInt();
//        int cont = 0;
//        while(num > 0){
//            num = num/10;
//            cont++;
//            
//        }
//        System.out.println(cont);
        //Ex3:
//      Random a = new Random(); //random
////      Scanner sc = new Scanner(System.in);
////      System.out.println("Introduce un numero: ");
////      int num = sc.nextInt();
//      int rand = a.nextInt(2000); //random
//        System.out.println(rand); //random
//      int suma = 0;
//      while(rand!=0){
//          suma = suma+(rand%10);
//          rand = rand/10;
//          
//      }       
//      System.out.println("el total es: " +suma);
        //4:
        //suma de pares e impares de un numero:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce un numero: ");
//        int num = sc.nextInt();
//        int suma = 0;
//        int num2 = 0;
//        int suma2 = 0;
//        while (num != 0) {
//            num2 = num%10;
//            if (num2 % 2 == 0) {
//                suma = suma + num2;
//            }
//            else if(num2%2!=0){
//                suma2 = suma2 +num2;
//            }
//             num = num / 10;
//        }
//        System.out.println("pares : "+suma);
//        System.out.println("impares : "+suma2);
        //5:
        //digitos mas grandes que 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce un numero: ");
//        int num = sc.nextInt();
//        int num2 = 0;
//        while (num != 0) {
//            num2 = num%10;
//            if(num2 > 5){
//                System.out.println("Los digitos mas grandes: "+num2);
//            }
//            num = num/10;
//        }
        //6:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce un numero positivo: ");
//        int numAct = sc.nextInt();
//        int numAnt = numAct;
//        while (numAct != -1) {
//            if (numAct == numAnt + 1) {
//                System.out.println(numAnt + " , " + numAct);
//            }
//            numAnt = numAct;
//            System.out.println("Introduce un numero positivo: ");
//            numAct = sc.nextInt();
//        }
       
                
             
        



    }

}
