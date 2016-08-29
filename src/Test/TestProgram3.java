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
	public void test1Average() {
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
	public void test1Variance() {
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
	public void test1StandardDeviation() {
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
	public void tes1VS() {
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
	public void tes1S() {
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
	public void tes1M() {
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
	public void tes1L() {
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
	public void tes1VL() {
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
	
	/*
	 * Test 2
	 */
	
	@Test
	public void test2Average() {
		doublyLinkedList.insertEnd(7);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(20);
		doublyLinkedList.insertEnd(14);
		doublyLinkedList.insertEnd(18);
		doublyLinkedList.insertEnd(12);
		result = calculator.average(doublyLinkedList);
		assertEquals(2.4193, result, 0.0001);
	}
	
	@Test
	public void test2Variance() {
		doublyLinkedList.insertEnd(7);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(20);
		doublyLinkedList.insertEnd(14);
		doublyLinkedList.insertEnd(18);
		doublyLinkedList.insertEnd(12);
		result = calculator.variance(doublyLinkedList);
		assertEquals(0.0820, result, 0.0001);
	}
	
	@Test
	public void test2StandardDeviation() {
		doublyLinkedList.insertEnd(7);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(20);
		doublyLinkedList.insertEnd(14);
		doublyLinkedList.insertEnd(18);
		doublyLinkedList.insertEnd(12);
		result = calculator.standardDeviation(doublyLinkedList);
		assertEquals(0.2864, result, 0.0001);
	}
	
	@Test
	public void tes2VS() {
		doublyLinkedList.insertEnd(7);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(20);
		doublyLinkedList.insertEnd(14);
		doublyLinkedList.insertEnd(18);
		doublyLinkedList.insertEnd(12);
		result = calculator.VS(doublyLinkedList);
		assertEquals(6.3375, result, 0.0001);
	}

	@Test
	public void tes2S() {
		doublyLinkedList.insertEnd(7);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(20);
		doublyLinkedList.insertEnd(14);
		doublyLinkedList.insertEnd(18);
		doublyLinkedList.insertEnd(12);
		result = calculator.S(doublyLinkedList);
		assertEquals(8.4393, result, 0.0001);
	}
	
	@Test
	public void tes2M() {
		doublyLinkedList.insertEnd(7);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(20);
		doublyLinkedList.insertEnd(14);
		doublyLinkedList.insertEnd(18);
		doublyLinkedList.insertEnd(12);
		result = calculator.M(doublyLinkedList);
		assertEquals(11.2381, result, 0.0001);
	}
	
	@Test
	public void tes2L() {
		doublyLinkedList.insertEnd(7);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(20);
		doublyLinkedList.insertEnd(14);
		doublyLinkedList.insertEnd(18);
		doublyLinkedList.insertEnd(12);
		result = calculator.L(doublyLinkedList);
		assertEquals(14.9650, result, 0.0001);
	}
	
	@Test
	public void tes2VL() {
		doublyLinkedList.insertEnd(7);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(12);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(8);
		doublyLinkedList.insertEnd(20);
		doublyLinkedList.insertEnd(14);
		doublyLinkedList.insertEnd(18);
		doublyLinkedList.insertEnd(12);
		result = calculator.VL(doublyLinkedList);
		assertEquals(19.9280, result, 0.0001);
	}
	
}
