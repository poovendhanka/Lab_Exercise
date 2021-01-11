package com.capg.Lab_3;
import static org.junit.Assert.*;
import org.junit.Test;
public class Exercise2Test {
	private Exercise2 exercise2;
    public void setup()
    {
    	exercise2= new Exercise2(); 
    }
    @Test
    public void StringReverse_GivenString_ShouldReturnNull()
    {
    	String sb= new String("");
    	String result= Exercise2.stringReverse(sb);
        assertEquals(null, result );
    }
    @Test
    public void stringReverse_GivenSameCharactersInString_ShouldReturnSameString()
    {
    	String sb= new String("SSS");
    	String result= Exercise2.stringReverse(sb);
        assertEquals("SSS|SSS", result.toString() );
    }
    @Test
    public void StringReverse_GivenString_ShouldReturnReverse()
    {
    	String sb= new String("SHYAM");
    	
    	String expected= new String("SHYAM|MAYHS");
    	String result= Exercise2.stringReverse(sb);
    	
        assertEquals( expected.toString(), result.toString());
    }
}