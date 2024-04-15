package main;

import java.util.Random;

public class Jatek {

    Random rnd = new Random();
    Jatekos jatekos1 = new Jatekos();
    Jatekos jatekos2 = new Jatekos();
    Jatekos jatekos3 = new Jatekos();

    public Jatek() {
        start();
    }

    void start() {
        System.out.println("Gondoltam egy számra, 0 és 9 között...");
        int szam = rnd.nextInt(10);
        System.out.println("a kitalálandó szám: " + szam);
        jatekos1.tippel();
        jatekos2.tippel();
        jatekos3.tippel();
    }
}
