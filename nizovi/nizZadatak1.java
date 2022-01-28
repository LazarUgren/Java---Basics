package vezbanjeNaCasu.nizovi;

public class nizZadatak1 {
    public static void main(String[] args) {
        //Zadatak 1 - Staviti dane u nedelji u niz i ispisati ih
        //Dodatak - Napraviti niz broja dana u nedelji i ispisati pre naziva dana u nedelji

        String[] nizDani = {"Ponedeljak", "Utorak", "Sreda", "Cetvrtak", "Petak", "Subota", "Nedelja"};
        int[] nizBroj = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < nizDani.length; i++) {
            System.out.println(nizBroj[i] + ". dan u nedelji je " + nizDani[i]);
        }



   /*     nizDani[3] = "cetvrtaK";
        for (int i = 0; i < nizDani.length; i++) {
            System.out.println(nizDani[i]);
        }*/



    }
}
