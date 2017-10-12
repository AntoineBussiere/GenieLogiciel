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
    private ArrayList<Fruit> listFruits;
    private final int maxFruits;

    public Panier(int max) {
        listFruits = new ArrayList(max);
        maxFruits = max;
    }
    
    public boolean estPlein() {
        return listFruits.size() == maxFruits;
    }
    
    public boolean estVide() {
        return listFruits.isEmpty();
    }
    
    public Fruit getAt(int i){
        return listFruits.get(i);
    }
    
    public double size(){
        return listFruits.size();
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = 0; i < listFruits.size();i++)
            res += listFruits.get(i).toString();
        
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
        if(other.size()!=listFruits.size())
            return false;
        boolean res = true;
        for(int i = 0; i < listFruits.size();i++){
            if(!listFruits.get(i).equals(other.getAt(i)))
                res= false;
        }
        return res;
    }
    
    
    public void ajoute(){
        setChanged();
    
        if(listFruits.size() < maxFruits)
        {
            listFruits.add(new Orange());
            notifyObservers(listFruits.size());
        }
        else
            notifyObservers(-1);
        
    }
    
    public String affiche(){
        String res = "";
        int nbClass = 0;
        boolean trouve;
        
        for(int i = 0; i < listFruits.size(); i++)
        {
            trouve = false;
            for(int j = 0; j < i; j++)
                if(listFruits.get(i).getClass().equals(listFruits.get(j).getClass()))
                    trouve = true;
            
            if(!trouve)
                nbClass++;
        }
        
        return res;
    }
    
    public void ajoute(Fruit o){
        if(listFruits.size() < maxFruits)
        {
            listFruits.add(o);
            setChanged();
            notifyObservers(this.affiche());
        }
        else
        {
            setChanged();
            notifyObservers(-1);
        }
    }
    
    public void retire(){
        setChanged();
        
        if(!listFruits.isEmpty())
        {
            listFruits.remove(listFruits.size()-1);
            notifyObservers(this.affiche());
        }
        else 
            notifyObservers(-2);
         
    }
    
    public void retire(Fruit f){
        boolean trouve = false;
        int i = 0;
        while(!trouve || i < maxFruits){
            if(listFruits.get(i).equals(f))
                trouve = true;
            else
                i++;
        }
        setChanged();
        if(trouve)
        {
            listFruits.remove(i);
            notifyObservers(this.affiche());
        }
    }
    
    public int getPrix(){
        int res = 0;
        for(int i = 0; i < listFruits.size();i++)
        {
            res += listFruits.get(i).getPrix();
        }
            
        return res;
    }
    
    public void boycotteOrigine(String pays){
        String s = "";
        int size = listFruits.size()-1;
        for(int i = size; i >= 0;i--)
        {
            s = listFruits.get(i).getOrigine();

            if(s.equals(pays))
            {
                listFruits.remove(i);
                setChanged();
                notifyObservers(this.affiche());
            }
        }
    }
}
