package pasteBin;

import java.util.Scanner;

public class zadatak21levaMarioKula {
    public static void main(String[] args) {
        //Za unetu visinu h, iscrtati levu Mario kulu. Npr za h = 5:

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite koliko redova hoces: ");
        int h = sc.nextInt();

        String x = " ";

        for (int i = 1; i <= h; i++) {
            x = x + "*";
            System.out.println(x);
        }


    }
}
