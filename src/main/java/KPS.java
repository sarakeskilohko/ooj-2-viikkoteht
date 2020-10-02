import java.util.*;
public class KPS {


    public static void main(String[] args) {
        String pelaaja1 = new Scanner(System.in).nextLine();
        String pelaaja2 = new Scanner(System.in).nextLine();

        //* Vaihdetaan syötteet pieniksi kirjaimiksi koodin ja määrittelyjen helpottamiseksi.
        pelaaja1.toLowerCase();
        pelaaja2.toLowerCase();

        int voittaja = pelaaKierros(pelaaja1, pelaaja2);

        if (voittaja == 0) {
            System.out.println("Peli oli tasapeli");
        }
        if (voittaja == 1) {
            System.out.println("Pelin voitti pelaaja1");
        }
        if (voittaja == 2) {
            System.out.println("Pelin voitti pelaaja2");
        }
    }

    /**
     * @.pre pelaaja1 == "kivi" || "paperi" || "sakset"
     *      && pelaaja2 == "kivi" || "paperi" || "sakset"
     * @.post
     */
    public static int pelaaKierros() {
        //* Metodi vertaa pelaajien syöttämiä sanoja, ja selvittää, kumpi pelaajista voitti
        //* Metodi palauttaa voittaneen pelaajan numeron (1 tai 2)

    }


}
