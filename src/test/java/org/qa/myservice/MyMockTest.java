package org.qa.myservice;
import org.junit.Test;
import org.mockito.Mockito;
import junit.framework.Assert;
import static org.mockito.Mockito.*;
public class MyMockTest {

	@Test
	public void testMock() {
		MyServiceProvider mockobj = Mockito.mock(MyServiceProvider.class);//creating the mock object
	    when(mockobj.add(30, 40)).thenReturn(70);//behaviour
	    Assert.assertEquals(70, mockobj.add(30, 40));//validation
	}
}
