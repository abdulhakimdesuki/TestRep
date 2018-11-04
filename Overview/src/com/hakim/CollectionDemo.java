package com.hakim;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Integer> values =new ArrayList<>();
		values.add(0,4);
		values.add(1,6);
		values.add(2,7);
		values.add(3, 2);
		// values.add(4, "djfdkj");
		Collections.sort(values);
		Collections.reverse(values);
		
		for (Integer obj : values)
			System.out.println(obj);

		
//		for(int i=0 ; i < values.size();i++)
//			System.out.println(values.get(i));

//		Collection values =new ArrayList();
//		values.add(5);
//		values.add(6);
//		values.add(7);
//		
//		Iterator it=values.iterator();
//		
//		while(it.hasNext())
//		System.out.println(it.next());
		}

}
