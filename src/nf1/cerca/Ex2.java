/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1.cerca;

import java.util.Scanner;

/**
 *
 * @author Albert Canela
 */
public class Ex2 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int num,divisor=2;
        System.out.println("Introdueix un valor positiu");

        num = teclat.nextInt();
        while((divisor<num)&&(num%divisor!=0)){
                 divisor++;
        }
        if(divisor==num){
            System.out.println("Primer");
        }
        else{
            System.out.println("No es primer");
        }

    }
}
