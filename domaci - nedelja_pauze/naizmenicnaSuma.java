package nedeljaPauzeZadaciVezbanje.domaci;

import java.util.Scanner;

public class naizmenicnaSuma {
    public static void main(String[] args) {
        //[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole.
        // Na standardni izlaz ispisati resenje izraza:
        //1 - 2 + 3 - 4 + 5.... (+/-) n.

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                suma = suma + i;
            } else if (i % 2 == 0) {
                suma = suma - i;
            }
        }
        System.out.println(suma);

    }
}
