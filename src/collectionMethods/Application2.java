package collectionMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application2 {

	public static void main(String[] args) {


		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		hashSet.add(10);
	
		//kada zelimo pretvoriti HashSet u ArrayList jer sortiranje Collections metode ne radi za HashSet
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
			
				
		Collections.sort(myList);
		
		System.out.println(myList);
		
		
		HashSet<Employee> empHash = new HashSet<Employee>();
		empHash.add(new Employee("Mike", 3500, "Accounting"));
		empHash.add(new Employee("Paul", 3000, "Admin"));
		empHash.add(new Employee("Peter", 4000, "IT"));
		empHash.add(new Employee("Angel", 2000, "Maintenance"));
		
		//moramo pretvoriti u ArrayList da bismo mogli sortirati
		ArrayList<Employee> empList = new ArrayList<Employee>(empHash);
		
		//da bi sortanje radilo, moramo u Employee klasi implementirati Comparable interface
		
		Collections.sort(empList);
		
		System.out.println(empList);
		

	}

}
