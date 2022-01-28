package domaci.sintakse;

import java.util.Scanner;

public class Sintaksaaa {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
        // tako sto se ivice prostorije ucitavaju preko konzole.
        // (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
        // PRIMER KADA SU ZIDOVI PARALELNI I POTPUNO JEDNAKI U PAROVIMA, RACUNA SE ZA 2*2 ZIDA, KAO I ZA PLAFON!

        double kraciZidIvica1;
        double kraciZidIvica2;

            System.out.print("Upišite dužinu ivice 1, kraceg zida u cm = ");
            kraciZidIvica1 = scanner.nextDouble();

            System.out.print("Upišite dužinu ivice 2, kraceg zida u cm = ");
            kraciZidIvica2 = scanner.nextDouble();

        double kraciZid = kraciZidIvica1 * kraciZidIvica2;

        double duziZidIvica1;
        double duziZidIvica2;

            System.out.print("Upišite dužinu ivice 1, duzeg zida u cm = ");
            duziZidIvica1 = scanner.nextDouble();

            System.out.print("Upišite dužinu ivice 2, duzeg zida u cm = ");
            duziZidIvica2 = scanner.nextDouble();

        double duziZid = duziZidIvica1 * duziZidIvica2;

        double plafonIvica1;
        double plafonIvica2;

            System.out.print("Upišite dužinu ivice 1, plafona u cm = ");
            plafonIvica1 = scanner.nextDouble();

            System.out.print("Upišite dužinu ivice 2, plafona u cm = ");
            plafonIvica2 = scanner.nextDouble();

        double plafon = plafonIvica1 * plafonIvica2;

        double ukupnaPovrsina = plafon + (kraciZid * 2) + (duziZid * 2);

        System.out.print("Ukupna površina okrečene prostorije sa plafonom je = " + ukupnaPovrsina);


    }


    }
