//Erweiterung um den Typ Datum zu verwenden und das Alter zu berechnen
import java.time.*;
/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Benutzer
{
    private String name;
    private String eMail;
    private String telefon;
    private LocalDate geburtstag;
    private String bankInfo;
    private String adresse;

    /**
     * Konstruktor für Objekte der Klasse Person
     */
    public Benutzer(String name, String eMail, String telefon, LocalDate geburtstag, String bankInfo, String adresse)
    {
        this.name = name;
        this.eMail = eMail;
        this.telefon = telefon;
        this.geburtstag = geburtstag;
        this.bankInfo = bankInfo;
        this.adresse = adresse;
        System.out.println("Es wurde ein neuer Benutzer (" + this.name + ", " + this.eMail + ") angelegt.");
    }
    public String gibName()
    {
        return name;
    }
    public void aendereName(String name)
    {
        this.name=name;
    }
    public String gibEMail(){
        return eMail;
    }
    public void aendereEMail(String eMail)
    {
       this.eMail=eMail;
    }
    public String gibTelefon(){
        return telefon;
    }
    public void aendereTelefon(String telefon)
    {
        this.telefon=telefon;
    }
    public LocalDate gibGeburtstag(){
        return geburtstag;
    }
    public void aendereGeburtstag(LocalDate geburtstag){
        this.geburtstag = geburtstag;
    }
    public int gibAlter(){
        LocalDate heute = LocalDate.now();
        Period alter = Period.between(geburtstag, heute);
        return alter.getYears();
    }
    public String gibBankInfo(){
        return bankInfo;
    }
    public void aendereBankInfo(String bankInfo)
    {
        this.bankInfo=bankInfo;
    }
    public String gibAdresse(){
        return adresse;
    }
    public void aendereAdresse(String adresse)
    {
        this.adresse=adresse;
    }
    public void gibDaten()
    {
           System.out.println("Ihre Daten:" + " Name:" + name +" EmailAdresse: "+ eMail +" Bankdaten: "+  bankInfo
           +" Alter: "+ gibAlter() + " Adresse: " + adresse + "Telefonnummer: " + telefon);
    }
}
