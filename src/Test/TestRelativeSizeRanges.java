package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import List.DoublyLinkedList;
import Utilities.Calculator;
import main.RelativeSizeRanges;

public class TestRelativeSizeRanges {

	private DoublyLinkedList doublyLinkedList;
	private RelativeSizeRanges relativeSizeRanges;
	private String response;

	@Before
	public void setUp() throws Exception {
		doublyLinkedList = new DoublyLinkedList();
		relativeSizeRanges = new RelativeSizeRanges();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOneNumberRanges() {
		doublyLinkedList.insertEnd(5);
		response = relativeSizeRanges.Ranges(doublyLinkedList);
		assertEquals("La lista debe tener al menos dos elementos", response);
	}
	
	@Test
	public void testOneZeroRanges() {
		doublyLinkedList.insertEnd(5);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(0);
		response = relativeSizeRanges.Ranges(doublyLinkedList);
		assertEquals("La lista no puede tener el numero 0", response);
	}

	@Test
	public void testNegativeNumberRanges() {
		doublyLinkedList.insertEnd(5);
		doublyLinkedList.insertEnd(10);
		doublyLinkedList.insertEnd(-2);
		response = relativeSizeRanges.Ranges(doublyLinkedList);
		assertEquals("La lista no puede tener numeros negativos", response);
	}
	
	@Test
	public void testZeroAndNegativeRanges() {
		doublyLinkedList.insertEnd(-2);
		doublyLinkedList.insertEnd(2);
		doublyLinkedList.insertEnd(2);
		doublyLinkedList.insertEnd(2);
		doublyLinkedList.insertEnd(2);
		doublyLinkedList.insertEnd(2);
		doublyLinkedList.insertEnd(90);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(5);
		doublyLinkedList.insertEnd(2);
		doublyLinkedList.insertEnd(2);
		doublyLinkedList.insertEnd(90);
		doublyLinkedList.insertEnd(6);
		doublyLinkedList.insertEnd(0);
		response = relativeSizeRanges.Ranges(doublyLinkedList);
		assertEquals("La lista no puede tener el numero 0", response);
	}
	
	@Test
	public void testBigNumbersRanges() {
		doublyLinkedList.insertEnd(1000000000);
		doublyLinkedList.insertEnd(450000000);
		response = relativeSizeRanges.Ranges(doublyLinkedList);
		assertEquals("VS: 216857621.7482 S: 381408593.3751 M: 670820393.2499 L: 1179837077.1302 VL: 2075094231.7469", response);
	}
	
	@Test
	public void test1Ranges() {
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
		response = relativeSizeRanges.Ranges(doublyLinkedList);
		assertEquals("VS: 4.3953 S: 8.5081 M: 16.4696 L: 31.8810 VL: 61.7137", response);
	}
	
	@Test
	public void test2Ranges() {
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
		response = relativeSizeRanges.Ranges(doublyLinkedList);
		assertEquals("VS: 6.3375 S: 8.4393 M: 11.2381 L: 14.9650 VL: 19.9280", response);
	}
	

}
