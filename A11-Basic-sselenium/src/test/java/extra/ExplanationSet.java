package extra;

import java.util.HashSet;
import java.util.Set;

public class ExplanationSet {
	public static void main(String[] args) {
		Set<String> animal = new HashSet<>();
		animal.add("Rhino");
		animal.add("Polar bear");
		animal.add("Gadha");
		animal.add("Gadha"); //Duplicate won't be allowed
		animal.add("Pig");
		
		animal.remove("Pig");
		
//		Because we do not have ordered set 
//		we need to use foreach loop
		
		for(String i : animal) {
			System.out.println(i);
		}
		
		System.out.println(animal.size());
		
	}
}
