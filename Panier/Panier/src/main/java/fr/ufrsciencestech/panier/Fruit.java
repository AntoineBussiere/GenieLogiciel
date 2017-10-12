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
public abstract class Fruit {
    protected double prix;
    protected String origine;
    
    
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }
    
    public abstract boolean isSeedless();
        
    @Override
    public boolean equals(Object o)
    {
        if(o != null && o instanceof Orange)
        {
            Fruit or = (Fruit) o;
            return equals(or);
        }
        return false;
    }
    
    public boolean equals(Fruit o)
    {
        return (o != null && this.origine.equals(o.origine) && this.prix == o.prix);
    }
    
    @Override
    public String toString()
    {
        if(prix == 0.0 && origine.equals("")){ return "";}
        return this.getClass().getSimpleName() + " prix : " + String.format("%.2f", prix) + " origine : " + origine;
    }
}
