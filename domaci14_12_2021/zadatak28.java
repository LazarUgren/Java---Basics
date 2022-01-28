package domaci.domaci14_12_2021;

import java.util.Scanner;

public class zadatak28 {
    public static void main(String[] args) {
        //28. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
        //Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
        //28* Napraviti funkciju koja vraca sumu prosledjenog niza.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite koliko clanova niza zelite: ");
        int[] nizBrojeva = new int[sc.nextInt()];

        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.print("Unesite clan niza: ");
            nizBrojeva[i] = sc.nextInt();
        }
        sumaClanovaNiza(nizBrojeva);
    }
        public static void sumaClanovaNiza(int [] niz) {
        int suma = 0;
        for (int i = 0; i < niz.length; i++){
            suma = suma + niz[i];
        }
            System.out.println(suma);
        }


}
