class operator{
	public static void main(String args[])
	{
		int a=20;
		int b=40;
		a=b;
		System.out.println( "B value assign to A" + a + " " + b);
		if(a == b){
			System.out.println("A and B are Equall");
			System.out.println(a + " " + b);
		}
		
		/*else{
			System.out.println("Not Equal");
			System.out.println(a + " " + b);
		}*/
	}
}