package week2assignement;

public class PrintEachChar {


	public static void main(String[] args){
		//Declare a String
		String text ="antonyaccart";
		//[t,e,s,t,l,e,a,f]
		//Convert String into character Array
		char[] characters= text.toCharArray();
		//using for loop Iterate the values from 0 to Array length
		for(int i=0;i<characters.length;i++){
			
			System.out.println(characters[i]);

		}
	}
}

//
//String[] split = text.split("\\s+");
//int length = split.length;
//		//print the length
//System.out.println(length);