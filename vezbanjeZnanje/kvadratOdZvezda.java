package vezbanjeZnanje;

import java.util.Scanner;

public class kvadratOdZvezda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite koliko redova hoces: ");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++){   // broj redova
            for (int j = i; j <= h; j++) {   // broj zvezdica. kada je j <= i onda stampa onoliko zvezdica koliko je i
                System.out.print("* ");
            }
            System.out.println();
        }



        //obnuti trougao *****
        //                ****
        //                 ***
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= h; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // jelkica
        for (int i = 1; i <= h; i++) {
            for (int j = i; j <= h; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < i; k ++) {
                System.out.print("* ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //obrnuti trougao *********
        //                 *******
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for (int k = i; k <= h; k++){
                System.out.print("* ");
            }
            for (int l = i; l < h; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i < h; i++){
            for (int j = i; j <= h; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            for (int l = 1; l < i; l++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i =1; i <=h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= h; k++) {
                System.out.print("* ");
            }
            for (int l = i; l < h; l++){
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
