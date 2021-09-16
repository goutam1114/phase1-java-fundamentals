package collectionDemo;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDem2 {

	public static void main(String[] args) {
		List<Integer> l2= new LinkedList<Integer>();
		l2.add(5);
		l2.add(6);
		l2.add(7);
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i));
		}
		l2.add(2, 5);
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i));
		}
		l2.remove(2);
		System.out.println("----------------------------------");
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i));
		}
		for(int j:l2)
		{
			System.out.println(j);
		}
		Iterator<Integer> it=l2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	

}
