/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraintensivo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario1
 */
public class CalculadoraIntensivoIT {
    
    public CalculadoraIntensivoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class CalculadoraIntensivo.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double num1 = 5.0;
        double num2 = 7.0;
        CalculadoraIntensivo instance = new CalculadoraIntensivo();
        double expResult = 12.0;
        double result = instance.suma(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class CalculadoraIntensivo.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double num1 = -2.0;
        double num2 = -7.0;
        CalculadoraIntensivo instance = new CalculadoraIntensivo();
        double expResult = 5.0;
        double result = instance.resta(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class CalculadoraIntensivo.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double num1 = 8.0;
        double num2 = 0.0;
        CalculadoraIntensivo instance = new CalculadoraIntensivo();
        double expResult = 0.0;
        double result = instance.multiplicacion(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CalculadoraIntensivo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraIntensivo.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
