/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_base_dades;

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

    public int llegeix(Alumne alumnes[]) {
        int quants = 0;
        ObjectInputStream entrada = null;
        try {
            entrada = new ObjectInputStream(new FileInputStream("Alumnes.dat"));
            Alumne a = (Alumne) entrada.readObject();
            while (a != null) {
                alumnes[quants] = a;
                quants++;
                a = (Alumne) entrada.readObject();
            }
            entrada.close();
        } catch (Exception ex) {
            
        }
        return quants;
    }

    public void escriu(Alumne alumnes[], int quants) {
        try {
            ObjectOutputStream sortida = new ObjectOutputStream(new FileOutputStream("Alumnes.dat"));
            for (int i = 0; i < quants; i++) {
                sortida.writeObject(alumnes[i]);
            }
            sortida.close();
        } catch (IOException Exception) {
        }

    }
}
