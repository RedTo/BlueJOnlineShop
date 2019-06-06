//Erweiterung um den Typ Datum zu verwenden und das Alter zu berechnen
import java.util.Date;
import java.time.Period;
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
    private Date birthday;
    private String bankInfo;
    private String address;

    /**
     * Konstruktor für Objekte der Klasse Person
     */
    public Benutzer(String name, String eMail, String telefon, Date birthday, String bankInfo, String address)
    {
        this.name = name;
        this.eMail = eMail;
        this.telefon = telefon;
        this.birthday = birthday;
        this.bankInfo = bankInfo;
        this.address = address;
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
    public Date gibBirthday(){
        return birthday;
    }
    public void aendereBirthday(Date birthday){
        this.birthday = birthday;
    }
    public int gibAlter(){
        Date heute = new Date();
        Period alter = Period.between(this.birthday, heute);
        return alter.getYears();
    }    
    public void aendereAlter(int Alter)
    {
        this.Alter=Alter;
    }
    public void aendereBankdaten(String Bankdaten)
    {
        this.Bankdaten=Bankdaten;
    }
    public void aendereAdresse(String Adresse)
    {
        this.Adresse=Adresse;
    }
    public String gibEmailAdresse()
    {
        return EmailAdresse;
    }
    public int gibTelefonnummer()
    {
        return Telefonnummer;
    }
    public int gibAlter()
    {
        return Alter;
    }
    public String gibBankdaten()
    {
        return Bankdaten;
    }
    public String gibAdresse()
    {
        return Adresse;
    }
    public void gibDaten()
    {
           System.out.println("Ihre Daten:" + " Name:" +gibname()+" EmailAdresse: "+ gibEmailAdresse()+" Bankdaten: "+  gibBankdaten()+" Alter: "+ gibAlter()+ " Adresse: " +gibAdresse()+ "Telefonnummer: " +gibTelefonnummer());
    }
}
