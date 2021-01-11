package com.cg.Lab2;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class Exercise4Test {
	private static int [] EMPTY_INTEGER_ARRAY=new int[0];
	private static int [] INTEGER_ARRAY_WITH_SINGLE_NUMBER= {1};
    private static int EXPECTED=1;
    private Exercise4 exercise4;
    @Before
    public void setup(){
    	exercise4 =new Exercise4();
   }
    @Test
    public void testGetsecondsmallest_GivenEmptyArray_ShouldReturn0AsInteger(){
    	int result=Exercise4.removeDupl(EMPTY_INTEGER_ARRAY);
    	assertEquals(0,result);
    }
    @Test
    public void testGetsecondSmallest_GivenEmptyArrayWith1Number_ShouldReturnThatNumberAsInteger() {
    	int result =exercise4.removeDupl(INTEGER_ARRAY_WITH_SINGLE_NUMBER);
    	assertEquals(EXPECTED,result);
    	
    }

	}


