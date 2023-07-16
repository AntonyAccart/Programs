package week6day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
//	Set<String> name = new HashSet<String>();
//	[hari, yashwant, reyol, antony, vishu]
	
	//Set<String> name = new TreeSet<String>();
//	[antony, hari, reyol, vishu, yashwant]
	Set<String> name = new LinkedHashSet<String>();
	//[antony, vishu, yashwant, hari, reyol]
	
	
	boolean add=name.add("antony");
	System.out.println(add);
	name.add("vishu");
	name.add("yashwant");
	name.add("hari");
	name.add("reyol");
	boolean add2=name.add("antony");
	System.out.println(add2);
	System.out.println(name);
	for (String localvariablenames : name) {
		System.out.println(localvariablenames);
		
	}
}
}
