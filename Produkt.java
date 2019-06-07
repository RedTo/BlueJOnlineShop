/**
 * Beschreiben Sie hier die Klasse Produkt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Produkt
{
    private String name;
    private String marke;
    private String zustand;
    private String beschreibung;
    private String produktart;

    /**
     * Konstruktor für Objekte der Klasse Produkt
     */
    public Produkt(String name, String marke, String zustand, String beschreibung, String produktart)
    {
        this.name = name;
        this.marke = marke;
        this.zustand = zustand;
        this.beschreibung = beschreibung;
        this.produktart = produktart;
    }
    
    public String gibProdukt()
    {
        return produktart + " - " + name + " von der Marke " + marke + " (" + zustand + ", " + beschreibung + ")";
    }
    
    public String gibProduktKurz(){
        return produktart + " - " + name + " von der Marke " + marke;
    }
    
    public String gibName(){
        return name;
    }
}
