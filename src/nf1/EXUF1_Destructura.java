/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf1;
import java.util.Scanner;

public class EXUF1_Destructura {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Dia de hoy: ");
        int diah = sc.nextInt();
        System.out.println("Mes de hoy: ");
        int mesh = sc.nextInt();
        System.out.println("Año de hoy: ");
        int añoh = sc.nextInt();
        
        System.out.println("Dia del teu neixement: ");
        int dia = sc.nextInt();
        System.out.println("Mes del teu neixement: ");
        int mes = sc.nextInt();
        System.out.println("Año del teu neixement: ");
        int año = sc.nextInt();
        
        if(añoh-año > 18){
            System.out.println("eres mayor");}
        else if(añoh-año==18){
            if(mesh>mes){
                System.out.println("eres menor");}
            else if (mes == mesh){
                if(diah>=dia){
                    System.out.println("eres mayor");
                }
                else{
                    System.out.println("eres menor");
                }
            }else{
                System.out.println("eres mayor");}
        }else{
            System.out.println("eres menor");}
*/
        
        
        //ex 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año: ");
        int año = sc.nextInt();
       int a = año%19;
       int b = año%4;
       int c = año%7;
       int d = (19*a+24)%30;
       int e = ((2*b)+(4*c)+(6*d)+5)%7;
       
       if(d+e < 10){
        System.out.println("La pascua es el "+(22+d+e)+" de març ");
       }
       else{
           System.out.println("La pascua es el "+((d+e)-9)+ " d'abril");
       }
    }

}
               
        
        
       
        
        
        
  