/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2.matrizes_and_arrays;

/**
 *
 * @author isolis.daw1r
 */
public class matrius {

    public static void main(String[] args) {
        //        int b[][] = new int[2][];
//        b[0] = new int[5];
//        b[1]=new int [3];
        //int t[][] = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        //int t2[][] = new int[3][4];
//        for (int i = 0; i < t2.length; i++) {
//            for (int j = 0; j < t2[i].length; j++) {
//                t2[i][j] = 5;//añadir numeros
        //String horari[][] = {{"m2","m3","m4"},{"m2","m3","m4"}};
//            }
//        }
        //ex para encontrar un numero
//        boolean trobat = false;
//        int i = 0;
//        while (i < t.length && !trobat) {
//            int j = 0;
//            while (j < t[i].length && !trobat) {
//                if (t[i][j] == 2) {
//                    trobat = true;
//                }
//                j++;
//            }
//            i++;
//        }
//        if(trobat){
//            System.out.println("ya esta");
//        }else{
//            System.out.println("no esta");}


        //13
        
        int t1[] =  new int[100];
        int i = 0;
        boolean primo = false;
        while(i<100){
            int j = 0;
            while(i % t1[j] == 0){
            primo = true;};
        };
        

















        //14
//        int t1[][] = {{1, 20}, {105, 2}};
//        int t2[][] = {{5, 23}, {5, 46}};
//        int t3[][] = new int[2][2];
//        int sum = 0;
//        for (int i = 0; i < t2.length; i++) {
//            for (int j = 0; j < t2.length; j++) {
//                sum = t1[i][j] + t2[i][j];
//                t3[i][j] = sum;
// 
//            }
// 
//        }
//
//        for (int i = 0; i < t3.length; i++) {
//            for (int j = 0; j < t3.length; j++) {
//                System.out.print(t3[i][j]+" ");
//                
//            }
//            
//        }
        
        //15
//        int t1[][] = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
//        int t2[][] = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
//
//        boolean trobat = false;
//        int i = 0;
//        while (i < t1.length && !trobat) {
//            int j = 0;
//            while (j < t2[i].length && !trobat) {
//                if (t1[i][j] != t2[i][j]) {
//                    trobat = true;
//                }
//                j++;
//            }
//            i++;
//        }
//        if (!trobat) {
//            System.out.println("Son iguals");
//        } else {
//            System.out.println("no son iguals");
//        }
        //16
        /*
        int t1[][]= {{1,2,3},{1,2,3}};
        int suma = 0;
        int larg = 0;
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                suma = suma+t1[i][j];
                larg++;
            }
           

        }
         int med = suma / larg;
        //System.out.println(med);
        
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                if(med<t1[i][j]){
                    System.out.println("El numero: "+t1[i][j]+ " es mas grande que la media: "+med);
                }else if(med==t1[i][j]){
                    System.out.println("El numero: "+t1[i][j]+ " es igual que la media: "+med);
                }
                else{
                    System.out.println("El numero: "+t1[i][j]+ " no es mas grande que la media: "+med);
                }
            }
           

        }
            
         */
        //17
//        int t1[][] = {{1, 20, 3}, {105, 2, 3}};
//        int max1 = Integer.MIN_VALUE;
//        int cont = 0;
//        for (int i = 0; i < t1.length; i++) {
//            max1 = Integer.MIN_VALUE;
//            for (int j = 0; j < t1[i].length; j++) {
//                if (max1 < t1[i][j]) {
//                    max1 = t1[i][j];
//                }
//                
//                
//            }
//            cont++;
//            System.out.println("El max de la fila "+cont+": " +max1);
//
//        }
        

    }
}
