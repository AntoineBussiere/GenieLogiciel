package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Orange o1 = new Orange(5,"France");
        Orange o2 = new Orange(6,"Espagne");
        Orange o3 = new Orange(7,"Italie");
        
        Panier p1 = new Panier(20);
        
        p1.ajoute();
        
        
        
    }
}
