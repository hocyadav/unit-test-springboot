package com.mockList;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockListClass {

	@Test
	public void mockListClass_andSize() {
		//mock List class
		List listObj = mock(List.class);
		//when-then (stub)
		when(listObj.size()).thenReturn(2);
		//test
		System.out.println(listObj.size());//2
		assertEquals(2, listObj.size());
	}

	@Test
	public void mockListClass_andGet() {
		//mock List class
		List list = mock(List.class);
		//when-then
		when(list.get(0)).thenReturn("hariom");//(stub)
		//test
		System.out.println(list.get(0));//hariom
		assertEquals("hariom", list.get(0));
	}

	@Test
	public void mockListClass_NiceMockConcept() {
		List list = mock(List.class);
		System.out.println(list.get(0));//null
		System.out.println(list.get(1));//null

		assertEquals(null, list.get(0));
		assertEquals(null, list.get(1));
	}
}
