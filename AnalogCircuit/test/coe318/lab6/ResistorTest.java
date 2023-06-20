package coe318.lab6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author syedabbas
 */
public class ResistorTest {
    
    Resistor instance = new Resistor (1000,1,2);
    
    public ResistorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Resistor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "R1 1 2 1000.0";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of getNode1 method, of class Component (parent class of Resistor).
     */
    @Test
    public void testGetNode1() {
        System.out.println("getNode1");
        int expResult = 1;
        int result = instance.getNode1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}