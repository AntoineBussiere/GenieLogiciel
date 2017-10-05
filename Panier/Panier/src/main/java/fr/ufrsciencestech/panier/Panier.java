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
    private ArrayList listOrange;
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
    
    public Object getAt(int i){
        return listOrange.get(i);
    }
    
    public double size(){
        double taille = 0;
        for(int i = 0; i < listOrange.size();i++)
        {
            if(listOrange.get(i).getClass().equals(Banane.class))
                taille += 1.5;
        }
        
        return taille;
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
    
        if(listOrange.size() < maxOrange)
        {
            listOrange.add(new Orange());
            notifyObservers(listOrange.size());
        }
        else
            notifyObservers(-1);
        
    }
    
    public String affiche(){
        String res = "";
        int nbClass = 0;
        boolean trouve;
        int nbb = 0, nbo = 0;
        
        for(int i = 0; i < listOrange.size(); i++)
        {
            trouve = false;
            for(int j = 0; j < i; j++)
                if(listOrange.get(i).getClass().equals(listOrange.get(j).getClass()))
                    trouve = true;
            
            if(!trouve)
                nbClass++;
        }
        
        for(int i = 0; i < listOrange.size(); i++) 
        {
            if(listOrange.get(i).getClass().equals(Orange.class))
                nbo++;
            else if(listOrange.get(i).getClass().equals(Banane.class)) 
                nbb++;
        }
        
        res += "Nombre d'orange : "+nbo+"\nNombre de banane : "+nbb;
        
        return res;
    }
    
    public void ajoute(Object o){
        if(o.getClass().equals(Orange.class))
        {
            if(this.size()+1 <= maxOrange)
            {
                listOrange.add((Orange)o);
                setChanged();
                notifyObservers(this.affiche());
            }
            else
            {
                setChanged();
                notifyObservers(-1);
            }
        }
        else if(o.getClass().equals(Banane.class))
        {
            if(this.size()+1.5 <= maxOrange)
            {
                listOrange.add((Banane)o);
                setChanged();
                notifyObservers(this.affiche());
            }
            else
            {
                setChanged();
                notifyObservers(-1);
            }
        }
    }
    
    public void retire(){
        setChanged();
        
        if(!listOrange.isEmpty())
        {
            listOrange.remove(listOrange.size()-1);
            notifyObservers(this.affiche());
        }
        else 
            notifyObservers(-2);
         
    }
    
    public int getElement(Object obj){
        int pos = -1;
        boolean trouve = false;
        int i = listOrange.size()-1;
        
        while(!trouve || i >= 0){
            if(listOrange.get(i).getClass().equals(obj))
            {
                trouve = true;
                pos = i;
            }
            i--;
                
        }
        return pos;
    }
    
    public void retire(Object obj){
        if(obj.equals(Banane.class)||obj.equals(Orange.class))
        {
            listOrange.remove(getElement(obj));
            setChanged();
            notifyObservers(this.affiche());
        }
    }
    
    public int getPrix(){
        int res = 0;
        for(int i = 0; i < listOrange.size();i++)
        {
            if(listOrange.get(i).getClass().equals(Orange.class))
                res += ((Orange)listOrange.get(i)).getPrix();
            if(listOrange.get(i).getClass().equals(Banane.class))
                res += ((Banane)listOrange.get(i)).getPrix();
        }
            
        return res;
    }
    
    public void boycotteOrigine(String pays){
        String s = "";
        int size = listOrange.size()-1;
        for(int i = size; i >= 0;i--)
        {
            if(listOrange.get(i).getClass().equals(Orange.class))
            {
                s = ((Orange)listOrange.get(i)).getOrigine();
                
                if(s.equals(pays))
                {
                    listOrange.remove(i);
                    setChanged();
                    notifyObservers(this.affiche());
                }
            }
            else if(listOrange.get(i).getClass().equals(Banane.class))
            {
                s = ((Banane)listOrange.get(i)).getOrigine();
            
                if(s.equals(pays))
                {
                    listOrange.remove(i);
                    setChanged();
                    notifyObservers(this.affiche());
                }
            }
        }
    }
    
    
    
}
