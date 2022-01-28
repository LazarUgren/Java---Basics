package pasteBin;

import java.util.Scanner;

public class zadatak6proizvodCelihBrojevaFaktorijel {
    public static void main(String[] args) {
        //6. Ispisati proizvod prvih n celih brojeva [1, n].

        Scanner sc = new Scanner(System.in);

        System.out.print("Upisati broj n: ");
        int n = sc.nextInt();

        int faktor = 1;

        for (int i = 1; i <= n; i++) {
            faktor = faktor * i;
        }
        System.out.println("Faktorijel broja " + n + " je " + faktor);


    }
}
