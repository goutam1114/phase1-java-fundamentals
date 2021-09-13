package collectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {
		Map<String, Long>  phoneBook = new HashMap<String, Long>();
		phoneBook.put("Goutam", 7333765L);
		phoneBook.put("Ashish", 7333769L);
		phoneBook.put("Nischi", 7333768L);
		phoneBook.put("Siddu", 7333769L);
		System.out.println(phoneBook);
		System.out.println("Goutam's Number is "+phoneBook.get("Goutam"));
		System.out.println("--------------------------------------------");
		Map<String, Long>  phoneBook1 = new LinkedHashMap<String, Long>();
		phoneBook1.put("Goutam", 7333765L);
		phoneBook1.put("Ashish", 7333769L);
		phoneBook1.put("Nischi", 7333768L);
		phoneBook1.put("Siddu", 7333769L);
		System.out.println(phoneBook1);
		System.out.println("Goutam's Number is "+phoneBook1.get("Goutam"));
		System.out.println("--------------------------------------------");
		TreeMap<String, Long>  phoneBook2 = new TreeMap<String, Long>();
		phoneBook2.put("Goutam", 7333765L);
		phoneBook2.put("Ashish", 7333769L);
		phoneBook2.put("Nischi", 7333768L);
		phoneBook2.put("Siddu", 7333769L);
		System.out.println(phoneBook2);
		System.out.println("Goutam's Number is "+phoneBook2.get("Goutam"));
		
		
		
		
		

		

	}

}
