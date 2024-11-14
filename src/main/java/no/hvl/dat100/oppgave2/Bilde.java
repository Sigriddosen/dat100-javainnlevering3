package no.hvl.dat100.oppgave2;

import no.hvl.dat100.oppgave1.*;


public class Bilde extends Tekst {

    // Objektvariabel for bilde-URL
    private String url;

    // Konstruktør som tar id, bruker, dato, tekst og url
    public Bilde(int id, String bruker, String dato, String tekst, String url) {
        super(id, bruker, dato, tekst); // Kaller konstruktøren i superklassen Tekst
        this.url = url; // Setter URL-en for bildet
    }

    // Konstruktør som tar id, bruker, dato, likes, tekst og url
    public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
        super(id, bruker, dato, likes, tekst); // Kaller konstruktøren i superklassen Tekst
        this.url = url; // Setter URL-en for bildet
    }

    // Getter for URL
    public String getUrl() {
        return url;
    }

    // Setter for URL
    public void setUrl(String url) {
        this.url = url;
    }

    // Override toString() for å inkludere bilde-URL i tekstrepresentasjonen
    @Override
    public String toString() {
        return "BILDE\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {
        return "<html><body><h1>Bildeinnlegg</h1><p>Id: " + getId() + "</p><p>Bruker: " + getBruker() + "</p><p>Dato: " + getDato() + "</p><p>Likes: " + getLikes() + "</p><p>Tekst: " + getTekst() + "</p><p>URL: <a href=\"" + url + "\">" + url + "</a></p></body></html>";
    }
}

