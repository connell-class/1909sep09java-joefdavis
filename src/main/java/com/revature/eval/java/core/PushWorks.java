package com.revature.eval.java.core;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PushWorks {
	//making sure push works
	public static void main(String[] args) {
		
		String a="school";
//		List<Long> primes= new ArrayList<Long>();
//		Map<String, Integer> map = new HashMap<>();
//		map=wordCount("one,\\ntwo,\\nthree");
//		System.out.println(solveWordProblem("What is 1 plus 1"));
//		System.out.println(getGigasecondDate(LocalDateTime.of(2015, Month.JANUARY, 24, 23, 59, 59)));
//		
//		System.out.println(acronym(a));
		int [] arr= {1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 634};
		int n=144;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("found you at "+ i);
			}
		}
		
	}
	
	

	
	
}

