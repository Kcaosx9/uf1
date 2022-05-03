package Pt2;

import Ex_base_dades.Alumne;
import java.util.Scanner;

/**
 *
 * @author albert
 */
public class ProgramaProductes {

    public static void main(String[] args) {
        Producte productes[] = new Producte[50];
        GestioFitxer g = new GestioFitxer();
        int quants = g.llegeix(productes);

        String product[] = {
            "4LIFE TRANSFER FACTOR PLUS 90 TBS",
            "AB SOLUTION PLUS 240ml",
            "ABRASONE RECTAL crema 30 gr.",
            "ABRAXANE 100mg 1vial 50ml",
            "ACID HYALURONIC 20MG 30CAPS",
            "ACID HYALURONIC 60MG 30CAPS TRIPLE STRENGTH",
            "ACIDOPHILUS PLUS 60caps",
            "ACOMPLIA 20mg 28 tabs",
            "ACT eau dentaire fluor classic cinnamon fl 400 ml",
            "ACTOVEGIN 10 ML 5 AMP",
            "ACTOVEGIN FORTE 200 mg 100 dragees",
            "ACTOVEGIN INJ. 5 X 5 ML",
            "ADRENALIN 1:1000 ( 1mg/ ml ) 10x1 ml",
            "AETHOXYSKLEROL 0.25% 5Ampo 2ml",
            "AETHOXYSKLEROL 0.5% 5 Ampo 2ml",
            "AETHOXYSKLEROL 1% 30 ml VIAL",
            "AETHOXYSKLEROL 1% 5x2ml",
            "AETHOXYSKLEROL 2% 5x2ml",
            "AETHOXYSKLEROL 3% 5 Amp 2ml",
            "AETHOXYSKLEROL 4% 5x2ml",
            "AGGRENOX  200/25mg 60 caps",
            "AGIOCUR Granulat 250g",
            "AGIOLAX MITE 1000gr",
            "AHAVA CREMA CORPORAL VAINILLA 300 GR.",
            "AHAVA DERMUD BODY MILK 250 ml.",
            "AHAVA DERMUD CR.HUMECTANT CALMANT 50 ML SPF15",
            "AHAVA DERMUD CREMA COLZES I GENOLLS 75 ml.",
            "AHAVA DERMUD CREMA CORPORAL 200 ML.",
            "AHAVA DERMUD CREMA MANS 125 ML",
            "AHAVA DERMUD CREMA NUTRITIVA 50 ML"};

        int vendesTrim[][] = {
            {290, 316, 877, 924},
            {339, 874, 158, 359},
            {485, 754, 80, 38},
            {490, 358, 628, 330},
            {52, 118, 852, 463},
            {925, 69, 164, 458},
            {234, 680, 342, 758},
            {290, 316, 877, 924},
            {339, 874, 158, 359},
            {485, 754, 80, 38},
            {490, 358, 628, 330},
            {52, 118, 852, 463},
            {925, 69, 164, 458},
            {234, 680, 342, 758},
            {290, 316, 877, 924},
            {339, 874, 158, 359},
            {485, 754, 80, 38},
            {490, 358, 628, 330},
            {52, 118, 852, 463},
            {925, 69, 164, 458},
            {234, 680, 342, 758},
            {290, 316, 877, 924},
            {339, 874, 158, 359},
            {485, 754, 80, 38},
            {490, 358, 628, 330},
            {52, 118, 852, 463},
            {925, 69, 164, 458},
            {234, 680, 342, 758},
            {485, 754, 80, 38},
            {490, 358, 628, 330}};

        for (int i = 0; i < product.length; i++) {
            Producte pro = new Producte();
            pro.nom = product[i];

            for (int j = 0; j < vendesTrim[i].length; j++) {
                pro.vendesTrimestrals = vendesTrim[j];
                 System.out.println(pro.nom + " = " + pro.vendesTrimestrals[i]);

            }
            productes[quants] = pro;
            quants++;
           
        }

        //Aquí anirà el teu codi
        final String missatgeEntrada = "Introdueix un valor entre 1 i 8";
        final String missatgeNumero = "Has d'introduir un valor numèric";
        final String menu = "1. \n"
                + "2. \n"
                + "3. \n"
                + "4. \n"
                + "5. \n"
                + "6. \n"
                + "7. \n"
                + "8. Sortir\n"
                + "Tria una opció: ";

        int opcio = 0;
        Scanner lector = new Scanner(System.in);

        while (opcio
                != 8) {

            System.out.print(menu);

            if (lector.hasNextInt()) {

                opcio = lector.nextInt();
                switch (opcio) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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
        g.escriu(productes, quants);
    }
}
