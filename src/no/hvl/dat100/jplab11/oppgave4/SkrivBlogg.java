package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg extends Blogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        String melding = "";

    try {
        String fil1 = ("Blogg.txt");
        File fil = new File(fil1);
        PrintWriter skriver = new PrintWriter (fil1);

        Blogg[] tabell = new Blogg(nesteledige);

        for (int i = 0; i < tabell.lentgh; i++) {
            skriver.println();

            skriver.close();
        }
    }

        catch (FileNotFoundException e) {
            melding = "filen finnes ikke";
        }

    }
}