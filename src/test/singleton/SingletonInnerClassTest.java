package test.singleton; 

import org.junit.Assert;
import org.junit.Test;
import singleton.SingletonInnerClass;

/** 
* SingletonInnerClass Tester. 
* 
* author yunCrush
* 06/04/2021 
* @version 1.0 
*/ 
public class SingletonInnerClassTest { 

/** 
* 
* Method: getInstance() 
* 
*/ 
@Test
public void testGetInstance(){
    SingletonInnerClass singleton1 = SingletonInnerClass.getInstance();
    SingletonInnerClass singleton2 = SingletonInnerClass.getInstance();
    Assert.assertEquals(singleton1,singleton2);
    }
} 
