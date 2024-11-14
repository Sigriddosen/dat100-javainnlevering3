package no.hvl.dat100.oppgave1;

public abstract class Innlegg {

    // Objektvariabler (private for å sikre kapsling)
    private int id;
    private String bruker;
    private String dato;
    private int likes;

    // Konstruktør som tar tre parametre
    public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0; // setter likes til 0 som standard
    }

    // Konstruktør som tar fire parametre
    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

    // Get-metode for id
    public int getId() {
        return id;
    }

    // Get-metode for bruker
    public String getBruker() {
        return bruker;
    }

    // Set-metode for bruker
    public void setBruker(String bruker) {
        this.bruker = bruker;
    }

    // Get-metode for dato
    public String getDato() {
        return dato;
    }

    // Set-metode for dato
    public void setDato(String dato) {
        this.dato = dato;
    }

    // Get-metode for likes
    public int getLikes() {
        return likes;
    }

    // Metode som øker antall likes med 1
    public void doLike() {
        this.likes++;
    }

    // Metode som sammenligner id for to innlegg
    public boolean erLik(Innlegg innlegg) {
        return this.id == innlegg.getId();
    }

    // toString-metode som gir en tekststrengrepresentasjon
    @Override
    public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {
        return "<html><body><h1>Innlegg</h1><p>Id: " + id + "</p><p>Bruker: " + bruker + "</p><p>Dato: " + dato + "</p><p>Likes: " + likes + "</p></body></html>";
    }
}

