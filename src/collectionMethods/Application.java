package collectionMethods;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		newList.add(10);
		newList.add(12);
		
		//metoda za merganje vrijednosti obiju lista, dakle iz newList mergam u list1
		list1.addAll(newList);
		System.out.println(list1);
		
		//metoda za brisanje svih vrijednosti iz list1, a koje se nalaze u newList(u ovom slucaju Integer 10 i 12)
		
		list1.removeAll(newList);
		System.out.println(list1);

		//ako zelimo provjeriti ima li u listi neki odredeni broj
		boolean hasValue = list1.contains(67);
		System.out.println(hasValue);
		
		//metoda za brisanje svih vrijednosti u list1, a koje NISU u newList
		//list1.retainAll(newList);
		//System.out.println(list1);
		
		//System.out.println(newList);
		//i dalje su sve prvotne vrijednosti ostale u newList
		
	}

}
