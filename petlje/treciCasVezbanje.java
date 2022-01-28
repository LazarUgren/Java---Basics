package vezbanjeNaCasu.petlje;

import java.util.Scanner;

public class treciCasVezbanje {
    public static void main(String[] args) {
        System.out.println("pocetak");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        while (i < 10) {
            System.out.println("ovo je petlja" + i);
            i++; // inkrementacija
            // ako stavimo i-- kreiramo beskonacnu petlju i program stalno radi, i bice gde se dimi, sta se dimi, dimi mi se kompjuter
        }

        System.out.println("kraj");



    }
}
