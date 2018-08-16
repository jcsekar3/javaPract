package javacollections;

// 
import java.util.ArrayList;
import java.util.Iterator;

public class Duplicate {
public static void main(String[]args) {
	ArrayList employee=new ArrayList<String>();
	employee.add("Jai");
	employee.add("Jeya");
	employee.add("shree");
	
	ArrayList employee1=new ArrayList <String>();
	employee1.add("Jai");
	employee1.add("Jeya");
	employee1.add("Sekar");
	employee.retainAll(employee1);
	System.out.println(" Duplicate entry: ");
	Iterator itr= employee.iterator();
	while(itr.hasNext()) {
		System.out.println( itr.next());
			
	}
	
	}
}

