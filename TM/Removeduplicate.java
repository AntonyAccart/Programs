package week6day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicate {
public static void main(String[] args) {
	
	int[] num = {1,2,3,4,5,6,6,2,4};
	
	Set<Integer> number = new LinkedHashSet<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		if(!number.add(num[i])) {
			System.out.println(num[i]);
		}
	}
	//System.out.println(number);
	for(Integer integer : number) {
		System.out.println(integer);
	}
	
	List<Integer> val = new ArrayList<Integer>(number);
	
	Integer min = Collections.min(val);
	System.out.println("min " + min);
	
	Integer max = Collections.max(val);
	System.out.println("max " + max);
}
}