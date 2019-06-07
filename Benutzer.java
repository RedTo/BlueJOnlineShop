//Erweiterung um den Typ Datum zu verwenden und das Alter zu berechnen
//import java.time.*;
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
    //private LocalDate geburtstag;
    private int alter;
    private String bankInfo;
    private String adresse;
    private Kauf [] kaeufe;
    private int anzahlKaeufe = 0;
    private Angebot [] angebote;
    private int anzahlAngebote = 0;
    private int maxAnzahl = 10;
    
    /**
     * Konstruktor für Objekte der Klasse Person
     */
    //public Benutzer(String name, String eMail, String telefon, LocalDate geburtstag, String bankInfo, String adresse)
    public Benutzer(String name, String eMail, String telefon, int alter, String bankInfo, String adresse)
    {
        this.name = name;
        this.eMail = eMail;
        this.telefon = telefon;
        //this.geburtstag = geburtstag;
        this.alter = alter;
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
    /*public LocalDate gibGeburtstag(){
        return geburtstag;
    }
    public void aendereGeburtstag(LocalDate geburtstag){
        this.geburtstag = geburtstag;
    }*/
    public void aendereAlter(int alter){
        this.alter = alter;
    }
    public int gibAlter(){
        //LocalDate heute = LocalDate.now();
        //Period alter = Period.between(geburtstag, heute);
        //return alter.getYears();
        return alter;
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
           +" Alter: "+ alter + " Adresse: " + adresse + "Telefonnummer: " + telefon);
    }
    
    public int gibAnzahlAngebote(){
        return anzahlAngebote;
    }
    public int gibAnzahlKaeufe(){
        return anzahlKaeufe;
    }
    public boolean pruefeAngebotErstellung(){
        if(anzahlAngebote < maxAnzahl){
            return true;
        } else {
            return false;
        }
    }
    public boolean pruefeKaufErstellung(){
        if(anzahlKaeufe < maxAnzahl){
            return true;
        } else {
            return false;
        }
    }
    public void angebotMerken(Angebot angebot){
        angebote[anzahlAngebote] = angebot;
        anzahlAngebote++;
    }
    public Angebot[] gibAngebote(){
        return angebote;
    }
    public Kauf[] gibKaeufe(){
        return kaeufe;
    }
    public void druckeAngebote(){
        for(int i = 0; i < maxAnzahl; i++){
            if(angebote[i] != null){
                System.out.println(i+ ": " + angebote[i].gibAngebot());
            }
        }
    }
    public void druckeKaeufe(){
        for(int i = 0; i < maxAnzahl; i++){
            if(kaeufe[i] != null){
                System.out.println(i+ ": " + kaeufe[i].gibKauf());
            }
        }
    }
}
