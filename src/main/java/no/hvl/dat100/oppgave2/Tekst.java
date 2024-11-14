package no.hvl.dat100.oppgave2;

import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

    // Objektvariabel for tekstinnhold
    private String tekst;

    // Konstruktør som tar id, bruker, dato, tekst
    public Tekst(int id, String bruker, String dato, String tekst) {
        super(id, bruker, dato); // Kaller konstruktøren i superklassen Innlegg
        this.tekst = tekst; // Setter tekstinnholdet
    }

    // Konstruktør som tar id, bruker, dato, likes, tekst
    public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        super(id, bruker, dato, likes); // Kaller konstruktøren i superklassen Innlegg
        this.tekst = tekst; // Setter tekstinnholdet
    }

    // Getter for tekst
    public String getTekst() {
        return tekst;
    }

    // Setter for tekst
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    // Override toString() for å returnere tekstrepresentasjonen av innlegget
    @Override
    public String toString() {
        return "TEKST\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + tekst + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {
        return "<html><body><h1>Tekstinnlegg</h1><p>Id: " + getId() + "</p><p>Bruker: " + getBruker() + "</p><p>Dato: " + getDato() + "</p><p>Likes: " + getLikes() + "</p><p>Tekst: " + tekst + "</p></body></html>";
    }
}

