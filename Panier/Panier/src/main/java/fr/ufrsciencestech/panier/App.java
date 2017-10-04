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
        Controleur c = new Controleur();
        vueGraphique vg = new vueGraphique();
        
        vg.addControleur(c);
        c.setModele(p1);
        c.setVue(vg);
        p1.addObserver(vg);
        
        vg.setVisible(true);
        
        
    }
}
