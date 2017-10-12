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
public class Orange extends Fruit{
    public Orange(double prix, String origine){
        this.prix = prix;
        this.origine = origine;
    }
    
    public Orange(){
        this.prix = 0.0;
        this.origine = "";
    }

    @Override
    public boolean isSeedless() 
    {
        return true;
    }
    
}
