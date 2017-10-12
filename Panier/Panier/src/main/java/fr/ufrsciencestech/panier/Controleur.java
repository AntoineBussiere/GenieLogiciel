/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.event.*;

/**
 *
 * @author ab841673
 */
public class Controleur implements ActionListener{
    
    private Panier p;
    private vueGraphique vg;
    private Fruit f;
    
    public void actionPerformed(ActionEvent e) { 
        String s = e.getActionCommand().substring(0,e.getActionCommand().indexOf(" "));
        String t = e.getActionCommand().substring(e.getActionCommand().indexOf(" ")+1);
        
        if(s.equals("Boyc"))
            p.boycotteOrigine(t);
        
        if(s.equals("Ajouter"))
        {
            String u = "fr.ufrsciencestech.panier."+t;
            try{
                Class<?> c = Class.forName(u);
                System.out.println(c.newInstance().toString());
                
                //p.ajoute(f);
            }catch(Exception w){System.out.println("ça marche pas");}
            
        }
        
        if(s.equals("Retirer"))
            p.retire(f);
    }

    public void setFruit(Fruit f){
        this.f = f;
    }
    
    public void setModele(Panier p) {
        this.p = p;
    }

    public void setVue(vueGraphique vg) {
        this.vg = vg;
    }
    
    
    
    
   
}
