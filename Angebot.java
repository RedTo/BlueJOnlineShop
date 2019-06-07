public class Angebot
{
    private Benutzer verkaeufer;
    private Produkt produkt;
    private int mindestalter;
    private int preisProStk;
    private int anzahl;
    private int versandkosten;
    public Angebot(Benutzer verkaeufer, Produkt produkt, int mindestalter, int preisProStk, int anzahl, int versandkosten)
    {
        this.verkaeufer = verkaeufer;
        this.produkt = produkt;
        this.mindestalter = mindestalter;
        this.preisProStk = preisProStk;
        this.anzahl = anzahl;
        this.versandkosten = versandkosten;
        System.out.println(produkt.gibProduktKurz() + " wurde als Angebot hinzugefügt.");
    }
    
    public String gibAngebot(){
        return produkt.gibProduktKurz() + " ab " + mindestalter + " Jahren (" + anzahl + " Stk) für " + preisProStk + "€, ggf. zzgl. " + versandkosten + "€ für Versand";
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
        return preisProStk;
    }
    
    public int gibVersandkosten(){
        return versandkosten;
    }
    
    public Benutzer gibVerkaeufer(){
        return verkaeufer;
    }
}
