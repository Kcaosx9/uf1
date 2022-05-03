/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2.matrizes_and_arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author isolis.daw1r
 */
public class arrays {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

//        int valors[]={87,68,94,100};
//        int valors1[]={8,54,12,45};
//        int suma[] = new int [valors.length];
//        for (int i = 0; i < valors1.length; i++) {
//            suma[i] = valors[i]+valors1[i];
//            System.out.println("resultado de la posicion "+i+" :"+suma[i]);
//        }
        //valor mas pequeño
//        int valors[] = {25, 42,13, 44, 75};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < valors.length; i++) {
//             if(min>valors[i]){
//             min=valors[i];
//             }
//        }
//        System.out.println("el numero mes petit es: "+min);
        //for mejorado para imprimir
        //for(int nota:valors){
//        System.out.println(nota+"");}
        //printar en orden inverso:
//La funcion hasNextInt() es para que no pete la maquina si ejecutamos una letra y no un entero.
        //algoritmo de burbuja 
//        int t1[] = {7, 2, 4, 1, 5};
//        for (int i = 0; i < t1.length; i++) {
//            for (int j = i + 1; j < t1.length; j++) {
//                int temp = t1[i];
//                if (t1[i] > t1[j]) {
//                    t1[i] = t1[j];
//                    t1[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < t1.length; i++) {
//            System.out.print(" "+t1[i]);
//        }
//        System.out.println();
        //algoritmo de burbuja al reves
//         int t1[] = {3,7,4,2,8,6};
//        for (int i = 0; i < t1.length/2; i++) {
//            int temp = t1[i];
//            t1[i]=t1[t1.length-1-i];
//            t1[t1.length-1-i] = temp;
//   
//   
//        }
//        for (int i = 0; i < t1.length; i++) {
//            System.out.print(" "+t1[i]);
//        }
//        System.out.println();
        //rotacio a la esquerra o dreta
//        int t1[] = {1, 2, 3, 4, 5, 6};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduce la totacion que quieres: \n1.-Esquerra\n2.-Dreta\nOpcio: ");
//        int opcio = sc.nextInt();
//
//        int pos = t1[0];
//        int pos2 = t1[t1.length - 1];
//
//        if (opcio == 1) {
//            for (int i = 0; i < t1.length - 1; i++) {
//                t1[i] = t1[i + 1];
//
//            }
//            t1[t1.length - 1] = pos;
//            for (int i = 0; i < t1.length; i++) {
//                System.out.print(t1[i] + " ");
//
//            }
//        } else {
//            for (int i = t1.length - 1; i > 0; i--) {
//                t1[i] = t1[i - 1];
//            }
//            t1[0] = pos2;
//            for (int i = 0; i < t1.length; i++) {
//                System.out.print(t1[i] + " ");
//
//            }
//
//        }
        //cerca binaria
        
//        int notes[] = {1, 2, 3, 4, 10, 5, 6, 8, 11};
//        boolean trobat = false;
//        int i = 0;
//        while (!trobat && i < notes.length) {
//            if (notes[i] == 10) {
//                trobat = true;
//            }
//            i++;
//        }
//        if (trobat) {
//            System.out.print("Si");
//        } else {
//            System.out.print("No");
//        }

        //cerca binari ordenat
        
//        int notes[] = {1, 2, 3, 4, 5, 6,7, 8};
//        boolean trobat = false;
//        boolean acabar = false;
//        int i = 0;
//        while (!trobat && i < notes.length && !acabar) {
//            if (notes[i] == 7) {
//                //l'hem trobat
//                trobat = true;
//            }
//            else if(notes[i]>7){
//                acabar = true;
//            }
//            i++;
//        }
//        if (trobat) {
//            System.out.print("Si");
//        } else {
//            System.out.print("No");
//        }

        // ex6 numero de asterisc
        
//        int t1[] = {1,2,3,4,5};
//        
//        for (int i = 0; i < t1.length; i++) {
//            for (int j = 0; j < t1[i] ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//             
//            
//        }

       //ex5 
       
//       int t1[] = {1,2,3,4,5};
//       
//        for (int i = 0; i < t1.length/2; i++) {
//            int temp = t1[i];
//            t1[i]=t1[t1.length-1-i];
//            t1[t1.length-1-i]=temp;
//            
//            
//        }
//        for (int i = 0; i < t1.length; i++) {
//            System.out.print(t1[i]+" ");
//            
//        }
             
        //ex7
//        int t1[] = {51,7,87,55,28,17,49,85,56,24,34,61};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        int mitj = 0;
//        
//        for (int i = 0; i < t1.length; i++) {
//            if(t1[i]<min){
//            min = t1[i];
//            }
//            else if(t1[i]>max){
//            max = t1[i];
//            }
//            mitj = mitj+t1[i];
//        }
//        System.out.println("Min: "+min);
//        System.out.println("Max: "+max);
//        System.out.println("Mitja: "+mitj/t1.length);

        //8
        int t1[] = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int nota = sc.nextInt();
        int cont = 1;
        
        while(nota != -1 && nota<t1.length){
            System.out.println("Introduce un numero: ");
            nota = sc.nextInt();
        }
        
        
        

    }

}
