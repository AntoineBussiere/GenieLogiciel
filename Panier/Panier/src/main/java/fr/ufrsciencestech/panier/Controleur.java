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
        if(e.getActionCommand().equals("Ajouter orange"))
        {
            if(p.estPlein())
                p.error(0);
            else
                p.ajoute();
        }
        
        if(e.getActionCommand().equals("Retirer orange"))
        {
            if(p.estVide())
                p.error(1);
            else p.retire();
        }
    }

    public void setModele(Panier p) {
        this.p = p;
    }

    public void setVue(vueGraphique vg) {
        this.vg = vg;
    }
    
    
    
    
   
}
