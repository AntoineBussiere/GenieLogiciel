/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import junit.framework.TestCase;

/**
 *
 * @author ab841673
 */
public class BananeTest extends TestCase {
    
    public BananeTest(String testName) {
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
     * Test of getOrigine method, of class Banane.
     */
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Banane instance = new Banane();
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigine method, of class Banane.
     */
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "";
        Banane instance = new Banane();
        instance.setOrigine(origine);
    }

    /**
     * Test of getPrix method, of class Banane.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        Banane instance = new Banane("fr");
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of equals method, of class Banane.
     */
    public void testEquals1() {
        System.out.println("equals");
        Object obj = null;
        Banane instance = new Banane();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    public void testEquals2(){
        Panier p = new Panier(20);
        Banane instance = new Banane();
        boolean expResult = false;
        boolean result = instance.equals(p);
        assertEquals(expResult, result);
    }
    
    public void testEquals3(){
        Banane instance = new Banane();
        Banane o = new Banane("France");
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
    public void testEquals4(){
        Banane instance = new Banane("fra");
        Banane o = new Banane("Fr");
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
    public void testEquals5(){
        Banane o = new Banane();
        Object obj = o;
        boolean expResult = false;
        boolean result = o.equals(obj);
        assertEquals(expResult, result);
    }
    
    public void testEquals6(){
        Banane o = new Banane();
        Banane p = new Banane();
        boolean expResult = false;
        boolean result = o.equals(p);
        assertEquals(expResult, result);
    }
    
    
    
}
