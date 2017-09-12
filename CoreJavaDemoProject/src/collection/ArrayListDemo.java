package collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(30);
		
		
		System.out.println(al.get(1));
		System.out.println("================================================");
		for (int i = 0; i < al.size(); i++) {
			
			System.out.println(al.get(i));
			
		}
		System.out.println("================================================");
		for (Object object : al) {
			System.out.println(object);
		}
		
		System.out.println("================================================");
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println(al.contains(new Integer(10)));
		
		System.out.println("================================================");
		al.clear();
		
		System.out.println(al.size());

	}

}
