package vezbanjeNaCasu.nizovi;

import java.util.Scanner;

public class nizZadatakDodatni {
    public static void main(String[] args) {
        // Napisati program gde korisnik unosi brojeve preko skenera sve dok ne ponovi dva ista unosa.
        // dva uzastopna ista broja

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi velicinu niza: ");
        int[] broj = new int[sc.nextInt()];

        System.out.println("Unesite clan niza: ");
        broj[0] = sc.nextInt();

        for (int i = 1; i < broj.length; i++){
            broj[i] = sc.nextInt();
            if (broj[i] == broj[i-1]){
                break;
            }
        }

    }
}
