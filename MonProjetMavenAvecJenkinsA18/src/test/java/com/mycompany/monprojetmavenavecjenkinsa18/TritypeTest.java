/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monprojetmavenavecjenkinsa18;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class TritypeTest {

    public TritypeTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of generer method, of class Tritype.
     */
    @Test
    public void testGenerer() {
    }

    @Test
    void testGenererdoitRetourner1SiValeurEst1() {
        Tritype fz = new Tritype();
        assertEquals("1", fz.generer(1));
    }

    @Test
    void testGenererdoitRetourner2SiValeurEst2() {
        Tritype fz = new Tritype();
        assertEquals("2", fz.generer(2));
    }

    @Test
    void testGenererdoitRetournerFizzSiValeurEst3() {
        Tritype fz = new Tritype();
        assertEquals("fizz", fz.generer(3));
    }

    @Test
    void testGenererdoitRetournerFizzSiValeurEst6() {
        Tritype fz = new Tritype();
        assertEquals("fizz", fz.generer(6));
    }

    @Test
    void testGenererdoitRetournerBuzzSiValeurEst5() {
        Tritype fz = new Tritype();
        assertEquals("buzz", fz.generer(5));
    }

    @Test
    void testGenererdoitRetournerBuzzSiValeurEst10() {
        Tritype fz = new Tritype();
        assertEquals("buzz", fz.generer(10));
    }

    @Test
    void testGenererdoitRetournerFizzBuzzSiValeurEst15() {
        Tritype fz = new Tritype();
        assertEquals("fizzbuzz", fz.generer(15));
    }

    @Test
    void testGenererdoitRetournerFizzBuzzSiValeurEst30() {
        Tritype fz = new Tritype();
        assertEquals("fizzbuzz", fz.generer(30));
    }
}
