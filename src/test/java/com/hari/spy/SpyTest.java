package com.hari.spy;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
//https://www.baeldung.com/mockito-spy
//list class obj (normal obj creation) -> spy obj(Mockito.spy) -> call method (Mockito.verify)
//verify method(normal method call) -> assert test
public class SpyTest {
	
	@Test
	public void testSpy1() {
		List<String> list = new ArrayList<>();
		List<String> listspy = Mockito.spy(list);
		
		listspy.add("hari");//actual add is called - we are not stubbing method of list
		listspy.add("om");

		Mockito.verify(listspy).add("hari");//verify that method is called or not
		Mockito.verify(listspy).add("om");
		
		assertEquals(2, listspy.size());
	}
	
	@Test
	public void spyTest2() {
		List<String> list = new ArrayList<String>();
		List<String> spy = Mockito.spy(list);
		
		assertEquals(0, spy.size());
	}
	
	@Test
	public void spyTest3() {
		List<String> list = new ArrayList<String>();
		List<String> spy = Mockito.spy(list);
		
		assertEquals(0, spy.size());
		//override list method - i.e. stubbing list method by using doReturn()
		
		
		Mockito.doReturn(100).when(spy).size();//when size() method called - return 100 
		Mockito.verify(spy).size();//Optional : verify size is called or not
		assertEquals(100, spy.size());//check our stub size output
	}
	
	@Test
	public void spyTest3_1() {
		//List<String> list = new ArrayList<String>();
		List<String> spy = Mockito.spy(ArrayList.class);//pass class name to create spy class
		
		assertEquals(0, spy.size());
		//override list method - i.e. stubbing list method by using doReturn()
		
		Mockito.doReturn(100).when(spy).size();//when size() method called - return 100 
		Mockito.verify(spy).size();//Optional : verify size is called or not
		assertEquals(100, spy.size());//check our stub size output
	}
	
}
