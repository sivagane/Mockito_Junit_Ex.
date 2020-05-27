package org.qa.myservice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MockInjection {

	@Mock
	List<String>mocklist;
	
	@InjectMocks
	Employee mockEmployee;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void mockTest() {
		when(mocklist.get(0)).thenReturn("Sivaganesh");
		when(mocklist.get(1)).thenReturn("Pudhucherry");
		when(mocklist.size()).thenReturn(5);
		assertEquals(5, mocklist.size());
		assertEquals("Sivaganesh", mocklist.get(0));
		assertEquals("Sivaganesh", mockEmployee.getEmpname().get(0));//Mock Injection is done on Employee Class
		
	}
	
}

class Employee{
	List<String>empname;

	public List<String> getEmpname() {
		return empname;
	}

	public void setEmpname(List<String> empname) {
		this.empname = empname;
	}
	
}
