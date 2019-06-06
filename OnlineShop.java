public class OnlineShop
{
    private Angebot [] angebot;
    private int maxAnzahl = 10;
    private int anzahl = 0;
    
    public OnlineShop()
    {
        angebot = new Angebot[maxAnzahl];
    }
    
    public void angebotHinzufügen(Angebot m)
    {
        if(anzahl < maxAnzahl) {
            angebot[anzahl] = m;
            anzahl = anzahl + 1;
            System.out.println("Angebot " + m.gibAngebot() + " wurde hinzugefügt");
        } else {
            System.out.println("Maximale Anzahl an Angeboten erreicht.");
        }
    }
    
    public void kaufeAngebot(Angebot angebot, Benutzer kaeufer, boolean versand, int anzahl){
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
        
        int preis = angebot.gibPreisProStk() * anzahl;
        angebot.aendereAnzahl(angebot.gibAnzahl() - anzahl);
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
        int i=0;
        while (i < maxAnzahl)
        {
            if (angebot[i] != null)
            {   
                System.out.println(i+ ": " + angebot[i].gibAngebot());
            }
            i = i+1;
        }

    }
}
