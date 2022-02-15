package jss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tarea6Test {

	@Test
	void testEj1() {
		assertEquals(6,tarea6.ej1(2, 6, 1));
		assertEquals(4,tarea6.ej1(2, 5, 1));
		assertEquals(4,tarea6.ej1(2, 6, 3));
		assertEquals(4,tarea6.ej1(1, 5, 2));	
	}

	@Test
	void testEj2() {
		assertEquals(6,tarea6.ej2(2, 6, 1));
		assertEquals(6,tarea6.ej2(2, 6, 1));
		assertEquals(6,tarea6.ej2(2, 6, 1));
		assertEquals(4,tarea6.ej2(0, 4, 3));
	}

	@Test
	void testEj5() {
		assertEquals(1,tarea6.ej5(3, 2));
		assertEquals(3,tarea6.ej5(3, 6));
		assertEquals(1,tarea6.ej5(1, 1));
	}

	@Test
	void testEj6() {
		assertEquals(1,tarea6.ej6(1, 1, 2));
		assertEquals(-1,tarea6.ej6(0, 6, 5));
		assertEquals(0,tarea6.ej6(5, 7, 9));
		assertEquals(0,tarea6.ej6(3, 4, 7));

	}

	@Test
	void testEj8() {
		assertEquals(1,tarea6.ej8(3, 0));
		assertEquals(0,tarea6.ej8(1, -1));
		assertEquals(2,tarea6.ej8(3, 5));
	}

}
