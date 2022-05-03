/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1;

import java.util.Scanner;


public class For {
    public static void main(String[] args) {
        
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
        
        /*
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        
        for(int i = 1;i<=num;i++){//fila
            for(int j = 1;j<=num;j++){//columna
                System.out.print("* ");
            }
            System.out.println(" ");//salto
        }
        */
         Scanner sc = new Scanner (System.in);
         
        int max = Integer.MIN_VALUE;
        int min = 0;
        for(int i = 1;i<=5;i++){
            System.out.print("Introduce el "+i+" numero: ");
            int num = sc.nextInt();
            if(max<num){
                max = num;
            }
            else{
                min = num;}
        }
        System.out.println("El numero mas grande es: "+max);
        System.out.println("El numero mas pequeño es: "+min);
 
        
       
       
       
       
          
       
       }
}
