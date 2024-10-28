
public class Wohnung
{
    private String ort;
    private boolean balkon;
    private boolean gefordert;
    private int preis;
    private int anzZimmer;
    
    public Wohnung(String ort, boolean balkon, boolean gefordert,int preis, 
    int anzZimmer)
    {
        setOrt(ort);
        setBalkon(balkon);
        setGefordert(gefordert);
        setPreis(preis);
        setAnzZimmer(anzZimmer);
    }
    
    public Wohnung(String ort, boolean balkon, int preis)
    {
        setOrt(ort);
        setBalkon(balkon);
        setGefordert(false);
        setPreis(preis);
        setAnzZimmer(4);
        
    }
    
    public Wohnung(String Ort, boolean balkon)
    {
        setOrt(ort);
        setBalkon(balkon);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public Wohnung(String ort, int preis, boolean gefordert)
    {
        setOrt(ort);
        setBalkon(true);
        setGefordert(gefordert);
        setPreis(preis);
        setAnzZimmer(4);
    }
    
    public Wohnung(String Ort)
    {
        setOrt(ort);
        setBalkon(true);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public Wohnung()
    {
        setOrt("Wien");
        setBalkon(true);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public void setOrt(String ort)
    {
        this.ort = ort;
        
    }
    
    public void setBalkon(boolean balkon)
    {
        this.balkon = balkon;
    }
    
    public void setGefordert( boolean gefordert)
    {
        this.gefordert = gefordert;
    }
    
    public void setPreis(int preis)
    {
        this.preis = preis;
    }
    
    public void setAnzZimmer(int anzZimmer)
    {
        this.anzZimmer = anzZimmer;
    }
    
    public String getOrt()
    {
        return ort;
    }
    
    public boolean getBalkon()
    {
        return balkon;
    }
    
    public boolean getGefordert()
    {
        return gefordert;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public int getAnzZimmer()
    {
        return anzZimmer;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
