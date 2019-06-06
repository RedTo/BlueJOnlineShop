public class Angebot
{
    private Benutzer verkäufer;
    private Produkt produkt;
    private int mindestalter;
    private int preis;
    private int anzahl;
    private int versandkosten;
    public Angebot(Benutzer verkäufer, Produkt produkt, int mindestalter, int preis, int anzahl, int versandkosten)
    {
        this.verkäufer = verkäufer;
        this.produkt = produkt;
        this.mindestalter = mindestalter;
        this.preis = preis;
        this.anzahl = anzahl;
        this.versandkosten = versandkosten;
        System.out.println(produkt.gibProduktKurz() + " wurde als Angebot hinzugefügt.");
    }
    
    public String gibAngebot(){
        return produkt.gibProduktKurz() + " ab " + mindestalter + " Jahren (" + anzahl + " Stk) für " + preis + "€, ggf. zzgl. " + versandkosten + "€ für Versand";
    }
}
