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
        
    }

    public void setModele(Panier p) {
        this.p = p;
    }

    public void setVue(vueGraphique vg) {
        this.vg = vg;
    }
    
    
    
    
   
}
