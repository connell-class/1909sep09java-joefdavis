package project0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MainMenuDriver {
	static HashSet<Person> person=new HashSet<Person>();
	static HashSet<Cars> cars= new HashSet<Cars>();
	static ArrayList<String> loginInfo=new ArrayList<String>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to Joe's Cheap bummy Cars");
		
		
	    Scanner scan=new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1: create new User");
		System.out.println("2: Login");
		int choice=scan.nextInt();
		if(choice==1) {
			person=addPerson(person);
		}
		//Currently testing if I can correctly adda person
		
		
		System.out.println(person.toString());
		
	}
	//add people 
	public static HashSet addPerson(HashSet<Person> p) {
	    Scanner scan=new Scanner(System.in);

		System.out.println("Are you creating a new account as Employee or Customer?");
		System.out.println("1: Employee");
		System.out.println("2: Customer");
		int eoC=0;
		eoC=scan.nextInt();
		
		//program terminates here.....WHY??????
		//lol had an extra curly brace
		//gotta use logic joe
//		System.out.println("why lawd");
		
		if(eoC!=1 && eoC!=2) {
			while(eoC!=1 && eoC!=2) {
				System.out.println("enter a correct response");
				System.out.println("Are you creating a new account as Employee or Customer?");
				System.out.println("1: Employee");
				System.out.println("2: Customer");
				eoC=scan.nextInt();
			}
		}
//			System.out.println(eoC);
			String name;
			String dob;
			String username;
			String password;
			String eID;
			String email;
			System.out.println("Enter Your Name");
			scan.nextLine();
			name=scan.nextLine();
			System.out.println(name);
			System.out.println("Enter your date of birth in 11/11/1111 format");
			dob=scan.nextLine();
			
			if(dob.length()!=10) {
				while(dob.length()!=10) {
					System.out.println("fix format");
					dob=scan.nextLine();
				}
			if(dob.substring(2, 3)!="/" && dob.substring(5, 6)!="/" ) {
				while(dob.substring(2, 3)!="/" && dob.substring(5, 6)!="/" && dob.length()!=10) {
					System.out.println("please enter a correct dob format");
					dob=scan.nextLine();
				}
			}
			}
			System.out.println("Create a Username");
			username=scan.nextLine();
			System.out.println("Create a Password");
			password=scan.nextLine();
			
			if(eoC==1) {
				System.out.println("Enter your Employee ID");
				eID=scan.nextLine();
				p.add(new Employee(name,dob,username,password,eID));
				EmployeeMenu();
			}
			else {
				System.out.println("Enter your ID");
				email=scan.nextLine();
				p.add(new Customer(name,dob,username,password,email));
				CustomerMenu();
			}
		return p;
	}
	//add cars
	public static HashSet addCars(HashSet c) {
		 Scanner scan=new Scanner(System.in);
		return c;
	}
	//add login 
	public static HashSet addLogin(HashSet l) {
		 Scanner scan=new Scanner(System.in);
		return l;
	}
	//Employee Menu
	public static void EmployeeMenu() {
		//starting menu
		System.out.println("Hey Employee, what are we doing today");
	}
	//Customer Menu
	public static void CustomerMenu() {
		//starting menu
		System.out.println("Hey Customer, what are we doing today");
	}
	
	
}
