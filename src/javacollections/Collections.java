package javacollections;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> employee=new ArrayList<String>();
employee.add("Ravi");
employee.add("Vijay");
employee.add("Jay");
employee.add("Dinesh");
employee.add("Ajay");
employee.add(3,"Jayashree");

for(String obj:employee)
System.out.println(obj);

	


	}
}
