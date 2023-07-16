package TM;

public class Palindrome {
public static void main(String[] args) {
String 	str = "aa";
	String rev="";
		char[] charArray= str.toCharArray();
		for (int i =charArray.length-1; 0<=i;i--) {
			rev= rev+ charArray[i];
		
		}
		if(str.equalsIgnoreCase(rev))
			System.out.println("yes");
		else
			System.out.println("no");
	
			}
}