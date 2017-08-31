/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


@RunWith(Arquillian.class)
public class UtilitiesTest {

    @Deployment
    public static WebArchive desplegar() {
        WebArchive salida = ShrinkWrap.create(WebArchive.class).addClass(Utilities.class).addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }

    @Inject
    private Utilities utilities;
/**
 * prueba para el metodo getResumen
 * 
 */
   @Test
    public void probarMetodogetResumen() {
        String frase = "Bienvenidos a la mat";
        String resumen = "Bienvenidos a la materia de Programación 3 Ciclo II 2017";
        String resultado = utilities.getresumen(resumen);
        Assert.assertEquals(frase, resultado);
    }
    @Test
    public void probargetResumen(){
          String fraseEsperada = "Hola Mundo!";
        String fraseCompleta = "Hola Mundo!";
        String resultado = utilities.getresumen(fraseCompleta);
        Assert.assertEquals(fraseEsperada, resultado);
        
        
    } 
    
    @Test
    public void probargetResum(){
          String fraseEsperada = " ";
        String fraseCompleta = " ";
        String resultado = utilities.getresumen(fraseCompleta);
        Assert.assertEquals(fraseEsperada, resultado);
    }
    /**
     * prueba para el metodo Capitalizar
     * 
     */
   
    @Test
    public void probarMetodoCapitalizar() {
        String fraseEsperada2 = "Pruebas De Unidad Con Junit y Arquillian";
        String texto="PrueBas de UNIDAD con JUnit & arQuillian";
        String resultado = utilities.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
    }
    
    @Test
    public void probarMetodoCapitaliza() {
        String fraseEsperada2 = " ";
        String texto=" ";
        String resultado = utilities.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
    }
    @Test
    public void probarMetodCapitalizar() {
        String fraseEsperada2 = null;
        String texto=null;
        String resultado = utilities.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
    }
    /**
     * pruebas para metodo Contar
     */
    @Test
    public void probarMetodoConta() {
        int fraseEsperada3= 1;
        String frase="2017";
        String Cadena = "Bienvenidos a la materia de programacion 3 del ciclo II 2017 materia";
        int resultado = utilities.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(fraseEsperada3, resultado);
    }
   
   @Test
    public void probarMetodoContar() {
        int fraseEsperada3= 2;
        String frase="MA";
        String Cadena = "Bienvenidos a la materia de programacion 3 del ciclo II 2017 materia";
        int resultado = utilities.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(fraseEsperada3, resultado);
    }
   @Test
    public void probarMetodoContr() {
        int fraseEsperada3= 0;
        String frase="bienbenido";
        String Cadena = "";
        int resultado = utilities.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(fraseEsperada3, resultado);
    }
   
    

}
