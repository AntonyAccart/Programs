package week6day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		//List<String> name = new LinkedList<String>();
		name.add("antony");
		name.add("vishu");
		name.add("yashwant");
		name.add("hari");
		name.add("reyol");
		System.out.println(name);
		
		//name.remove(2);
		 // name.remove("hari");
		System.out.println(name);
		int size = name.size();

		System.out.println(size);
		
		//we wont use name.add(2,"hr");
		Collections.sort(name); 
		System.out.println(name);

		Collections.reverse(name);
		System.out.println(name);
		
		for(int i=0; i< name.size(); i++)
		{
			String string= name.get(i);
			System.out.println(string);
		}
		name.clear();
		System.out.println(name);
		boolean empty=name.isEmpty();
		System.out.println(empty);
		}
	}

