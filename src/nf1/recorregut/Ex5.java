package nf1.recorregut;

import java.util.Scanner;

/**
 *
 * @author Albert Canela
 */
public class Ex5 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int num, mod, quants = 0;
        System.out.print("Introdueix un valor positiu:");
        num = teclat.nextInt();
        while (num > 0) {
            if (num%10>5){
                quants++;
            }
            num=num/10;                        
        }
        System.out.println("Hi ha "+quants+" dígits més grans que 5");

    }
}
