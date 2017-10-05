/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import junit.framework.TestCase;

/**
 *
 * @author ab841673
 */
public class vueGraphiqueTest extends TestCase {
    
    public vueGraphiqueTest(String testName) {
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
     * Test of update method, of class vueGraphique.
     */
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object arg = null;
        vueGraphique instance = new vueGraphique();
        instance.update(o, arg);
    }

    /**
     * Test of addControleur method, of class vueGraphique.
     */
    public void testAddControleur() {
        System.out.println("addControleur");
        Controleur c = null;
        vueGraphique instance = new vueGraphique();
        instance.addControleur(c);
    }

    /**
     * Test of main method, of class vueGraphique.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        vueGraphique.main(args);
    }
    
}
