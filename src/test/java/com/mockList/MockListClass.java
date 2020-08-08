package com.mockList;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockListClass {
	
	@Test
	public void test1() {
		//mock List class
		List listObj = mock(List.class);
		//when-then
		when(listObj.size()).thenReturn(2);
		//test
		System.out.println(listObj.size());//2
		assertEquals(2, listObj.size());
	}
}
