package pasteBin;

import java.util.Scanner;

public class zadatak18 {
    public static void main(String[] args) {
        //18. Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();

        int min = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("unesi broj x: ");
            int x = sc.nextInt();

            if (x > max) {
                max = x;
            }
            if (x < min){
                min = x;
            }

        }
        System.out.println("Najveci broj je " + max);
        System.out.println("Najmanji broj je " + min);

    }
}



