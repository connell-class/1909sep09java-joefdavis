package com.revature.eval.java.core;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;

public class PushWorks {
	//making sure push works
	public static void main(String[] args) {
//		String string="five boxing wizards jump quickly at it";
//		int [] a= {4,5};
		System.out.println(LocalDate.of(2011, Month.APRIL, 25));
//		System.out.println(getGigasecondDate(LocalDate.of(2011, Month.APRIL, 25)));
//		System.out.println(LocalDateTime.of(2009, Month.FEBRUARY, 19, 1, 46, 40));
	
		
	
	}
	
	

	
	
	public static Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		Duration d=Duration.ofSeconds(1000000000);
		Temporal backup=given.plus(d);
//	Temporal rightTime=given.minus((TemporalAmount) backup);
//	Temporal rightTime=given;
		System.out.println("yeah");
	System.out.println(given);
		return backup;
	}

}

