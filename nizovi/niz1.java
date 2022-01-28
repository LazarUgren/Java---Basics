package vezbanjeNaCasu.nizovi;

public class niz1 {
    public static void main(String[] args) {

        String[] nizSlatkisa = {"Cokolada", "Karamela", "Sladoled", "Voce"};

        for (int i = 0; i < nizSlatkisa.length; i++) {
            System.out.println(nizSlatkisa[i]);
        }


        nizSlatkisa[1] = "Vanila";                  //mogu da se dodeljuju novi, odnosno prepravljaju stari unosi iz nisa
        for (int i = 0; i < nizSlatkisa.length; i++) {
            System.out.println(nizSlatkisa[i]);
        }
    }
}
