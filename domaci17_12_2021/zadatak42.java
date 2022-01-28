package domaci.domaci17_12_2021;

public class zadatak42 {
    public static void main(String[] args) {
        //42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

        String[] niz1 = {"Ivana", "Bojan", "Marija", "Zvonko", "Petar", "Ivica", "Marica"};
        provera(niz1);

    }
    public static void provera (String[] lala){
        for (int i = 0; i < lala.length; i++){
            if (lala[i].equals("Marija")){
                System.out.println("U nizu postoji ime Marija");
            //    break;
            }
            if (lala[i].equals("Petar")){
                System.out.println("U nizu postoji ime Petar");
            }
         /*   if (lala[i].equals("Marija") || lala[i].equals("Petar")){
                System.out.println("U nizu postoji ime Marija ili Petar");
            }*/
        }


    }

}
