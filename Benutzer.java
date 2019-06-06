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
    private LocalDate birthday;
    private String bankInfo;
    private String address;

    /**
     * Konstruktor für Objekte der Klasse Person
     */
    public Benutzer(String name, String eMail, String telefon, LocalDate birthday, String bankInfo, String address)
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
    public LocalDate gibBirthday(){
        return birthday;
    }
    public void aendereBirthday(LocalDate birthday){
        this.birthday = birthday;
    }
    public int gibAlter(){
        LocalDate heute = LocalDate.now();
        Period alter = Period.between(this.birthday, heute);
        return alter.getYears();
    }
    public String gibBankInfo(){
        return bankInfo;
    }
    public void aendereBankInfo(String bankInfo)
    {
        this.bankInfo=bankInfo;
    }
    public String gibAddress(){
        return address;
    }
    public void aendereAddress(String address)
    {
        this.address=address;
    }
    public void gibDaten()
    {
           System.out.println("Ihre Daten:" + " Name:" +gibName()+" EmailAdresse: "+ gibEMail()+" Bankdaten: "+  gibBankInfo()
           +" Alter: "+ gibAlter()+ " Adresse: " +gibAddress()+ "Telefonnummer: " +gibTelefon());
    }
}
