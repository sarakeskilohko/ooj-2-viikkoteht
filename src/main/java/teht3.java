import java.util.*;
public class teht3 {


    //* Tehtävä: määrittele seuraavien esitystapa:
    //
    // 1. Tiedonsiirron nopeus
    // 2. Murtoluku
    // 3. (Suomalainen) henkilön nimi
    // 4. (Suomalainen) puhelinnumero
    // 5. Henkilö sukututkimusohjelmassa (yksinkertaisimmillaan, kun halutaan vain selvittää sukulaisuussuhteita)


    /*
    1.  Mallinnettava: Tiedonsiirron nopeus
        Määrittely: Javassa Double (liukuluku)
        Käyttötapaukset: Minimiarvo 0 bit/s, maksimiarvo korkein (teoreettinen) mahdollinen arvo 1,3*10^75 bit/s.
        Rajoitukset: Jos arvo on alle 0, tieto ei siirry.
                     Jos arvo yli 1,3*10^75 bit/s jokin on mennyt pieleen, sillä arvo ei ole mahdollinen.
        Esimerkki:
     */ double nopeus = 1000000000;

     public class Tiedonsiirto {
         protected double nopeus;

         /**
          * @.pre nopeus >= 0 && nopeus <= 1.3 * Math.pow(10,75)
          * @.post true
          */

         public Tiedonsiirto (double nopeus) {
             this.nopeus = nopeus;
         }

         public double annaNopeus() {
             return nopeus;
         }

     }
}


     /*
     2. Mallinnettava: Murtoluku
        Määrittely: Javassa esim double, ja metodi, joka laskee arvon murtoluvuksi.
                    Yksinkertaisemmassa toteutuksessa kysytään vain jakaja (int) ja jaettava (int).
        Käyttötapaukset: ei periaatteessa min ja max arvoja
        Rajoitukset: Ei mahdollista ilmaista päättymättömiä jaksottomia desimaalilukuja.
        Esimerkki:
      */ double desimaali = 1.5;
        String murtoluku = "1/2";

        public class Murtoluku {
            protected int jaettava;
            protected int jakaja;

            /**
             * @.pre true
             * @.post annaMurtoluku.equals(jaettava + "/" + jakaja
             */

            public Murtoluku (int jaettava, int jakaja) {
                this.jaettava = jaettava;
                this.jakaja = jakaja;
            }

            public String annaMurtoluku() {
                String murtoluku = jaettava + "/" + jakaja;
                return murtoluku;
            }
        }

        /*
        3.  Mallinnettava: Suomalaisen henkilön nimi
            Määrittely: Javassa String
            Käyttötapaukset: Sisältää vain kirjaimia, välilyöntejä ja väliviivoja.
            Rajoitukset: Ei saa sisältää erikoismerkkejä (esim. + ? ! €)
            Esimerkki:
         */ String kokonimi = "Janne Rissanen";


         public class Nimi {
             protected String etunimi;
             protected String sukunimi;

             /**
              * @.pre etunimi.contains(" a ", " b ", " c ", " d ", " e ", " f ", " g ", " h ", " i ", " j ", " k ", " l ", " m ", " n ", " o ", " p ", " q ", " r ", " s ", " t ", " u ", " v ", " w ", " x ", " y ", " z ", " å ", " ä ", " ö ")
              * && sukunimi.contain("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","å","ä","ö")
              * && etunimi != null
              * && sukunimi != null
              * @.post kokonimi.equals(etunimi + " " + sukunimi)
              */

             public Nimi(String etunimi, String sukunimi) {
                 this.etunimi = etunimi;
                 this.sukunimi = sukunimi;
             }

             public String annaNimi() {
                 String kokonimi = etunimi + " " + sukunimi;
                 return kokonimi;
             }
         }


         /*
         4. Mallinnettava: Suomalainen puhelinnumero
            Määrittely: Javan int (puhelinnumero on yksi iso luku)
                        tai ArrayList<Integer> (jokainen numero "erikseen")
            Käyttötapaukset: Puhelinnumeron pituus välillä 7-10 numeroa.
            Rajoitukset: Ei voi sisältää negatiivisia numeroita.
                         Hätänumeroita ei lasketa tässä puhelinnumeroiksi.
            Esimerkki:
          */ int puhelinnumero = 0401234567;


          public class Puhelinnumero {
              protected int puhelinnumero;

              /**
               * @.pre puhelinnumero > 0
               * @.post numero.length() < 11
               *        && numero.length > 6
               */


              public Puhelinnumero(int puhelinnumero) {
                  this.puhelinnumero = puhelinnumero;
              }

              public String annaNumero() {
                  String numero = Integer.toString(puhelinnumero);
                  return numero;
              }
          }


          /*
          5. Mallinnettava: Henkilö sukututkimusohjelmassa
             Määrittely: Javassa oltava string
             Käyttötapaukset:
             Rajoitukset:
             Esimerkki:
           */

        public class Henkilo {
            protected String aiti;
            protected String isa;
            protected String sisko;
            protected String veli;
            protected String lapsi;

            Henkilo henkilo1 = new Henkilo();
            Henkilo henkilo2 = new Henkilo();

            ArrayList<String> sukulaiset = new ArrayList<String>();

            /**
             * @.pre EXISTS(i: 0 <= i < sukulaiset.size[]; sukulaiset[i].equals("aiti", "isa", "sisko", "veli", "lapsi")
             * @.post True
             */

            public boolean onkoSukua(henkilo1, henkilo2) {
            }


            public Henkilo(String aiti, String isa, String sisko, String veli, String lapsi) {
                this.aiti = aiti;
                this.isa = isa;
                this.sisko = sisko;
                this.veli = veli;
                this.lapsi = lapsi;
            }

            public String annaAiti() {
                return aiti;
            }

            public String annaIsa() {
                return isa;
            }

            public String annaSisko() {
                return sisko;
            }

            public String annaVeli() {
                return veli;
            }

            public String annaLapsi() {
                return lapsi;
            }
        }
}
