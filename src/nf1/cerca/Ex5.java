package nf1.cerca;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int num;
        System.out.println("Introdueix un valor positiu ");
        num = teclat.nextInt();
        while ((num > 0) && (num % 2 == 0)) {
            num = num / 10;
        }
        if (num == 0) {
            System.out.println("Tots parells");
        } else {
            System.out.println("No són tots parells");
        }

    }
}
