import java.util.*;
public class Pokeri {

    public static void main(String[] args) {
        ArrayList<String> käsi = new ArrayList<String> (5);

        System.out.println("Syötä kortin maa");
        System.out.println("Syötä kortin arvo numeroilla 1-13 (ässä=1, jätkä=11, kuningatar=12 ja kuningas=13");
        for(int i=0; i<5; i++) {
            String maa = new Scanner(System.in).nextLine();
            String arvo = new Scanner(System.in).nextLine();

            //* Muutetaan syötteet pieniksi kirjaimiksi määrittelyn helpottamiseksi
            maa.toLowerCase();
            arvo.toLowerCase();

            String kortti = määritäKortti(maa, arvo);
            käsi.add(kortti);
        }

        boolean käsiSisältääParin = sisältääParin(käsi);

        System.out.println("Käsi " +
                (käsiSisältääParin ? "sisältää parin" : "ei sisällä paria")
        );
    }

    /**
     * Palauttaa pelaajan valitseman kortin maan ja arvon (=kortin)
     * @.pre maa == "ruutu" || "hertta || "pata" || "risti"
     *          && 0 < arvo < 14
     * @.post true
     */
    public static String määritäKortti (String maa, String arvo){
        //* Metodi muuttaa pelaajan antamat syötteet yhdeksi String-tyyppiseksi kortiksi
        String card = maa + " " + arvo;
        System.out.println("Annettu kortti on " + card );
        return card;
    }

    /**
     * Palauttaa tiedon, onko käsikorteissa kahta saman arvoista korttia (=paria)
     * @.pre käsi.length() == 5
     * @.post
     */
    public static boolean sisältääParin(ArrayList<String> käsi) {
        //* Metodi käy läpi käsikortit, ja tarkistaa, onko korteissa kahta saman arvoista korttia

    }


}
