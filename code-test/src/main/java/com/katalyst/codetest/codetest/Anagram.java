package com.katalyst.codetest.codetest;

import java.util.Optional;
import java.util.function.BiFunction;

import org.springframework.stereotype.Component;

@Component
public class Anagram {
	
	
	
	private BiFunction<Optional<String>,Optional<String>,Boolean> anagram = (str1,str2)->
	{  
		if(str1.isPresent()==false || str2.isPresent()==false || str1.get().isEmpty() || str2.get().isEmpty())
			         return false;
		
		String str1Copy=str1.get();
		String str2Copy=str2.get();
		int str1Len=str1.get().length();
		int str2Len=str2.get().length();
		
		if(str1Len!=str2Len)
			return false;
		
		int[] count =new int[128];
		
		for(int i=0;i<str1Len;i++)
		{
			count[str1Copy.charAt(i)]++;
		}
		
		for(int i=0;i<str2Len;i++)
		{
			count[str2Copy.charAt(i)]--;
			
			if(count[str2Copy.charAt(i)]<0)
				return false;
		}
		
		return true;
	};
	
	
	
	public boolean testAnagram(Optional<String> str1, Optional<String>  str2)
	{
		return anagram.apply(str1, str2);
		
	}

}
