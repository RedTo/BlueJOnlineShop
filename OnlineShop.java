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
