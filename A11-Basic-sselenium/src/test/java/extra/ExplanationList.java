package extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExplanationList {
	public static void main(String[] args) {
//		We need to perform upcasting till list from ArrayList
		List<String> students = new ArrayList<>();
		
		students.add("Abhishek");
		students.add("Baburao ganpat aapte");
		students.add("Deepa");
		students.add("Elephant");
		students.add("Elephant"); //Duplicate can be allowed
			
		students.remove(1);
		students.remove("Elephant");
	
		
		
		students.add("Ankit");

//		size() method will return the length of the collection
		for (int i = 0; i < students.size(); i++) {
//			get(index) method -> Proof that list allows ordered elements
			System.out.println(students.get(i));
		}
		
		
	}
}
