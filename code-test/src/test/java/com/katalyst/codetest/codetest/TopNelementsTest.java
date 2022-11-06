package com.katalyst.codetest.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopNelementsTest {

	private List<Integer> list;
	private TopNelements topNelements;
	
	@BeforeEach
     void start() {
        topNelements=new TopNelements();
		list = new ArrayList<Integer>();
		list.addAll(new ArrayList<Integer>(Arrays.asList(20, 4, 55, 6, 7,2,null)));
    }
	/* From the example given, the assumption is the sorting is in descending order*/

	@Test
	void sort_Sanity_Success() {
		//fail("Not yet implemented")
		Assertions.assertEquals(Arrays.asList(55,20),topNelements.sort(Optional.ofNullable(list), 2),"Sanity Check");
		
	}
	
	@Test
	void sort_LimitSanity_Success() {
		Assertions.assertEquals(Arrays.asList(55,20,7),topNelements.sort(Optional.ofNullable(list), 3),"Checking the limit");
	}
	
	@Test
    void sort_Sanity_Failure() {
		Assertions.assertNotEquals(Arrays.asList(2,4),topNelements.sort(Optional.ofNullable(list), 2),"Sorting order failed ");
	}
	
	@Test
	void sort_LimitSanity_Failure() {
		Assertions.assertNotEquals(Arrays.asList(55,20),topNelements.sort(Optional.ofNullable(list), 1),"Top n logic fail: Limit fails ");
	}
	
	@Test
	void sort_NullSanity_Failure() {
		Assertions.assertNotEquals(Arrays.asList(55,20),topNelements.sort(Optional.ofNullable(null), 1),"List is null");
	}
	
	@Test
	void sort_NullSanity_Success() {
		Assertions.assertEquals(new ArrayList<Integer>(),topNelements.sort(Optional.ofNullable(null), 1),"List is null");
	}
	
	@Test
	void sort_LimitZero_Success() {
		Assertions.assertEquals(new ArrayList<Integer>(),topNelements.sort(Optional.ofNullable(list), 0),"Limit is zero");
	}
	
	
	@AfterAll 
    public static void end() {
        System.out.println("TopNelementsTest ended");
 
    }
	

}
