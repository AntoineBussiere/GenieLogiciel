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
public class Orange {
    private double prix;
    private String origine;
    
    public Orange(){
        prix = 10.0;
        origine = "France";
    }

    public Orange(double prix, String origine) {
        if(prix > 0)
        {
            this.prix = prix;
            this.origine = origine;
        }
        else System.out.println("Erreur : prix négatif");
    }

    public double getPrix() {
        return prix;
    }

    public String getOrigine() {
        return origine;
    }

    @Override
    public String toString() {
        return "Orange{" + "prix=" + prix + ", origine=" + origine + "}\n";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
        final Orange other = (Orange) obj;
        if (Double.doubleToLongBits(this.prix) != Double.doubleToLongBits(other.prix)) {
            return false;
        }
        if(!(this.origine.equals(other.origine)))
            return false;
        return true;
    }
    
}
