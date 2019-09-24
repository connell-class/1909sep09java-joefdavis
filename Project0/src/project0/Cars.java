package project0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

abstract class Cars {
	TreeSet <String> offer= new TreeSet<String>();
	private String color;
	private String engine;
	private String wheeltype;
	private int tintLevel;
	private double mpg;
	private boolean used;
	private double price;
	private int year;
	public Cars(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used, double price,
			int year) {
		super();
		this.color = color;
		this.engine = engine;
		this.wheeltype = wheeltype;
		this.tintLevel = tintLevel;
		this.mpg = mpg;
		this.used = used;
		this.price = price;
		this.year = year;
		Scanner scan= new Scanner(System.in);
		if(year<1900 || year>2020) {
			while(year<1900 || year>2020) {
				System.out.println("put in an acceptable year for vehicle");
				this.year=scan.nextInt();
			}
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getWheeltype() {
		return wheeltype;
	}
	public void setWheeltype(String wheeltype) {
		this.wheeltype = wheeltype;
	}
	public int getTintLevel() {
		return tintLevel;
	}
	public void setTintLevel(int tintLevel) {
		this.tintLevel = tintLevel;
	}
	public double getMpg() {
		return mpg;
	}
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Cars [color=" + color + ", engine=" + engine + ", wheeltype=" + wheeltype + ", tintLevel=" + tintLevel
				+ ", mpg=" + mpg + ", used=" + used + ", price=" + price + ", year=" + year + "]";
	}
	
	public void Offers() {
		
		 Iterator<String> i = offer.iterator();
//			System.out.println(junk.toString());
			 while (i.hasNext()) {
				
		            System.out.println("$ " + i.next());
		            
		    } 
	}
	
	

}
