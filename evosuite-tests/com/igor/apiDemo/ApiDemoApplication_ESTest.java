/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 28 19:56:43 GMT 2020
 */

package com.igor.apiDemo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.igor.apiDemo.ApiDemoApplication;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ApiDemoApplication_ESTest extends ApiDemoApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApiDemoApplication apiDemoApplication0 = new ApiDemoApplication();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        ApiDemoApplication.main(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/boot/SpringApplication
         //
         verifyException("com.igor.apiDemo.ApiDemoApplication", e);
      }
  }
}
