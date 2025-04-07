package strings.Examples;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Good Morning!!");
		StringBuilder s2=new StringBuilder("Heyyy!!!");
		 
		//	Append () function	
		System.out.println(s1.append(2024));
		System.out.println(s2.append("How Are You!!"));
		
//		insert()method
		System.out.println(s1.insert(0,"Technolearn" + " "));
		
//		Delete () function
		System.out.println(s2.delete(0,8));
	}

}


//Stringbuffer  and StringBuilder is mutable