package javacollections;

import java.util.ArrayList;
import java.util.List;

class car {
	int year;
String model,color;
public car(String model, String color, int year) {
	// TODO Auto-generated constructor stub

	this.model = model;
	this.color = color;
	this.year = year;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<car> list=new ArrayList<car>();
		car a1=new car("Audi" ,"Blue" ,2012 );
		car a2=new car("Benz" ,"White" ,2017 );
		car a3=new car("Honda" ,"Silver" ,2000 );
		list.add(a1);
		list.add(a2);
		list.add(a3);
		for(car a:list) {
			System.out.println("Car type "+a.model + "model color "+ a.color + a.year);
		}
	

}
}