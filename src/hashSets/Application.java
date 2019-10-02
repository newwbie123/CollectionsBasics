package hashSets;

import java.util.HashSet;

public class Application {

	public static void main(String[] args) {

		//is used to prevent duplicates, repeated values (Strings, Integers), but for objects with different hashcode it doesnt work->need to uncomment hashcode method
		//LinkedHashSet maintains insertion order
		
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 24);

		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		//u animal klasi smo dodali equals metodu da stvarno usporedi 2 duplica i "prepozna" ih kao duplice
		System.out.println(animal1.equals(animal4));
		
		
		
		for(Animal value : animals) {
			System.out.println(value);
		}
		

	}

}
