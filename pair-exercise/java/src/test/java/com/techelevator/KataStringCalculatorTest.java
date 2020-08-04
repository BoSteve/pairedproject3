package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataStringCalculatorTest {
	
@Test 
public void zero() {
	assertEquals(0, KataStringCalculator.addString(""));
}

@Test
public void oneNumber() {
	assertEquals(1, KataStringCalculator.addString("1"));
	assertEquals(2, KataStringCalculator.addString("2"));

}

@Test public void three() {
	assertEquals(3, KataStringCalculator.addString("1,2"));

}
}
