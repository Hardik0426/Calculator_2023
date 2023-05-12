package org.maisurha.calculator;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	CalculatorLogic c=new CalculatorLogic();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testAdd() {
    	float expected=5;
    	float actual=c.add(2,3);
    	assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void testSub() {
    	float expected=0;
    	float actual=c.sub(3,3);
    	assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void testMul() {
    	float expected=6;
    	float actual=c.mul(2,3);
    	assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void testDiv() {
    	float expected=4;
    	float actual=c.div(12,3);
    	assertEquals(expected, actual, 0.1);
    }
    
    @BeforeClass
    public void init() {
    	
    }
}
