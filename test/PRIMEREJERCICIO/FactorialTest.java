/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRIMEREJERCICIO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    private Factorial instance = new Factorial();
    
    public void testCalculo(){
        instance.calculo(-1);
    }
    
    public void testCalculo1(){
        instance.calculo(100);
    }
    public void testCalculo2(){
        instance.calculo(1);
    }
    public void testCalculo3(){
        instance.calculo(1);
    }
    
}
