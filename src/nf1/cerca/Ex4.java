package nf1.cerca;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int num;
        System.out.println("Introdueix un valor positiu + "
                + "(per acabar -1");
        num = teclat.nextInt();
        while ((num != -1) && (num % 2 == 0)) {
            System.out.println("Introdueix un valor positiu + "
                    + "(per acabar -1");
            num = teclat.nextInt();

        }
        if(num==-1){
            System.out.println("Tots parells");
        }
        else{
            System.out.println("No són tots parells");
        }
    }
}
