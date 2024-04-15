package main;

import java.util.Random;


public class Jatekos {
    Random rnd = new Random();
    int tipp = rnd.nextInt(10);
    void tippel(){
        System.out.println("tippelésem: " + tipp);
    }
}
