/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pt2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author albert
 */
public class GestioFitxer {

    public int llegeix(Producte productes[]) {
        int quants = 0;
        ObjectInputStream entrada = null;
        try {
            entrada = new ObjectInputStream(new FileInputStream("Productes.dat"));
            Producte a = (Producte) entrada.readObject();
            while (a != null) {
                productes[quants] = a;
                quants++;
                a = (Producte) entrada.readObject();
            }
            entrada.close();
        } catch (Exception ex) {
        }
        return quants;
    }

    public void escriu(Producte productes[], int quants) {
        try {
            ObjectOutputStream sortida = new ObjectOutputStream(new FileOutputStream("Productes.dat"));
            for (int i = 0; i < quants; i++) {
                sortida.writeObject(productes[i]);
            }
            sortida.close();
        } catch (IOException Exception) {
        }

    }
}
