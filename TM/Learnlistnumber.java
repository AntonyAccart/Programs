package week6day3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Learnlistnumber {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		System.out.println(num);
		int size = num.size();

		System.out.println(size);
		
		Collections.sort(num);
		System.out.println(num);

		Collections.reverse(num);
		System.out.println(num);
		
		
		
}
}