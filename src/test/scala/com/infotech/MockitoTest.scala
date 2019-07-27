package com.infotech

import org.junit.Test
import org.mockito.Mockito
import com.infotech.ScalaPowerMock._
import org.junit.Assert._


class MockitoTest {
  

  @Test
  def SoftwareMockObjectTest{
        
    withPowerMock(Software){
      val mocked : Int = 4;
      Mockito.when(Software.printSomethingReturn).thenReturn(mocked)
      
      assertEquals(mocked, Software.printSomethingReturn)
    }
  }
}