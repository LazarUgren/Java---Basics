package pasteBin;

import java.util.Scanner;

public class zadatak36 {
    public static void main(String[] args) {
        //36. Napisati funkciju koja duplira sve lemente niza, (Dakle prosledjujemo niz, vracamo niz)
        //Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]

        Scanner sc = new Scanner(System.in);
        System.out.println("Upisi koliko clanova niza zelis: ");
        int[] niz1 = new int[sc.nextInt()];
        for (int i = 0; i < niz1.length; i++){
            niz1[i] = sc.nextInt();
        }
        int[] dupli = dupliNiz(niz1);
        for (int i = 0; i < dupli.length; i ++){
            System.out.println(dupli[i]);
        }
    }
    public static int[] dupliNiz (int [] lala){
        int[] niz2 = new int[lala.length];
        for (int i = 0; i < lala.length; i ++){
            niz2[i] = lala[i] + lala[i];
        }
        return niz2;
    }
}
