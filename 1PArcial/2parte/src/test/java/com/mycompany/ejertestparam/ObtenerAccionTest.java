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
public class ObtenerAccionTest {

    ObtnerAccion obj = new ObtnerAccion();

    public ObtenerAccionTest() {
    }

    @Test
    public void test1() {
        String esObligatorio = "si";
        Boolean esDocente = true;
        Boolean externo = false;
        String tipoPersonaDestino = "";
        String estadoRegistro = "";

        String resultado = obj.obtenerAccion(esObligatorio, esDocente, externo, tipoPersonaDestino, estadoRegistro);
        assertEquals("actualizar", resultado);
    }

    
 
    @Test
    public void test2() {

        String esObligatorio = "no";
        Boolean esDocente = true;
        Boolean externo = false;
        String tipoPersonaDestino = "";
        String estadoRegistro = "";

        String resultado = obj.obtenerAccion(esObligatorio, esDocente, externo, tipoPersonaDestino, estadoRegistro);
        assertEquals("matricular", resultado);
    }
   
    @Test
    public void test3() {

        String esObligatorio = "si";
        Boolean esDocente = false;
        Boolean externo = true;
        String tipoPersonaDestino = "";
        String estadoRegistro = "porConfirmar";

        String resultado = obj.obtenerAccion(esObligatorio, esDocente, externo, tipoPersonaDestino, estadoRegistro);
        assertEquals("actualizar", resultado);
    }

    @Test
    public void test4() {
        String esObligatorio = "";
        Boolean esDocente = false;
        Boolean externo = true;
        String tipoPersonaDestino = "externo";
        String estadoRegistro = "";

        String resultado = obj.obtenerAccion(esObligatorio, esDocente, externo, tipoPersonaDestino, estadoRegistro);
        assertEquals("registrar", resultado);
    }

    @Test
    public void test5() {

        String esObligatorio = "";
        Boolean esDocente = false;
        Boolean externo = true;
        String tipoPersonaDestino = "";
        String estadoRegistro = "Vigente";

        String resultado = obj.obtenerAccion(esObligatorio, esDocente, externo, tipoPersonaDestino, estadoRegistro);
        assertEquals("matricular", resultado);
    }
    
    public void test6() {

        String esObligatorio = "";
        Boolean esDocente = false;
        Boolean externo = true;
        String tipoPersonaDestino = "";
        String estadoRegistro = "";

        String resultado = obj.obtenerAccion(esObligatorio, esDocente, externo, tipoPersonaDestino, estadoRegistro);
        assertEquals("", resultado);
    }
}
