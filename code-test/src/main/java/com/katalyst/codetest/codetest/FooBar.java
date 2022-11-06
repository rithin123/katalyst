package com.katalyst.codetest.codetest;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.stereotype.Component;

@Component
public class FooBar {
	
	private Consumer<Integer> consume = a->{
		if(a%15==0)
			 System.out.println("Foo Bar");
		else if(a%3== 0)
              System.out.println("Foo");
		else if(a%5== 0)
			 System.out.println("Bar");
		else
			System.out.println(a);
	};
	
	
	public void numberPrinting(Optional<List<Integer>> number)
	{	   
		 number.orElseThrow(()->new NullPointerException("List cannot be null")).stream().filter(Objects::nonNull).filter(a->a!=0).forEach(consume);	 
	}

}
