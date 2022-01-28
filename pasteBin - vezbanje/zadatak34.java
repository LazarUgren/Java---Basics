package pasteBin;

import java.util.Scanner;

public class zadatak34 {
    public static void main(String[] args) {
        //34. Napisati funkciju koja vraca najveci element niza. (Prosledjujemo niz, vracamo broj)

        Scanner sc = new Scanner(System.in);
        System.out.println("Upisis koliko clanova hoces: ");
        int[] niz1 = new int[sc.nextInt()];
        for (int i = 0; i < niz1.length; i++){
            niz1[i] = sc.nextInt();
        }

        int x = najveciElementNiza(niz1);

        System.out.println(x);

    }
    public static int najveciElementNiza (int[] sljiva){
        int max = sljiva[0];

        for (int i = 0; i < sljiva.length; i++){
            if (max < sljiva[i]){
                max = sljiva[i];
            }
        }
        return max;
    }
}
