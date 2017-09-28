/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;

/**
 *
 * @author ab841673
 */
public class vueConsole implements Vue{

    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
    
}
