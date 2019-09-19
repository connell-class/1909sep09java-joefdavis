package com.revature.eval.java.core;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;

public class PushWorks {
	//making sure push works
	public static void main(String[] args) {
		String string="five boxing wizards jump quickly at it";
		int [] a= {4,5};
		System.out.println(getGigasecondDate(LocalDateTime.of(2043, Month.JANUARY, 1, 1, 46, 40)));
		
	
		
	
	}
	
	

	
	
	public static Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		Duration d=Duration.ofSeconds(1000000000);
	Temporal backup=given.minus(d);
//	Temporal rightTime=given.minus((TemporalAmount) backup);
	Temporal rightTime=given;
	System.out.println(rightTime);
		return backup;
	}

}

