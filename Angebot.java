public class Angebot
{
    private Benutzer verkäufer;
    private Produkt produkt;
    private int preis;
    private int anzahl;
    private int versandkosten;
    public Angebot(Benutzer verkäufer, Produkt produkt, int preis, int anzahl, int versandkosten)
    {
        this.verkäufer = verkäufer;
        this.produkt = produkt;
        this.preis = preis;
        this.anzahl = anzahl;
        this.versandkosten = versandkosten;
        System.out.println(produkt.gibProduktKurz() + " wurde als Angebot hinzugefügt.");
    }
    
    public String gibAngebot(){
        return produkt.gibProduktKurz() + " (" + anzahl + " Stk) für " + preis + "€, ggf. zzgl. " + versandkosten + "€ für Versand";
    }
}
