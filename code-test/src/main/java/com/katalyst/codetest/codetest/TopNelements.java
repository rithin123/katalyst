package com.katalyst.codetest.codetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class TopNelements {
	
	
	public List<Integer> sort(Optional<List<Integer>> optList,int k)
	{ 
		return   optList.orElseGet(ArrayList::new).stream().filter(Objects::nonNull).sorted(Collections.reverseOrder()).limit(k).collect(Collectors.toList());
	}

}
