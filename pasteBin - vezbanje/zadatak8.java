package pasteBin;

import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
        //8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        //	"Dobrodosao u {x}. razred, {ime} {prezime}",
        //	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
        //	A ako korisnik nije djak ispisati jednu odgovarajucu
        //    poruku od: "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite ime: ");
        String ime = sc.next();
        System.out.print("Upisite prezime: ");
        String prezime = sc.next();
        System.out.print("Upisite godinu rodjenja: ");
        int godina = sc.nextInt();

        int godinaR = 2021 - godina;


            if (godinaR <= 6) {
                System.out.println(ime + prezime + " tek treba da zapocne obrazovanje");
            } else if (godinaR == 7) {
                System.out.println("Dobrodosao u prvi razred! "+ ime + " " + prezime);
            } else if (godinaR == 8) {
                System.out.println("Dobrodosao u drugi razred! "+ ime + " " + prezime);
            } else if (godinaR == 9) {
                System.out.println("Dobrodosao u treci razred! "+ ime + " " + prezime);
            } else if (godinaR == 10) {
                System.out.println("Dobrodosao u cetvrti razred! "+ ime + " " + prezime);
            } else if (godinaR == 11) {
                System.out.println("Dobrodosao u peti razred! "+ ime + " " + prezime);
            } else if (godinaR == 12) {
                System.out.println("Dobrodosao u sesti razred! "+ ime + " " + prezime);
            } else if (godinaR == 13) {
                System.out.println("Dobrodosao u sedmi razred! "+ ime + " " + prezime);
            } else if (godinaR == 14) {
                System.out.println("Dobrodosao u osmi razred! "+ ime + " " + prezime);
            } else if (godinaR == 15) {
                System.out.println("Dobrodosao u deveti razred! "+ ime + " " + prezime);
            } else if (godinaR == 16) {
                System.out.println("Dobrodosao u deseti razred! "+ ime + " " + prezime);
            } else if (godinaR == 17) {
                System.out.println("Dobrodosao u jedanaesi razred! "+ ime + " " + prezime);
            } else if (godinaR == 18) {
                System.out.println("Dobrodosao u dvanaesti razred! "+ ime + " " + prezime);
            } else {
                System.out.println(ime + " " + prezime + " je zavrsio/la skolu! Cestitamo");
            }








    }
}
