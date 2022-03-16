package String;


import java.util.Scanner;

public class String1 {
	public static void main(String args[])
	   {
	      String s, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      s = sc.nextLine();
	 
	      int length = s.length();
	      System.out.println("String length :"+s.length());
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + s.charAt(i);
	 
	      if (s.equals(rev))
	         System.out.println(s+" is a palindrome");
	      else
	         System.out.println(s+" is not a palindrome");
	 
	   }
}
