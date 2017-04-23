package com.atmecs;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class Hello {
	public int countWords(String words) {
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
	
	public static void main(String... s) {
		List<String> greeting = new ArrayList<>();
		greeting.add("Akhil");
		greeting.add("Milan");
		greeting.add("Akshay");
		greeting.add("Piyush");
		greeting.add("Hitesh");
		greeting.add("Prakash");
		
		for(String name:greeting)
			System.out.println("Hello "+name);
		
		Hello hello = new Hello();
		
		System.out.println("Word Count : "+hello.countWords("I have four words"));
	}
}