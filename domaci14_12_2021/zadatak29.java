package domaci.domaci14_12_2021;

import java.util.Scanner;

public class zadatak29 {
    public static void main(String[] args) {
        //29. -//-. Ispisati svaki treci element u obrnutom redosledu.
        //Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        //29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite koliko clanova niza zelite: ");
        int[] nizB = new int[sc.nextInt()];

        for (int i = 0; i < nizB.length; i++){
            System.out.print("Upisite clan niza: ");
            nizB[i] = sc.nextInt();
        }
        svakiTreciClanNiza(nizB);
    }
        public static void svakiTreciClanNiza(int[] saksija) {
        for (int i = saksija.length-1; i >= 0; i = i-3) {
            System.out.println(saksija[i]);
        }
        }
}
