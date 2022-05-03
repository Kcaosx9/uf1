/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_base_dades;

import java.util.Scanner;

/**
 *
 * @author albert
 */
public class ProgramaAlumnes {

    public static void main(String[] args) {
        GestioFitxer g = new GestioFitxer();
        Alumne alumnes[] = new Alumne[20];
        int quants = g.llegeix(alumnes);

        // Aquí va el vostre codi
        //noms y cognoms
        final String missatgeEntrada = "Inútil, introdueix un valor entre 1 i 8";
        final String missatgeNumero = "Has d'introduir un valor numèric";
        final String menu = "1. Nou alumne\n"
                + "2. Llistar els alumnes\n"
                + "3. \n"
                + "4. .........\n"
                + "5. ..........\n"
                + "6. ..........\n"
                + "7. ...........\n"
                + "8. Sortir\n"
                + "Tria una opció: ";

        int opcio = 0;
        Scanner lector = new Scanner(System.in);

        while (opcio != 8) {

            System.out.print(menu);

            if (lector.hasNextInt()) {

                opcio = lector.nextInt();
                switch (opcio) {
                    case 1:

                        Alumne al = new Alumne();
                        System.out.print("Tu nombre: ");
                        al.nom = lector.next();

                        System.out.print("Tu apellido: ");
                        al.cognoms = lector.next();

                        alumnes[quants] = al;
                        quants++;

                        break;
                    case 2:
                        System.out.println("*******Lista de alumnos*******");
                        for (int i = 0; i < quants; i++) {
                            System.out.println((i + 1) + ".- " + alumnes[i].nom + " " + alumnes[i].cognoms);
                        }
                        System.out.println();
                        break;
                    case 3:
                       
                        int i = 0;
                        boolean abrir = false;
                        System.out.print("Introduce el nom: ");
                        String nomInt = lector.next();
                        System.out.print("Introduce el apellido: ");
                        String apellidoInt = lector.next();
                        while (!abrir) {

                            if (nomInt.equals(alumnes[i].nom) && apellidoInt.equals(alumnes[i].cognoms)) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.println("Introduce las notas del curso anterior: ");
                                    Double notesal = lector.nextDouble();

                                    alumnes[i].notes[j] = notesal;

                                    abrir = true;

                                }

                            }
                            i++;

                        }

                        break;
                    case 4:

                        System.out.println();
                        System.out.println("*******Lista de notes*******");
                        for (int j = 0; j < quants; j++) {
                            System.out.println((j + 1) + ".- " + alumnes[j].nom + " " + alumnes[j].cognoms + ": " + alumnes[j].notes[0]+","+alumnes[j].notes[1]+","+alumnes[j].notes[2]);
                        }
                        System.out.println();

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:
                        System.out.println("Adéu");
                        break;

                    default:
                        System.out.println(missatgeEntrada);

                }

            } else {
                System.out.println(missatgeNumero);
                lector.nextLine();

            }
        }

        g.escriu(alumnes, quants);

    }

}
