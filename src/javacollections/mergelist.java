package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class mergelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> employee=new ArrayList<String>();
employee.add("Jai");
employee.add("Sai");
employee.add("Jeya");
ArrayList<String> employer= new ArrayList<String>();
employer.add("Sekar");
employer.add("Chandra");
employer.add("Vignesh");
employee.addAll(employer);
//Iterator itr= employee.iterator();
//while(itr.hasNext()) {
//	System.out.println(itr.next());
//for (String obj:employee)
//	System.out.println(obj);
Iterator itr=employee.iterator();
while (itr.hasNext());
System.out.println(itr.next());
}
	}


