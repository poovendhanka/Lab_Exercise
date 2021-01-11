package com.capg.Lab_3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Exercise3Test {
	private  Exercise3 Exercise3;
	@Before
	public void setup()
	{
		Exercise3 = new Exercise3();
	}
	@Test
	public void get_replaceConsonants_AndReturnNull() {
		String ar="";
		String arr=Exercise3.replaceConsonants(ar);
		assertEquals("",arr);
	}
	
	
	}	

