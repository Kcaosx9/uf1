/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2.cadenas;

import java.awt.geom.Path2D;
import java.util.Scanner;

/**
 *
 * @author isolis.daw1r
 */
public class Cadena_de_text {

    public static void main(String[] args) {
        //array de strings
//        char o;
//        char h;
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("posa text");
//        o = sc.nextLine().charAt(3);
//        o = sc.nextLine().charAt(3);
//        
        //Exercicis de cadenas:

        //EX1:
        /*
        Scanner sc = new Scanner(System.in);
        String paraula = "TRWAGMYFPDXBNJZSQVHLCKE";
        System.out.println("Introduce el dni: ");
        int dni = sc.nextInt();
        
        int divisio = dni%23;
        System.out.println("DNI: "+dni+paraula.charAt(divisio));
         */
        //EX2
//        Scanner sc = new Scanner(System.in);
//        String abc = "abcdefghijklmnopqrstuvwxyza  ";
//        System.out.println("Introdueix una cadena de caracters: ");
//        String lletra = sc.nextLine();
//        int pos = 0;
//
//        for (int i = 0; i < lletra.length(); i++) {
//            pos = abc.indexOf(lletra.charAt(i));
//            System.out.print(abc.charAt(pos+1));
//
//        }
        //EX3
//            if (args.length == 0) {
//                System.out.print("Hola desconegut");
//                
//            } else{
//                System.out.println("Benvingut Sr " + args[0]);
//            }
        //EX4
        /*
            int suma = 0;
            int mitj = 0;
            if (args.length == 0) {
                System.out.print("Error");
                
            } else if(args[0].equals("ajut")){
                System.out.println("Introduce un par de numeros");
                
            }
            else{
                for (int i = 0; i < args.length; i++) {
                    suma = suma+Integer.parseInt(args[i]);
                   
                }
                mitj = suma/args.length;
                System.out.println("La media es de :"+mitj);
                
            
            }
         */
        //EX5
//        String enunciat = "la vecina de cadena refelxiona...";
//        int cont = 0;
//        for (int i = 0; i < enunciat.length(); i++) {
//            if(enunciat.charAt(i) == 'l'){
//                cont++;
//                }   
//        }
//        System.out.println("El numero de 'a' son: "+cont);
        //otra forma
//        String enunciat = "programacio";
//        int cont = 0;
//        int pos = enunciat.indexOf('a');
//        
//        while(pos != -1){
//            cont++;
//            pos = enunciat.indexOf('a', pos+1);
//        }
//        System.out.println("El numero de 'a' son: "+cont);
//        
        //EX6
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduce una frase: ");
//        String frase = sc.nextLine();
//        String[] parts = frase.split(" ");
//        
//
//        for (int i = 0; i < parts.length; i = i+2) {
//            System.out.print(parts[i]);
//            System.out.print(" ");
//
//        }
        //7
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduce tres palabras: ");
//        String frase = sc.nextLine();
//        frase.toLowerCase();
//        String[] parts = frase.split(" ");
//        String max = parts[0];
//        String alf = "z";
//        int cont = 1;
//        
//        
//
//        for (int i = 0; i < parts.length; i++) {
//            if (max.length() < parts[i].length()) {
//                max = parts[i];
//            }
//            if(alf.compareTo(parts[i]) > 0){
//                alf = parts[i];
//                
//            }
//
//        }
//        System.out.println("La palabra mas larga es: "+max);
//        System.out.println("La menor alfabeticaments: "+alf);
    }
}

    

        

