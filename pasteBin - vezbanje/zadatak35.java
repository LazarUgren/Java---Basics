package pasteBin;

import java.util.Scanner;

public class zadatak35 {
    public static void main(String[] args) {
        //35. Napisati funkciju koja vraca najmanji element niza.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi koliko niz hoces");
        int[] niz1 = new int[sc.nextInt()];
        System.out.println("unesi clanove niza");
        for (int i = 0; i < niz1.length; i++){
            niz1[i] = sc.nextInt();
        }
        int x = najmanjiClanNiza(niz1);
        System.out.println(x);
    }

    public static int najmanjiClanNiza (int[] lala){
        int min = lala[0];
        for (int i = 0; i < lala.length; i++){
            if (min > lala[i]){
                min = lala[i];
            }
        }
        return  min;
    }
}
