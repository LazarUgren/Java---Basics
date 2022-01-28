package pasteBin;

import java.util.Scanner;

public class zadatak37 {
    //37. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
    //Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("upisi duzinu niza: ");
        int[] niz1 = new int[sc.nextInt()];
            System.out.println("Upisi clanove niza: ");
        for (int i = 0; i < niz1.length; i++){
            niz1[i] = sc.nextInt();
        }

        int[] niz2 = new int[niz1.length];
            System.out.println("Upisi clanove niza: ");
        for (int i = 0; i < niz2.length; i ++){
            niz2[i] = sc.nextInt();
        }
        int[] x= sabraniNizovi(niz1, niz2);
            System.out.println("novi niz je: ");
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }

    public static int[] sabraniNizovi(int[] niz1, int[] niz2){
        int[] niz3 = new int [niz1.length];
        for (int i = 0; i < niz1.length; i++){
            niz3[i] = niz1[i] + niz2[i];
        }
        return niz3;
    }

}
