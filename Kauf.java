
/**
 * Beschreiben Sie hier die Klasse Kauf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kauf
{
    private Angebot angebot;
    private Benutzer kaeufer;
    private boolean versand;
    private int anzahl;
    /**
     * Konstruktor für Objekte der Klasse Kauf
     */
    public Kauf(Angebot angebot, Benutzer kaeufer, boolean versand, int anzahl)
    {
        this.angebot = angebot;
        this.kaeufer = kaeufer;
        this.versand = versand;
        this.anzahl = anzahl;
    }
}
