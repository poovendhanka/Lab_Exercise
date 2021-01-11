package com.cg.Lab2;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class Exercise1Test {
	private static int [] EMPTY_INTEGER_ARRAY=new int[0];
	private static int [] INTEGER_ARRAY_WITH_SINGLE_NUMBER= {1};
    private static int EXPECTED=1;
    private Exercise1 exercise1;
    @Before
    public void setup(){
    	exercise1 =new Exercise1();
   }
    @Test
    public void testGetsecondsmallest_GivenEmptyArray_ShouldReturn0AsInteger(){
    	int result=Exercise1.small(EMPTY_INTEGER_ARRAY);
    	assertEquals(0,result);
    }
    @Test
    public void testGetsecondSmallest_GivenEmptyArrayWith1Number_ShouldReturnThatNumberAsInteger() {
    	int result =exercise1.small(INTEGER_ARRAY_WITH_SINGLE_NUMBER);
    	assertEquals(EXPECTED,result);
    	
    }

	}


