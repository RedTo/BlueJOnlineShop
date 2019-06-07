public class OnlineShop
{
    private Angebot [] angebote;
    private int maxAnzahl = 10;
    private int anzahlAngebot = 0;
    private int anzahlKaeufe = 0;
    private Kauf [] kaeufe;
    
    public OnlineShop()
    {
        angebote = new Angebot[maxAnzahl];
        kaeufe = new Kauf[maxAnzahl];
    }
    
    public void angebotHinzufügen(Angebot angebot)
    {
        //prüfen ob Verkäufer noch ein Angebot erstellen kann
        if(!angebot.gibVerkaeufer().pruefeAngebotErstellung()){
            System.out.println("Der Verkäufer hat bereits die maximale Anzahl an Angeboten erreicht.");
            return;
        }
        if(anzahlAngebot < maxAnzahl) {
            angebot.gibVerkaeufer().angebotMerken(angebot);
            angebote[anzahlAngebot] = angebot;
            anzahlAngebot = anzahlAngebot + 1;
            System.out.println("Angebot " + angebot.gibAngebot() + " wurde hinzugefügt");
        } else {
            System.out.println("Maximale Anzahl an Angeboten erreicht.");
        }
    }
    
    public void angebotBeenden(Angebot angebot){
        for(int i = 0; i < maxAnzahl; i++){
            Angebot anderesAngebot = angebote[i];
            if(anderesAngebot != null && anderesAngebot.gibVerkaeufer() == angebot.gibVerkaeufer()
            && anderesAngebot.gibProdukt() == angebot.gibProdukt() && anderesAngebot.gibAnzahl() == angebot.gibAnzahl()
            && anderesAngebot.gibVersandkosten() == angebot.gibVersandkosten() && anderesAngebot.gibPreisProStk() == angebot.gibPreisProStk()
            && anderesAngebot.gibMindestalter() == angebot.gibMindestalter()){
                angebote[i] = null;
            }
        }
    }
    
    public void kaufeAngebot(Angebot angebot, Benutzer kaeufer, boolean versand, int anzahl){
        //prüfen ob Käufer und Verkäufer gleiche Person
        if(kaeufer == angebot.gibVerkaeufer()){
            System.out.println("Der Käufer kann keine eigenen Angebote kaufen.");
            return;
        }
        
        //prüfe ob käufer noch einen kauf erstellen darf
        if(!kaeufer.pruefeKaufErstellung()){
            System.out.println("Der Käufer hat die maximale Anzahl an Käufen bereits erreicht.");
            return;
        }
        
        //prüfen ob käufer alt genug
        if(angebot.gibMindestalter() > kaeufer.gibAlter()){
            System.out.println("Der Käufer ist nicht alt genug.");
            return;
        }
        
        //prüfen ob genügend stk vorhanden
        if(angebot.gibAnzahl() < anzahl){
            System.out.println("Es sind nicht genügend Stück vorhanden");
            return;
        }
        
        //kauf erstellen und speichern
        Kauf kauf = new Kauf(angebot, kaeufer, versand, anzahl);
        kaeufe[anzahlKaeufe] = kauf;
        
        angebot.aendereAnzahl(angebot.gibAnzahl() - anzahl);
        if(angebot.gibAnzahl() == 0){
            angebotBeenden(angebot);
        }
        int preis = angebot.gibPreisProStk() * anzahl;
        String ausgabe = angebot.gibProdukt().gibProduktKurz() + " wurde " + anzahl + "x gekauft. Gesamtpreis: " + preis;
        //je nach versand option preis + versand oder adresse und preis
        if(versand){
            preis += angebot.gibVersandkosten();
            ausgabe += "\nDer bestellte Versand erfolgt in Kürze.";
        } else {
            ausgabe += "\nAbholung an folgender Adresse:\n" + angebot.gibVerkaeufer().gibAdresse();
        }
        System.out.println(ausgabe);
    }
    
    public void druckeAlleAngebote()
    {    
        /*int i=0;
        while (i < maxAnzahl)
        {
            if (angebote[i] != null)
            {   
                System.out.println(i+ ": " + angebote[i].gibAngebot());
            }
            i = i+1;
        }*/
        //i++ ist das gleiche wie i = i+1;
        for(int i = 0; i < maxAnzahl; i++){
            if(angebote[i] != null){
                System.out.println(i+ ": " + angebote[i].gibAngebot());
            }
        }
    }
    public void druckeAlleKaeufe()
    {    
        /*int i=0;
        while (i < maxAnzahl)
        {
            if (angebote[i] != null)
            {   
                System.out.println(i+ ": " + angebote[i].gibAngebot());
            }
            i = i+1;
        }*/
        //i++ ist das gleiche wie i = i+1;
        for(int i = 0; i < maxAnzahl; i++){
            if(kaeufe[i] != null){
                System.out.println(i+ ": " + kaeufe[i].gibKauf());
            }
        }
    }
}
