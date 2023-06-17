package javaInterfacesAndCollections_EmailValidation;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailIDValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee(1001,"A","a@sl.com");
		Employee e2=new Employee(1002,"B","b@sl.com");
		Employee e3=new Employee(1003,"C","c@sl.com");
		Employee e4=new Employee(1004,"D","d@sl.com");
		Employee e5=new Employee(1005,"E","e@sl.com");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your email ID");
		String emailID=sc.next();
		int check=0;
		for(Employee e:list) {
			if(check(e.emailID,emailID)){
				System.out.println("Your Employee ID and Name is "+e.id+" and "+e.name);
				check=1;
				break;
			}
		}
		if(check==0) {
			System.out.println("This email ID seems incorrect, please enter correct email ID");
		}		

	}
	
	public static boolean check(String a, String b) {
		if(a.equalsIgnoreCase(b)) {
			return true;
		}else {
			return false;
		}
	}
	
}


class Employee{
	int id;
	String name, emailID;
	public Employee(int id, String name, String emailID) {		
		this.id = id;
		this.name = name;
		this.emailID = emailID;
	}	
}