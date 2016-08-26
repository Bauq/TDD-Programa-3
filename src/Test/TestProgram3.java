package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import List.DoublyLinkedList;
import Utilities.Calculator;

public class TestProgram3 {
	
	private DoublyLinkedList doublyLinkedList;
	private Calculator calculator;
	private double result;

	@Before
	public void setUp() throws Exception {
		doublyLinkedList = new DoublyLinkedList();
		calculator= new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAverage() {
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(8.3333);
		doublyLinkedList.insertEnd(10.3333);
		doublyLinkedList.insertEnd(12.3333);
		doublyLinkedList.insertEnd(16.4);
		doublyLinkedList.insertEnd(20.5);
		doublyLinkedList.insertEnd(21.75);
		doublyLinkedList.insertEnd(22.25);
		doublyLinkedList.insertEnd(23);
		doublyLinkedList.insertEnd(28.3333);
		doublyLinkedList.insertEnd(29);
		doublyLinkedList.insertEnd(55.8);
		result = calculator.average(doublyLinkedList);
		assertEquals(2.8015, result, 0.0001);
	}
	
	@Test
	public void testVariance() {
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(8.3333);
		doublyLinkedList.insertEnd(10.3333);
		doublyLinkedList.insertEnd(12.3333);
		doublyLinkedList.insertEnd(16.4);
		doublyLinkedList.insertEnd(20.5);
		doublyLinkedList.insertEnd(21.75);
		doublyLinkedList.insertEnd(22.25);
		doublyLinkedList.insertEnd(23);
		doublyLinkedList.insertEnd(28.3333);
		doublyLinkedList.insertEnd(29);
		doublyLinkedList.insertEnd(55.8);
		result = calculator.variance(doublyLinkedList);
		assertEquals(0.4363, result, 0.0001);
	}
	
	@Test
	public void testStandardDeviation() {
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(8.3333);
		doublyLinkedList.insertEnd(10.3333);
		doublyLinkedList.insertEnd(12.3333);
		doublyLinkedList.insertEnd(16.4);
		doublyLinkedList.insertEnd(20.5);
		doublyLinkedList.insertEnd(21.75);
		doublyLinkedList.insertEnd(22.25);
		doublyLinkedList.insertEnd(23);
		doublyLinkedList.insertEnd(28.3333);
		doublyLinkedList.insertEnd(29);
		doublyLinkedList.insertEnd(55.8);
		result = calculator.standardDeviation(doublyLinkedList);
		assertEquals(0.6605, result, 0.0001);
	}
	
	@Test
	public void tesVS() {
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(8.3333);
		doublyLinkedList.insertEnd(10.3333);
		doublyLinkedList.insertEnd(12.3333);
		doublyLinkedList.insertEnd(16.4);
		doublyLinkedList.insertEnd(20.5);
		doublyLinkedList.insertEnd(21.75);
		doublyLinkedList.insertEnd(22.25);
		doublyLinkedList.insertEnd(23);
		doublyLinkedList.insertEnd(28.3333);
		doublyLinkedList.insertEnd(29);
		doublyLinkedList.insertEnd(55.8);
		result = calculator.VS(doublyLinkedList);
		assertEquals(4.3953, result, 0.0001);
	}

	@Test
	public void tesS() {
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(8.3333);
		doublyLinkedList.insertEnd(10.3333);
		doublyLinkedList.insertEnd(12.3333);
		doublyLinkedList.insertEnd(16.4);
		doublyLinkedList.insertEnd(20.5);
		doublyLinkedList.insertEnd(21.75);
		doublyLinkedList.insertEnd(22.25);
		doublyLinkedList.insertEnd(23);
		doublyLinkedList.insertEnd(28.3333);
		doublyLinkedList.insertEnd(29);
		doublyLinkedList.insertEnd(55.8);
		result = calculator.S(doublyLinkedList);
		assertEquals(8.5081, result, 0.0001);
	}
	
	@Test
	public void tesM() {
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(8.3333);
		doublyLinkedList.insertEnd(10.3333);
		doublyLinkedList.insertEnd(12.3333);
		doublyLinkedList.insertEnd(16.4);
		doublyLinkedList.insertEnd(20.5);
		doublyLinkedList.insertEnd(21.75);
		doublyLinkedList.insertEnd(22.25);
		doublyLinkedList.insertEnd(23);
		doublyLinkedList.insertEnd(28.3333);
		doublyLinkedList.insertEnd(29);
		doublyLinkedList.insertEnd(55.8);
		result = calculator.M(doublyLinkedList);
		assertEquals(16.4696, result, 0.0001);
	}
	
	@Test
	public void tesL() {
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(8.3333);
		doublyLinkedList.insertEnd(10.3333);
		doublyLinkedList.insertEnd(12.3333);
		doublyLinkedList.insertEnd(16.4);
		doublyLinkedList.insertEnd(20.5);
		doublyLinkedList.insertEnd(21.75);
		doublyLinkedList.insertEnd(22.25);
		doublyLinkedList.insertEnd(23);
		doublyLinkedList.insertEnd(28.3333);
		doublyLinkedList.insertEnd(29);
		doublyLinkedList.insertEnd(55.8);
		result = calculator.L(doublyLinkedList);
		assertEquals(31.8811, result, 0.0001);
	}
	
	@Test
	public void tesVL() {
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(8.3333);
		doublyLinkedList.insertEnd(10.3333);
		doublyLinkedList.insertEnd(12.3333);
		doublyLinkedList.insertEnd(16.4);
		doublyLinkedList.insertEnd(20.5);
		doublyLinkedList.insertEnd(21.75);
		doublyLinkedList.insertEnd(22.25);
		doublyLinkedList.insertEnd(23);
		doublyLinkedList.insertEnd(28.3333);
		doublyLinkedList.insertEnd(29);
		doublyLinkedList.insertEnd(55.8);
		result = calculator.VL(doublyLinkedList);
		assertEquals(61.7137, result, 0.0001);
	}
}
