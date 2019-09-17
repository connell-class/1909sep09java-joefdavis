package com.revature.eval.java.core;

public class PushWorks {
	//making sure push works
	public static void main(String[] args) {
		String string="gvhg";
		System.out.println(encode(string));
		
	
		
	
	}
	
	

	public static String encode(String string) {
		// TODO Write an implementation for this method declaration
		char place;
		String s="";
		int difference;
		for(int i=0;i<string.length();i++) {
			place=string.charAt(i);
			
			if(Character.isLetter(place)) {
				if(place>='a' && place<='z') {
					difference=place-97;
					place=((char)(122-difference));
					s+=place;
					
				}
				else {
					difference=place-65;
					place=((char)(90-difference));
					s+=place;
				}
				
			}
			else {
				s+=place;
			}
			
		}
		
		return s;
	}
}

