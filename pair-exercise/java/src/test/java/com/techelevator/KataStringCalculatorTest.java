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

@Test
public void three() {
	assertEquals(3, KataStringCalculator.addString("1,2"));

}

@Test
public void Test_Different_Dilimeters() {

	KataStringCalculator calc = new KataStringCalculator();
	assertEquals(10, calc.add("5\n3,2"));
	assertEquals(14, calc.add("3\n5\n2,4"));
}

@Test
public void threeNumbers() {
	assertEquals(13, KataStringCalculator.addString("1,5,7"));
	assertEquals(101, KataStringCalculator.addString("25,25,51"));

}


}
