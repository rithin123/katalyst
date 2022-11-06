package com.katalyst.codetest.codetest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Optional;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FooBarTest {

	private FooBar fooBar;
	
	private static ByteArrayOutputStream outContent;
	private static ByteArrayOutputStream errContent;
	private static PrintStream originalOut;
	private static PrintStream originalErr;
	
	
	@BeforeEach
	void setUp()
	{
		fooBar=new FooBar();
		outContent = new ByteArrayOutputStream();
		errContent = new ByteArrayOutputStream();
		originalOut = System.out;
		originalErr = System.err;
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	
	@Test
	void numberPrinting_DivisibleByThree_Success() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(3,6,9)));
		Assertions.assertEquals("Foo\nFoo\nFoo",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_DivisibleByThree_Failure() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(3,6,9)));
		Assertions.assertNotEquals("Foo\nFoo",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_DivisibleByFive_Success() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(5,10)));
		Assertions.assertEquals("Bar\nBar",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_DivisibleByFive_Failure() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(5,6,10)));
		Assertions.assertNotEquals("Foo\nFoo\nFoo",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_ZeroCase_Success() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(0,0)));
		Assertions.assertEquals("",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_ZeroCase_Failure() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(0,0)));
		Assertions.assertNotEquals("0\n0",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_DivisibleByThreeAndFive_Success() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(15,30)));
		Assertions.assertEquals("Foo Bar\nFoo Bar",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_DivisibleByThreeAndFive_Failure() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(16,17)));
		Assertions.assertNotEquals("Foo Bar",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_NullElementCase_Success() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(16,17,null)));
		Assertions.assertEquals("16\n17",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_NumbersElementCase_Success() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(1,2,4,7,8)));
		Assertions.assertEquals("1\n2\n4\n7\n8",outContent.toString().trim());
	}
	
	@Test
	void numberPrinting_NumbersElementCase_Failure() {
		
		fooBar.numberPrinting(Optional.ofNullable(Arrays.asList(1,2,4,7,8)));
		Assertions.assertNotEquals("Foo\nBar\nFoo Bar",outContent.toString().trim());
	}
	
	
	@Test
	void numberPrinting_NullCase_Success() {
		
		Exception exception = assertThrows(NullPointerException.class, () -> fooBar.numberPrinting(Optional.ofNullable(null)));
		
		Assertions.assertEquals("List cannot be null",exception.getMessage());
	}
	
	//fooBar.numberPrinting(Optional.ofNullable(IntStream.range(16, 17).boxed().collect(Collectors.toList())));
	@AfterAll 
    public static void end() {
		  originalOut = System.out;
		  originalErr = System.err;
		  System.setOut(originalOut);
		  System.setErr(originalErr);
 
    }

}
