package nf1.cerca;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int nota, susp = 0;
        System.out.println("Introdueix un valor positiu + "
                + "(per acabar -1");
        nota = teclat.nextInt();
        while ((nota != -1) && (susp < 3)) {
            if (nota < 5) {
                susp++;
            }
            if (susp < 3) {
                System.out.println("Introdueix un valor positiu + "
                        + "(per acabar -1");
                nota = teclat.nextInt();
            }
        }
        if (susp == 3) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }

    }
}
