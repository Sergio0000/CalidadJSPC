/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import junitparams.JUnitParamsRunner;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Hp
 */
public class CombinatoriaTest {

    Combinatoria calc = new Combinatoria();

    public CombinatoriaTest() {
    }

    @Test
    public void test1() {
        try {
            int resultado = calc.calcular(5, 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertEquals("x es mayor que n", e.getMessage());
        }
    }

    @Test
    public void test2() {
        try {
            int resultado = calc.calcular(5,-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertEquals("x no puede ser negativo", e.getMessage());
        }
    }

    @Test
    public void test3() {
        try {
            int resultado = calc.calcular(-5, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertEquals("n no puede ser negativo", e.getMessage());
        }
    }

    @Test
    public void test4() {
     
            int resultado = calc.calcular(3, 0);
        assertEquals(1, resultado);
    }

    @Test
    public void test5() {
        int resultado = calc.calcular(4, 1);
        assertEquals(4, resultado);
    }

    @Test
    public void test6() {
           int resultado = calc.calcular(5, 2);
        assertEquals(10, resultado);
    }

    @Test
    public void test7() {
            int resultado = calc.calcular(7, 3);
        assertEquals(35, resultado);
    }

    @Test
    public void test8() {
         int resultado = calc.calcular(4, 4);
        assertEquals(1, resultado);
    }
        @Test
    public void test9() {
        assertFalse(calc.isInteger("a"));
    }
    @Test
    public void test10() {
           int resultado = calc.calcular(1, 1);
        assertEquals(1, resultado);
    }

}
