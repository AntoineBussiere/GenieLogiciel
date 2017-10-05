/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author ab841673
 */
public class Panier extends Observable {
    private ArrayList<Orange> listOrange;
    private final int maxOrange;

    public Panier(int max) {
        listOrange = new ArrayList(max);
        maxOrange = max;
    }
    
    public boolean estPlein() {
        return listOrange.size() == maxOrange;
    }
    
    public boolean estVide() {
        return listOrange.isEmpty();
    }
    
    public Orange getAt(int i){
        return listOrange.get(i);
    }
    
    public int size(){
        return listOrange.size();
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = 0; i < listOrange.size();i++)
            res += listOrange.get(i).toString();
        
        return res;
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
        final Panier other = (Panier) obj; 
        if(other.size()!=listOrange.size())
            return false;
        boolean res = true;
        for(int i = 0; i < listOrange.size();i++){
            if(!listOrange.get(i).equals(other.getAt(i)))
                res= false;
        }
        return res;
    }
    
    
    public void ajoute(){
        setChanged();
    
        if(listOrange.size() != maxOrange)
        {
            listOrange.add(new Orange());
            notifyObservers(listOrange.size());
        }
        else
            notifyObservers(-1);
        
        
        
    }
    
    public void ajoute(Orange o){
        listOrange.add(o);
    }
    
    public void retire(){
        setChanged();
        
        if(!listOrange.isEmpty())
        {
            listOrange.remove(listOrange.size()-1);
            notifyObservers(listOrange.size());
        }
        else 
            notifyObservers(-2);
            
        
        
    }
    
    public int getPrix(){
        int res = 0;
        for(int i = 0; i < listOrange.size();i++)
            res += listOrange.get(i).getPrix();
        return res;
    }
    
    public void boycotteOrigine(String pays){
        for(int i = 0; i < listOrange.size();i++)
            if(listOrange.get(i).getOrigine().equals(pays))
                listOrange.remove(i);
    }
    
    
    
}
