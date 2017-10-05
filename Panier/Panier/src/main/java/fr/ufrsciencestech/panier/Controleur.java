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
    
    Panier p;
    vueGraphique vg;
    
    public void actionPerformed(ActionEvent e) { 
        String s = e.getActionCommand().substring(0,e.getActionCommand().indexOf(" "));
        
        if(s.equals("Boyc"))
        {
            
            String t = e.getActionCommand().substring(e.getActionCommand().indexOf(" ")+1);
            p.boycotteOrigine(t);
        }
        
        
        if(e.getActionCommand().equals("Ajouter orange"))
            p.ajoute(new Orange());
        
        
        if(e.getActionCommand().equals("Ajouter banane"))
            p.ajoute(new Banane());
        
        
        if(e.getActionCommand().equals("Retirer banane"))
            p.retire(Banane.class);
        
        
        if(e.getActionCommand().equals("Retirer orange"))
            p.retire(Orange.class);
    }

    public void setModele(Panier p) {
        this.p = p;
    }

    public void setVue(vueGraphique vg) {
        this.vg = vg;
    }
    
    
    
    
   
}
