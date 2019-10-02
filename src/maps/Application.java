package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		
		
		//TreeMap sortira KEY unose prema poretku, ako su rijeci onda alfabetski, ako su brojevi, onda od manjeg prema vecem itd
		
		//ako kod HashMap ili LinkedHashMap ili TreeMap upisemo isti key sa drukcijim opisom, sustav ce samo upisati drukciji opis za prvotno uneseni key
		//npr ako ponovo unesemo dictionary.put("Brave", "VERY BRAVE"); sustav ce prvu definiciju zamijeniti ovom svjezom, ali nece kreirati jos jedan "Brave"
		//ako zelimo da se unese i ta vrijednost kao novi unos, moramo kroz desni klik->source->generirati hashcode i equals 
		
		
		//Linked je prefiks ako zelimo da bude ispisano u poretku u kojem smo unosili podatke
		LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
		
		dictionary.put("Brave", "Ready to face and endure danger or pain; showing couage");
		dictionary.put("Brilliant", "Exceptionally clever or talented");
		dictionary.put("Joy", "Feeling of great pleasure and hapiness");
		dictionary.put("Confidence", "The state of feeling certain about the truth of something");
		
		
		//kod HashMap ne upisujemo u for loop samo dictionary kao kod LinkedList ili Hashset, nego upisujemo dictionary.keySet())
		
		for(String word : dictionary.keySet()) {
			
			//ako zelimo ispisati Key, u ovom slucaju Brave, Brilliant, Joy i Confidence
			//System.out.println(word);
			
			//ako zelimo ispisati vrijednosti, u ovom slucaju opise(recenice) rijeci Brave, Brilliant, Joy i Confidence
			//System.out.println(dictionary.get(word));
		}
		
		for(String values : dictionary.values()) {
			//System.out.println(values);
		}
		
		
		//ako zelimo ispisati i kljuceve i vrijednosti, u ovom slucaju i rijeci i njihove opise, entry je samo rijec koju random odaberemo, kao word gore u prethodnoj metodi
		for(Map.Entry<String, String> entry: dictionary.entrySet()) {
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			
			//skraceno je System.out.println(entry);
			
		}

	}

}
