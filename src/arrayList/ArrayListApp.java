package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListApp {

	public static void main(String[] args) {

		//resizeable list, default starting size is 10 slots
		//faster than LinkedList when it's to retrieve data, while LL is better at manipulating data
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("There");	
		words.add("10");
	
		String item1 = words.get(2);
		
		
		System.out.println(item1);
		//za ispisati sve sto je u arraylisti po defaultu
		System.out.println(words);
		//za vertikalno ispisivanje svega sto je u arraylisti
		for(String str : words) {
			System.out.println(str);
		}

		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1000);
	
		System.out.println("-----------------------------");
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}

}
