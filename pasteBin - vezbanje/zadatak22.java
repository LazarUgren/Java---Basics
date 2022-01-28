package pasteBin;

import java.util.Scanner;

public class zadatak22 {
    public static void main(String[] args) {
        //Za unetu visinu h, iscrtati desnu Mario kulu.

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite visinu: ");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++){
            for (int j = i; j <= h; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
