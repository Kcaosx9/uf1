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
public class Ex1 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int num;
        System.out.println("Introdueix un valor positiu + "
                + "(per acabar -1");
        num = teclat.nextInt();
        while (num!=-1 && num%5!=0) {

            System.out.println("Introdueix un valor positiu + "
                    + "(per acabar -1");
            num = teclat.nextInt();
        }
        
        if (num%5==0){
            System.out.println(num+ " és múltiple de 5");
        }
        else{
            System.out.println("No hi ha cap múltiple");
        }
        
        

    }
}
