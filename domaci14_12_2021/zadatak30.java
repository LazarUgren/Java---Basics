package domaci.domaci14_12_2021;

import java.util.Scanner;

public class zadatak30 {
    public static void main(String[] args) {
        //30. Izracunati proizvod elemenata tog niza.
        //Primer: [2, 4] -> 8
        //30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite koliko clanova niza zelite: ");
        int[] nizBrojeva = new int[sc.nextInt()];
        System.out.println("Upisite clanove niza: ");
        for (int i = 0; i < nizBrojeva.length; i++) {
            nizBrojeva[i] = sc.nextInt();
        }
        proizvod(nizBrojeva);

    }

    public static void proizvod(int[] pro) {
        int proizvodNiza = 1;
        for (int i = 0; i < pro.length; i++) {
            proizvodNiza = pro[i] * proizvodNiza;
        }
        System.out.println(proizvodNiza);

    }
}

