package nf1.cerca;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int num, anterior = -1;
        System.out.println("Introdueix un valor positiu + "
                + "(per acabar -1");
        num = teclat.nextInt();
        while ((num != -1) && (anterior < num)) {
            anterior = num;
            System.out.println("Introdueix un valor positiu + "
                    + "(per acabar -1");
            num = teclat.nextInt();

        }
        if(num==-1){
            System.out.println("Es compleix");
        }
        else{
            System.out.println("No es compleix");
        }

    }
}
