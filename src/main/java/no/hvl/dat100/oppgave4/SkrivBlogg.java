package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        PrintWriter writer = null; // Variabel for å skrive til filen
        try {
            // Oppretter filbanen ved å kombinere mappen og filnavnet
            String fullFilbane = mappe + "/" + filnavn;
            
            // Initialiserer PrintWriter for å skrive til filen
            writer = new PrintWriter(fullFilbane);
            
            // Skriver samlingens innhold til filen
            writer.print(samling.toString());
            
            // Hvis alt går bra, returner true
            return true;
        } catch (FileNotFoundException e) {
            // Håndterer feil hvis filen ikke kan åpnes
            System.err.println("Filen ble ikke funnet eller kunne ikke åpnes: " + e.getMessage());
            return false;
        } catch (Exception e) {
            // Håndterer andre uforutsette feil
            System.err.println("En feil oppstod: " + e.getMessage());
            return false;
        } finally {
            // Sørger for at PrintWriter blir lukket, uavhengig av om det oppstod en feil eller ikke
            if (writer != null) {
                writer.close();
            }
        }
    }
}
