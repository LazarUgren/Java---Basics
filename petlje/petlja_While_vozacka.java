package vezbanjeNaCasu.petlje;

public class petlja_While_vozacka {
    public static void main(String[] args) {
        //Napravi program koji kaze da li osoba moze da ima vozacku dozvolu. ako ima manje od 18 ne moze, ako ima 18 -65 moze, ako ima vise od 65 ne moze

        int i = 25;

        while (i <= 100) {
            if (i < 18){
                System.out.println("Imate " + i + "godina. Maloletnim licima ne izdajemo dozvlo");
            } else if (i >=18 && i <65){
                System.out.println("imate " + i + " godina. mozete imati dozvlo");
            } else if (i < 100){
                System.out.println("imate "+ i + "prestari ste, ne mozete imati dozvolu");
            }
            i++;
        }
    }
}
