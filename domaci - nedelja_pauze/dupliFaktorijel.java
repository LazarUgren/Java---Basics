package nedeljaPauzeZadaciVezbanje.domaci;

import java.util.Scanner;

public class dupliFaktorijel {
    public static void main(String[] args) {
        //[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetog broja n.
        // Dupli faktorijel broja n je:
        // n!! = n * (n-2) * (n-4) * ... * (2 ili 1)

        Scanner sc = new Scanner(System.in);
        int dupliFact = 1;

        System.out.print("Upisite broj x: ");
        int n = sc.nextInt();

        for (int i = n; i > 1; i-=2) {  //mora da se krene od broja n kako bi racunanje bilo tacno. ako se krene od 1 onda ne moze!
            dupliFact = dupliFact * i;

        }
        System.out.println(dupliFact);

    }
}
