import java.util.*;
public class Split {



	 

	 public static void main(String[] args) {

	// Your task Part 0

	//String.split();

	//It's a method that acts on a string, <StringName>.split(<String sp>);

	//Where sp is the string where the string splits

	//And it returns an array

	// Example: "I like apples!".split(" ");
		 //String [] array0= "I like apples".split(" ");
		 System.out.println(Arrays.toString("I like apples".split(" ")));

	// it will split at spaces and return an array of ["I","like","apples!"]

	// Example 2: "I really like really red apples"split("really")

	// it will split at the word "really" and return an array of ["I "," like ","red apples!"]
		 System.out.println(Arrays.toString( "I really like really red apples".split("really")));

	//play around with String.split!

	//What happens if you "I reallyreally likeapples".split("really") ?
		 System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
		 System.out.println(sandwich1("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
		 System.out.println(sandwich2("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));
	 }

	//Your task Part 1:

	/*Write a method that take in a string like

	* "applespineapplesbreadlettustomatobaconmayohambreadcheese"

	* describing a sandwich.

	* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

	* the sandwich and ignores what's on the outside

	* What if it's a fancy sandwich with multiple pieces of bread?
	  

	*/
		 public static String sandwich1(String input ) {
			 int a = input.indexOf("bread");
			 String second = input.substring(a+5);
			 int b = second.indexOf("bread");
			 String[] s = second.split("bread");
			 String output = Arrays.toString(s);
			 return output.substring(1,b);
			 
				 
				 
			 }
			 
		 
	
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 //Your task pt 2:

	/*Write a method that take in a string like

	* "apples pineapples bread lettus tomato bacon mayo ham bread cheese"

	* describing a sandwich

	* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

	* the sandwich and ignores what's on the outside.

	* Again, what if it's a fancy sandwich with multiple pieces of bread?

	*/

	 
public static String sandwich2(String input ) {
	 int a = input.indexOf("bread");
	 String second = input.substring(a+5);
	 int b = second.indexOf("bread");
	 String middle = second.substring(1, b);
	 String[] s = middle.split(" ");
	 String output = Arrays.toString(s);
	 return output;
}
}







