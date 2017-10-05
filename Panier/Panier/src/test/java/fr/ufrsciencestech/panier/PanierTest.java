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
public class PanierTest extends TestCase {
    
    public PanierTest(String testName) {
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
     * Test of estPlein method, of class Panier.
     */
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = new Panier(1);
        instance.ajoute();
        boolean expResult = false;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
        System.out.println("estVide");
        Panier instance = new Panier(5);
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAt method, of class Panier.
     */
    public void testGetAt() {
        System.out.println("getAt");
        int i = 0;
        Panier instance = new Panier(1);
        instance.ajoute();
        Orange expResult = null;
        Object result = instance.getAt(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Panier.
     */
    public void testSize() {
        System.out.println("size");
        Panier instance = new Panier(5);
        instance.ajoute(new Banane());
        instance.ajoute(new Orange());
        int expResult = 0;
        double result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Panier.
     */
    public void testToString() {
        System.out.println("toString");
        Panier instance = new Panier(5);
        instance.ajoute();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Panier.
     */
    public void testEquals1() {
        System.out.println("equals");
        Object obj = null;
        Panier instance = new Panier(5);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    public void testEquals2(){
        Panier p = new Panier(20);
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = p.equals(instance);
        assertEquals(expResult, result);
    }
    
    public void testEquals3(){
        Panier p = new Panier(5);
        Panier o = new Panier(5);
        o.ajoute();
        boolean expResult = false;
        boolean result = p.equals(o);
        assertEquals(expResult, result);
    }
    
    public void testEquals4(){
        Panier p = new Panier(5);
        Panier o = new Panier(5);
        boolean expResult = false;
        boolean result = p.equals(o);
        assertEquals(expResult, result);
    }
    
    public void testEquals5(){
        Panier o = new Panier(5);
        Object obj = o;
        boolean expResult = false;
        boolean result = o.equals(obj);
        assertEquals(expResult, result);
    }
    
    public void testEquals6(){
        Panier o = new Panier(5);
        Panier p = new Panier(5);
        p.ajoute();
        o.ajoute(new Orange(2,"FR"));
        boolean expResult = false;
        boolean result = o.equals(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    public void testAjoute_0args() {
        System.out.println("ajoute");
        Panier instance = new Panier(0);
        instance.ajoute();
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    public void testAjoute_Objet() {
        System.out.println("ajoute");
        Panier p = new Panier(2);
        p.ajoute(new Banane());
        p.ajoute(new Banane());
        p.ajoute(new Orange());
    }

    /**
     * Test of retire method, of class Panier.
     */
    public void testRetire() {
        System.out.println("retire");
        Panier instance = new Panier(5);
        instance.retire();
        instance.ajoute();
        instance.retire();
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        Panier p = new Panier(5);
        p.ajoute(new Banane());
        p.ajoute(new Orange());
        int expResult = 0;
        int result = p.getPrix();
        assertEquals(expResult, result);
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    public void testBoycotteOrigine1() {
        System.out.println("boycotteOrigine");
        String pays = "France";
        Panier instance = new Panier(5);
        instance.ajoute();
        instance.boycotteOrigine(pays);
    }
    
    public void testBoycotteOrigine2() {
        System.out.println("boycotteOrigine");
        String pays = "France";
        Panier instance = new Panier(5);
        instance.ajoute(new Banane());
        instance.boycotteOrigine(pays);
    }
    
    public void testAffiche(){
        Panier p = new Panier(5);
        p.ajoute(new Banane());
        p.ajoute(new Banane());
        p.ajoute(new Orange());
    }
    
    public void testGetElement(){
        Panier p = new Panier(5);
        p.ajoute(new Orange());
        p.ajoute(new Banane());
        int expResult = 0;
        int result = p.getElement(Banane.class);
        assertEquals(expResult, result);
        
        result = p.getElement(Orange.class);
        assertEquals(expResult, result);
        
    }
    
    public void testRetireObjet(){
        Panier p = new Panier(5);
        p.ajoute(new Orange());
        p.retire(Panier.class);
        p.retire(Orange.class);
    }
    
}
