package com.katalyst.codetest.codetest;

import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

 
 private Anagram anagram;
	
	@BeforeEach
	void setUp()
	{
		anagram=new Anagram();
		
		
	}
	
	@Test
	void testAnagram_Sanity_Success() {
		//fail("Not yet implemented");
		
		Assertions.assertEquals(anagram.testAnagram(Optional.ofNullable("ABBA"),Optional.ofNullable("BABA")),true,"Basic Sanity");
	}
	
	@Test
	void testAnagram_DifferntStringSanity_Success() {
		//fail("Not yet implemented");
		
		Assertions.assertEquals(anagram.testAnagram(Optional.ofNullable("TEEN"),Optional.ofNullable("BABA")),false,"Basic Sanity");
	}
	
	@Test
	void testAnagram_Sanity_Failure() {
		//fail("Not yet implemented");
		
		Assertions.assertNotEquals(anagram.testAnagram(Optional.ofNullable("ABBAAA"),Optional.ofNullable("BABA")),true,"Basic Sanity");
	}
	
	@Test
	void testAnagram_NullSanityOne_Failure() {
		//fail("Not yet implemented");
		
		Assertions.assertNotEquals(anagram.testAnagram(Optional.ofNullable(null),Optional.ofNullable("BABA")),true,"Basic Null Sanity");
	}
	
	@Test
	void testAnagram_NullSanityOtherOne_Failure() {
		//fail("Not yet implemented");
		
		Assertions.assertNotEquals(anagram.testAnagram(Optional.ofNullable("BABA"),Optional.ofNullable(null)),true,"Basic Null Sanity");
	}
	
	@Test
	void testAnagram_EmptySanityOne_Failure() {
		//fail("Not yet implemented");
		
		Assertions.assertNotEquals(anagram.testAnagram(Optional.ofNullable(""),Optional.ofNullable("BABA")),true,"Basic Null Sanity");
	}

	@Test
	void testAnagram_EmptySanityTwo_Failure() {
		//fail("Not yet implemented");
		
		Assertions.assertNotEquals(anagram.testAnagram(Optional.ofNullable("BABA"),Optional.ofNullable("")),true,"Basic Null Sanity");
	}

	@Test
	void testAnagram_NullSanityTwo_Failure() {
		//fail("Not yet implemented");
		
		Assertions.assertNotEquals(anagram.testAnagram(Optional.ofNullable(""),Optional.ofNullable("")),true,"Basic Null Sanity");
	}
	
	@AfterAll 
    public static void end() {
        System.out.println("AnagramTest ended");
 
    }
	
}
