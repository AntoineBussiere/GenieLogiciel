/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author ab841673
 */
public class Banane {
    private String origine;
    private final double prix = 0.5;
    
    public Banane(String o){
        origine = o;
    }
    
    public Banane(){
        origine = "France";
    }

    
    public String getOrigine() {
        return origine;
    }

    
    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public double getPrix() {
        return prix;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banane other = (Banane) obj;
        
        if(!(this.origine.equals(other.origine)))
            return false;
        return true;
    }
    
    
}
