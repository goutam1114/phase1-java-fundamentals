package collectionDemo;
import java.util.*;

public class ListDemo1 {

	public static void main(String[] args) {
       List<String> l1=new ArrayList<String>();
      l1.add("Goutam");
      l1.add("Niru");
      l1.add("Praveen");
      l1.add("Dyanu");
      for(int i=0;i<l1.size();i++)
      {
    	  System.out.println(l1.get(i));
      }
      System.out.println("----------------------------------");
      for(String u:l1)
      {
    	  System.out.println(u);
      }
      System.out.println("----------------------------------");
      Iterator<String> itr=l1.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
    	  
      }
      
      
      
	
	

	}

}
