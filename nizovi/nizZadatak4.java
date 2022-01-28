package vezbanjeNaCasu.nizovi;

import java.util.Scanner;

public class nizZadatak4 {
    public static void main(String[] args) {
        //Zadatak 4 - Napraviti niz od 5 elemenata, svaki element uneti preko skenera

        Scanner sc = new Scanner(System.in);
        String[] niz = new String[5];

        //Moze da se stavi String[] niz = new String[n]; gde n upisujemo iz skenera, i on nam odredjuje broj clanova niza



        for (int i = 0; i < niz.length; i++){
            System.out.print("Upisi clan niza ");
            niz[i] = sc.next();
        }
        System.out.println("clanovi niza su: ");
        for (int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);

        }
    }
}
