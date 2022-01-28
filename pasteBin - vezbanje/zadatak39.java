package pasteBin;

import java.util.Scanner;

public class zadatak39 {
    public static void main(String[] args) {
        //39. Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi br. clanova niza: ");
        int[] niz1 = new int[sc.nextInt()];
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = sc.nextInt();
        }

    }

 /*   public static int zbir(int[] lala) {
        int suma = 0;
        int min = lala[0];
        int max = lala[0];
        for (int i = 0; i < lala.length; i++) {
            if (lala[i] > max) {
                max = lala[i];
            }
        }


    }*/
}
