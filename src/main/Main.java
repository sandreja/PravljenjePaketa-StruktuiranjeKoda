package main;

import domain.Osoba;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Andreja", "Salim", 22);
        //prvi cycle

        Osoba.blokTeksta();
        System.out.println(osoba1.getIme());
    if (osoba1.getIme()=="Andreja") {

        Osoba.pozitivanIshod();
    }
        else Osoba.negativanIshod();


    }


}
