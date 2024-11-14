package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;

    public Blogg() {
        this(20); // Kaller den andre konstruktøren med lengde 20
    }

    public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
        nesteledig = 0; // Starter på første ledige posisjon
    }

    public int getAntall() {
        return nesteledig;
    }

    public Innlegg[] getSamling() {
        return innleggtabell;
    }

    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i; // Returnerer posisjonen til innlegget
            }
        }
        return -1; // Fant ikke innlegget
    }

    public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
    }

    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;
    }

    public boolean leggTil(Innlegg innlegg) {
        if (finnes(innlegg)) {
            return false; // Innlegget finnes allerede, legg det ikke til
        }
        if (ledigPlass()) {
            innleggtabell[nesteledig] = innlegg; // Legger til innlegget
            nesteledig++; // Øker posisjonen for neste innlegg
            return true;
        }
        return false; // Ingen plass til å legge til
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nesteledig).append("\n"); // Først, antall innlegg
        for (int i = 0; i < nesteledig; i++) {
            sb.append(innleggtabell[i].toString()); // Legger til innlegget
        }
        return sb.toString();
    }
}
