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
     * @.pre maa != null && arvo != null
     * @.post FORALL (int i =1  : i < 15 : i++)
     *        (RESULT == "ruutu " + i) ||
     *        (RESULT == "hertta " + i) ||
     *        (RESULT == "pata " + i) ||
     *        (RESULT == "risti " +i)
     */

    public static String määritäKortti (String maa, String arvo){
        //* Metodi muuttaa pelaajan antamat syötteet yhdeksi String-tyyppiseksi kortiksi
        //* Tarkistetaan että pelaajan antama syöte on kelvollinen.
        if(maa != "ruutu" || maa != "risti" || maa != "pata" || maa!= "hertta") {
            System.out.println("Syötä validi maa.");
        }
        int arvoint = Integer.parseInt(arvo);
        if (0 < arvoint  && arvoint < 14) {
            System.out.println("Anna arvo välillä 1-13.");
        }
        String card = maa + " " + arvo;
        System.out.println("Annettu kortti on " + card );
        return card;
    }

    /**
     * Palauttaa tiedon, onko käsikorteissa kahta saman arvoista korttia (=paria)
     * @.pre käsi.length() == 5
     * @.post (RESULT == true) ||
     *        (RESULT == false)
     */
    public static boolean sisältääParin(ArrayList<String> käsi) {
        //* Metodi käy läpi käsikortit, ja tarkistaa, onko korteissa kahta saman arvoista korttia

        ArrayList<String[]> kortit = new ArrayList<>();

        //* Erotetaan korteista arvot

        for (int i = 0; i < 5; i++) {
            String indeksi = käsi.get(i);
            kortit.add(indeksi.split(" "));
            for (int j = 0; j < kortit.size(); j++) {
                kortit.remove(kortit.size() - 2);
            }

        }

        //* Verrataan korttien arvoja toisiinsa parien löytämiseksi

        for (int i = 0; i < kortit.size(); i++) {
            for (int j = kortit.size() - 1; j >= 0; j--) {
                if (kortit.get(i) == kortit.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
