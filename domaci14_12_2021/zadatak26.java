package domaci.domaci14_12_2021;

import java.util.Scanner;

public class zadatak26 {
    public static void main(String[] args) {
        //26. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
        //Primer: [4, 2, 3, 5] -> 5 3 2 4
        //26* Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite koliko clanova niza zelite: ");
        int n = sc.nextInt();
        int[] nizB = new int[n];

        for (int i = 0; i < nizB.length; i++){
            System.out.print("Upisite clanova niza: ");
            nizB[i] = sc.nextInt();
        }

        obrnutiNiz(nizB);

    }

    public static void obrnutiNiz(int [] ksenija) {

        for (int i =ksenija.length - 1;  i >= 0;  i--) {
            System.out.print(ksenija[i]);

        }

    }
}
