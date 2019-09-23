package com.revature.eval.java.core;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class PushWorks {
	//making sure push works
	public static void main(String[] args) {
		
		String a="gvhgr mt123 gvhgr mt";
		System.out.println(encode(a));
	
	}
	
	

	
	
	public static String encode(String string) {
		// TODO Write an implementation for this method declaration
		char place;
		String s = "";
		int difference;
		for (int i = 0; i < string.length(); i++) {
			place = string.charAt(i);

			if (Character.isLetter(place)) {
				if (place >= 'a' && place <= 'z') {
					difference = place - 97;
					place = ((char) (122 - difference));
					s += place;

				} else {
					difference = place - 65;
					place = ((char) (90 - difference));
					s += place;
				}

			} else {
				s += place;
			}

		}

		return s;
	}


}

