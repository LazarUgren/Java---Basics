package vezbanjeNaCasu.petlje;

public class petlje {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 3) {
            System.out.println(i + "ovo je petlja");
            i++;
        }

        do {
            System.out.println(i + "ovo je petlja");
            i++;
        } while (i <= 3);

        for (i = 1; i <= 3; i++) {
            System.out.println(i + "ovo je petlja");
        }




    }
}
