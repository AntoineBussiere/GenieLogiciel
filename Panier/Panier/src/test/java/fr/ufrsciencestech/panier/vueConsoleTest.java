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
public class vueConsoleTest extends TestCase {
    
    public vueConsoleTest(String testName) {
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
     * Test of update method, of class vueConsole.
     */
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object arg = null;
        vueConsole instance = new vueConsole();
        instance.update(o, arg);
    }
    
}
