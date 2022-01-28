package domaci.sintakse;

import java.util.Scanner;

public class Sintaksaaaa1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
        // tako sto se ivice prostorije ucitavaju preko konzole.
        // (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
        // PRIMER KADA ZIDOVI NISU PARALELNI I POTPUNO JEDNAKI, RACUNA SE ZA SVA 4 ZIDA POSEBNA POVRSINA, KAO I ZA PLAFON!


                System.out.print("Upišite dužinu ivice 1, prvog zida u cm = ");
            double prviZidIvica1 = scanner.nextDouble();

                System.out.print("Upišite dužinu ivice 2, prvog zida u cm = ");
            double prviZidIvica2 = scanner.nextDouble();


            double prviZid = prviZidIvica1 * prviZidIvica2;

                System.out.print("Upišite dužinu ivice 1, drugog zida u cm = ");
            double drugiZidIvica1 = scanner.nextDouble();

                System.out.print("Upišite dužinu ivice 2, drugog zida u cm = ");
            double drugiZidIvica2 = scanner.nextDouble();

                double drugiZid = drugiZidIvica1 * drugiZidIvica2;

                System.out.print("Upišite dužinu ivice 1, trećeg zida u cm= ");
            double treciZidIvica1 = scanner.nextDouble();

                System.out.print("Upišite dužinu ivice 2, trećeg zida u cm= ");
            double treciZidIvica2 = scanner.nextDouble();


                double treciZid = treciZidIvica1 * treciZidIvica2;

                System.out.print("Upišite dužinu ivice 1, četvrtog zida u cm = ");
            double cetvrtiZidIvica1 = scanner.nextDouble();

                System.out.print("Upišite dužinu ivice 2, četvrtog zida u cm = ");
            double cetvrtiZidIvica2 = scanner.nextDouble();

                double cetvrtiZid = cetvrtiZidIvica1 * cetvrtiZidIvica2;

                System.out.print("Upišite dužinu ivice 1, plafona u cm = ");
            double plafonIvica1 = scanner.nextDouble();

                System.out.print("Upišite dužinu ivice 2, plafona u cm = ");
            double plafonIvica2 = scanner.nextDouble();

                double plafon = plafonIvica1 * plafonIvica2;

            double ukupnaPovrsina = prviZid + drugiZid + treciZid + cetvrtiZid + plafon;
                System.out.println("Ukupna površina okrečenih zidova, u kvadratnim cm je = " + ukupnaPovrsina);



    }
}
