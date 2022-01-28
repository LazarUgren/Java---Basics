package vezbanjeZnanje;

import java.util.Scanner;

public class najmanjiOdNucitanih {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int x;
        int min;

        System.out.print("Brojeva za proveru ");
        n = sc.nextInt();

        System.out.print("Otkcuaj 1. broj ");
        x = sc.nextInt();
        min = x;

        for (int i=2; i<= n; i++){
            System.out.print("Otkcuaj " + i + ". broj ");
            x = sc.nextInt();
            min = x;
            if (x < min)
                min = x;
        }
        System.out.println("Najmanji broj je " + min);

    }
}
