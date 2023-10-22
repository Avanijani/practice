package com.miit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	

  @Test
public void testAdd() {
	  
	  assertEquals(6,Calculator.add(3, 3));
	  
  }
	@Test
	public void testsub() {
		assertEquals(4,Calculator.substract(6,2));
		
	}
		
		@Test
		public void testmul() {
		assertEquals(4,Calculator.multiply(2,2));	
		}
		
		@Test
		public void testdiv() {
		assertEquals(3,Calculator.division(6,2));	
		}
	}
