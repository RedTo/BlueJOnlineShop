public class Angebot
{
    private Benutzer verkaeufer;
    private Produkt produkt;
    private int mindestalter;
    private int preis;
    private int anzahl;
    private int versandkosten;
    public Angebot(Benutzer verkaeufer, Produkt produkt, int mindestalter, int preis, int anzahl, int versandkosten)
    {
        this.verkaeufer = verkaeufer;
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
    
    public Produkt gibProdukt(){
        return produkt;
    }
    
    public int gibMindestalter(){
        return mindestalter;
    }
    
    public int gibAnzahl(){
        return anzahl;
    }
    
    public void aendereAnzahl(int anzahl){
        this.anzahl = anzahl;
    }
    
    public int gibPreisProStk(){
        return preis;
    }
    
    public int gibVersandkosten(){
        return versandkosten;
    }
    
    public Benutzer gibVerkaeufer(){
        return verkaeufer;
    }
}
