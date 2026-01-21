package domain;

public class Osoba {
    private String ime;
    private String prezime;
    private int brojGodina;

    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }
    public static void blokTeksta() {
        System.out.println("Da li je ova osoba kul?");
        System.out.println("Ko je u pitanju?");
    }
    public static void pozitivanIshod(){
        System.out.println("Ova osoba je kul.");
    }
    public static void negativanIshod(){
        System.out.println("Ova osoba je malo manje kul.");
    }
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }
}
