package vezbanjeNaCasu.petlje;

public class petljaUnutarPetlje { // koristi se kada hocemo da izvucemo sve kolone iz exela u jednom testu
    public static void main(String[] args) {

        System.out.println("pocetak programa");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("ispis j " + j);
            }
            System.out.println("ispis iz prve petlje " + i);

            for (int k = 1; k <=3; k++) {
                System.out.println("ispis iz druge subputlje " + k);
            }
        }

        System.out.println("kraj programa");

    }
}
