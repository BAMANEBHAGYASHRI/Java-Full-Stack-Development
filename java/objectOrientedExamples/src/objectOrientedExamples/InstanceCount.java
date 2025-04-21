package objectOrientedExamples;
class instacecounter{
	static int count=0;
	
	instacecounter(){
		count++;
	}
	static int getinstancecount() {
		return count;
	}
}
public class InstanceCount {

	public static void main(String[] args) {
		 instacecounter o1=new  instacecounter();
		 instacecounter o2=new  instacecounter();
		 instacecounter o3=new  instacecounter();
		 instacecounter o4=new  instacecounter();
		 
		 System.out.println("Total Instance created="+ instacecounter.getinstancecount());

	}

}
