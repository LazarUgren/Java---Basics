package domaci.domaci14_12_2021;

import java.util.Scanner;

public class zadatak27 {
    public static void main(String[] args) {
        //27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
        //Primer: [1, 2, 3, 4, 5] -> 1 3 5
        //27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite koliko clanova niza zelite: ");
        int[] niz1 = new int[sc.nextInt()];

        for (int i = 0; i < niz1.length; i++) {
            System.out.print("Unesite clan niza: ");
            niz1[i] = sc.nextInt();
        }

        svakiDrugiElementNiza(niz1);

    }
    public static void svakiDrugiElementNiza(int [] nesto) {
        for (int i = 0; i < nesto.length; i++) {
            if (i % 2 == 0) {
                System.out.println(nesto[i]);
            }
        }

    }

}
