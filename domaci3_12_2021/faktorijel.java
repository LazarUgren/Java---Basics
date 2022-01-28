package domaci.domaci3_12_2021;

import java.util.Scanner;

public class faktorijel {
    public static void main(String[] args) {
        // 3. Faktorijel. Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
        // Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao:
        // n! = n * (n-1) * (n-2) * ... * 2 * 1. Dakle, npr: 5! = 5 * 4 * 3 * 2 * 1 = 120 3! = 3 * 2 * 1 = 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Faktorijel brojeva");

        int faktorijel = 1;
        System.out.print("Upisite broj za koji zelite da se izracuna faktorijel: ");

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            faktorijel = faktorijel * i;
        }

        System.out.println("Faktorijel broja " + x + " je " + faktorijel);



    }
}
