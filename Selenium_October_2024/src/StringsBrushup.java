
public class StringsBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sagar Kumar";
		String s1 = "Sagar Kumar";

		// The above initialization of String is called as String literal
		// In the above (String literal), since both the values are having same values, 
		// what java does is, instead of creating a new variable s1
		// java just points the s1 to location of s to use that variable.


		String s2 = new String("Sagar Kumar Chowdhury");
		String s3 = new String("Sagar Kumar Chowdhury");

		// the above shows that String is an object in Java.
		// The above would create two variable explicitly even when the 
		// values for both the string variable are same
		
		String[] splittedStrings3 = s3.split(" ");
		String[] splittedStrings1 = s1.split("Kumar");
		System.out.println(splittedStrings1[0].trim());
		System.out.println(splittedStrings1[0].charAt(2));
		
		// .split(); it splits the string into multiple strings wherever the value provided by user for split
		// .trim() : trims all the spaces in the string.
		// .charAt(): gives the character at the provided index in the string


	}

}
