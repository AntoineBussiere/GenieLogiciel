package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Panier p1 = new Panier(20);
        
        vueConsole vue = new vueConsole();
        
        p1.addObserver(vue);
        
        p1.ajoute();
        p1.ajoute();
    }
}
