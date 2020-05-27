package org.qa.myservice;

import java.util.List;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
public class MyMockList {

	@Test
	public void myMockTest() {
		List<String>mockobj=Mockito.mock(List.class);
		when(mockobj.size()).thenReturn(5);
		assertTrue(mockobj.size()==5);
	}
}
