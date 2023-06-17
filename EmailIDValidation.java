package javaInterfacesAndCollections_EmailValidation;

import java.util.ArrayList;

public class EmailIDValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee(1001,"A","a@sl.com");
		Employee e2=new Employee(1001,"B","b@sl.com");
		Employee e3=new Employee(1001,"C","c@sl.com");
		Employee e4=new Employee(1001,"D","d@sl.com");
		Employee e5=new Employee(1001,"E","e@sl.com");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		for(Employee e:list) {
			System.out.println(e.id+" "+e.name+" "+e.emailID);
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