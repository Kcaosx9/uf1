/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1;

import java.util.Random;

/**
 *
 * @author isolis.daw1r
 */
public class Aleatorios {

    public static void main(String[] args) {
        Random aleatori = new Random();
//        int nota = aleatori.nextInt(12) - 1;
//        int cont = 0;
//        while (nota != -1 && cont != 3) {
//            nota = aleatori.nextInt(12)-1;
//            if (nota < 5) {
//                cont++;
//            }
//        }
//        if(cont >= 3){
//            System.out.println("hay al menos 3 suspendidos");
//        }
//        else{
//            System.out.println("hay menos de 3 suspendidos");}

        int nota = aleatori.nextInt(12)-1;
        int num = 0;
        int cont = 0;
        while(nota != -1 && nota > 0){
            nota = aleatori.nextInt(12)-1;
            System.out.println(nota);
            if(num<nota){
            num = nota;
            }
        }
        if(num > nota){
            System.out.println("NO");
        }else{
            System.out.println("SI");}
        
    }

}
