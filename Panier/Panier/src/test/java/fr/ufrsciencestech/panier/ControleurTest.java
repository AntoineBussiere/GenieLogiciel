/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import javax.swing.*;
import java.awt.event.ActionEvent;
import junit.framework.TestCase;

/**
 *
 * @author ab841673
 */
public class ControleurTest extends TestCase {
    
    public ControleurTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of actionPerformed method, of class Controleur.
     */
    public void testActionPerformed1() {
        System.out.println("actionPerformed");
        JButton j = new JButton();
        ActionEvent e = new ActionEvent(j,0,"Ajouter orange");
        Controleur instance = new Controleur();
        instance.actionPerformed(e);
    }
    
    public void testActionPerformed2() {
        System.out.println("actionPerformed");
        JButton j = new JButton();
        ActionEvent e = new ActionEvent(j,0,"Retirer orange");
        Controleur instance = new Controleur();
        instance.actionPerformed(e);
    }
    
    public void testActionPerformed3() {
        System.out.println("actionPerformed");
        JButton j = new JButton();
        ActionEvent e = new ActionEvent(j,0,"Test");
        Controleur instance = new Controleur();
        instance.actionPerformed(e);
    }

    /**
     * Test of setModele method, of class Controleur.
     */
    public void testSetModele() {
        System.out.println("setModele");
        Panier p = new Panier(5);
        Controleur instance = new Controleur();
        instance.setModele(p);
    }

    /**
     * Test of setVue method, of class Controleur.
     */
    public void testSetVue() {
        System.out.println("setVue");
        vueGraphique vg = new vueGraphique();
        Controleur instance = new Controleur();
        instance.setVue(vg);
    }
    
}
