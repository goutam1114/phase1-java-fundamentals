package collectionDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {

	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("HELLO");
		set1.add("GOUTAM");
		set1.add("Sannidhi");
		for(String s:set1)
		{
			System.out.println(s);
		}
		boolean k=set1.isEmpty();
		System.out.println(k);
		Iterator<String> itr=set1.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	    	  
	      }
	      
	      
	      
	   
		


	}

}
