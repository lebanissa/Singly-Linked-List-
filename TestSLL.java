import static org.junit.Assert.*;

import org.junit.Test;

public class TestSLL {

	@Test
	public void testChainOfNodesApproach1() {
		Node tom = new Node("Tom", null);
		Node mark = new Node("Mark", tom);
		Node alan = new Node("Alan", mark);
		
		assertTrue(alan.getNext() == mark);
		assertTrue(mark.getNext() == tom);
		assertTrue(alan.getNext().getNext() == tom);
		assertTrue(tom.getNext() == null);
		assertTrue(mark.getNext().getNext() == null);
		assertTrue(alan.getNext().getNext().getNext() == null);
		
		assertEquals("Alan", alan.getElement());
		assertEquals("Mark", mark.getElement());
		assertEquals("Mark", alan.getNext().getElement());
		assertEquals("Tom", tom.getElement());
		assertEquals("Tom", mark.getNext().getElement());
		assertEquals("Tom", alan.getNext().getNext().getElement());
	}
	
	@Test
	public void testChainOfNodesApproach2() {
		Node alan = new Node("Alan", null);
		Node mark = new Node("Mark", null);
		Node tom = new Node("Tom", null);
		alan.setNext(mark);
		mark.setNext(tom);
		
		assertTrue(alan.getNext() == mark);
		assertTrue(mark.getNext() == tom);
		assertTrue(alan.getNext().getNext() == tom);
		assertTrue(tom.getNext() == null);
		assertTrue(mark.getNext().getNext() == null);
		assertTrue(alan.getNext().getNext().getNext() == null);
		
		assertEquals("Alan", alan.getElement());
		assertEquals("Mark", mark.getElement());
		assertEquals("Mark", alan.getNext().getElement());
		assertEquals("Tom", tom.getElement());
		assertEquals("Tom", mark.getNext().getElement());
		assertEquals("Tom", alan.getNext().getNext().getElement());
	}
	
	@Test
	public void testSLL() {
		SinglyLinkedList list = new SinglyLinkedList();
		assertTrue(list.getSize() == 0);
		assertTrue(list.getFirst() == null);
		
		list.addFirst("Tom");
		list.addFirst("Mark");
		list.addFirst("Alan");
		assertTrue(list.getSize() == 3);
		assertEquals("Alan", list.getFirst().getElement());
		assertEquals("Mark", list.getFirst().getNext().getElement());
		assertEquals("Tom", list.getFirst().getNext().getNext().getElement());
	}
}
