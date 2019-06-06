
public class Käufer extends Person
{
    private String name;
    private String EmailAdresse;
    private int Telefonnummer;
    private int Alter;
    private String Bankdaten;
    private String Adresse;
    private String Daten;
    public Käufer(String name,String EmailAdresse,int Telefonnummer,String Adresse, int Alter, String Bankdaten)
    {
        this.name=name;
        this.EmailAdresse=EmailAdresse;
        this.Telefonnummer=Telefonnummer;
        this.Alter=Alter;
        this.Bankdaten=Bankdaten;
        this.Adresse=Adresse;
        System.out.println(gibName()+" wurde als Käufer hinzugefügt.");
    }
    
    
}