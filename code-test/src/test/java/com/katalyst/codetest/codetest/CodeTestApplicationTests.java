package com.katalyst.codetest.codetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class CodeTestApplicationTests {

	@Autowired
    private ApplicationContext applicationContext;
	//this test is Only written to maintain the coverage 
	
	@Test
	void main_Success() {
		CodeTestApplication.main(new String[] {});
		Assertions.assertNotNull(applicationContext.getBean(Anagram.class));
		Assertions.assertNotNull(applicationContext.getBean(FooBar.class));
		Assertions.assertNotNull(applicationContext.getBean(TopNelements.class));
		
	}

}
