package com.mockList;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ReturnThen {
	@Test
	public void test() {
		List mock = mock(List.class);
		when(mock.get(anyInt()))
			.thenReturn(1)
			.thenReturn(2)
			.thenReturn(3)
			.thenReturn(4);
			
		assertEquals(1, mock.get(0));
		
		assertEquals(2, mock.get(0));
		
		assertEquals(3, mock.get(0));
		
		assertEquals(4, mock.get(0));//after this return will be last one
		
		//--last return type
		assertEquals(4, mock.get(0));
		assertEquals(4, mock.get(0));
		assertEquals(4, mock.get(0));
		
		System.out.println(mock.get(0));
		System.out.println(mock.get(0));
		System.out.println(mock.get(0));
	}
}
