package strings.Examples;

public class stringInBuiltFunction {

	public static void main(String[] args) {
		
		//length function
		String s1=new String("Good morning Everyone!!");
		String s2=new String("GOOD MORNING!!");
		String s3=new String("good");
		String s4=new String("Morning");
		System.out.println("Length of Srting" + "  " + s1.length());
		
		//charAt()Function
		System.out.println("Fetch Single Charachter" + s1.charAt(5));
		//Print the  All string using For loop
		for (int i=0 ; i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		//toUpperCase() method
		System.out.println( "String in Upper Case--" + s1.toUpperCase());
		
		//toLowerCase()function
		System.out.println("String in lower case-- "+s2.toLowerCase());
		
		//Concat String
		System.out.println("Concat the String--" + s3.concat(s4));
		 String con=s3.concat(s4);
		 System.out.println("Concatination----"+ con);
		 
		 //Trim()method
		 System.out.println("trimh -------" +s1.trim());
		 
		 
		 //SubString()
		 System.out.println(s1.substring(5,15));
//		 System.out.println(s1.substring(0));
//		 System.out.println(s1.substring(5));
//		 System.out.println(s1.substring(12));

		 
		 //endsWith()method
		 System.out.println(s1.endsWith("one")); 
		 
		 
		 //CompareTo() FUnction
		 System.out.println( "comparing ---" + s3.compareTo(s4));		

	}	
		
}
