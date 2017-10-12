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
public class OrangeTest extends TestCase {
    
    public OrangeTest(String testName) {
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
     * Test of getPrix method, of class Orange.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange();
        double expResult = 10.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange();
        String expResult = "France";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Orange.
     */
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Orange.
     */
    public void testHashCode() {
        System.out.println("hashCode");
        Orange instance = new Orange();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Orange.
     */
    public void testEquals1() {
        System.out.println("equals");
        Object obj = null;
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    public void testEquals2(){
        Panier p = new Panier(20);
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.equals(p);
        assertEquals(expResult, result);
    }
    
    public void testEquals3(){
        Orange instance = new Orange();
        Orange o = new Orange(-5,"France");
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
    public void testEquals4(){
        Orange instance = new Orange(20,"fra");
        Orange o = new Orange(20,"Fr");
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
    public void testEquals5(){
        Orange o = new Orange();
        Object obj = o;
        boolean expResult = false;
        boolean result = o.equals(obj);
        assertEquals(expResult, result);
    }
    
    public void testEquals6(){
        Orange o = new Orange();
        Orange p = new Orange();
        boolean expResult = false;
        boolean result = o.equals(p);
        assertEquals(expResult, result);
    }
    
}
