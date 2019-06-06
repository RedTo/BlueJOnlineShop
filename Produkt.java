/**
 * Beschreiben Sie hier die Klasse Produkt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Produkt
{
    private String Name;
    private String Marke;
    private String Zustand;
    private String Beschreibung;
    private String Produktart;

    /**
     * Konstruktor für Objekte der Klasse Produkt
     */
    public Produkt(String Name, String Marke, String Zustand, String Beschreibung, String Produktart)
    {
        this.Name = Name;
        this.Marke = Marke;
        this.Zustand = Zustand;
        this.Beschreibung = Beschreibung;
        this.Produktart = Produktart;
    }
    
    public String gibProdukt()
    {
        return Produktart + " - " + Name + " von der Marke " + Marke + " (" + Zustand + ", " + Beschreibung + ")";
    }
    
    public String gibProduktKurz(){
        return Produktart + " - " + Name + " von der Marke " + Marke;
    }
}
