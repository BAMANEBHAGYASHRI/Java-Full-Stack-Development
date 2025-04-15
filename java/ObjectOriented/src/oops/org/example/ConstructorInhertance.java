package oops.org.example;
class basicdata{
	basicdata(){
		System.out.println("This is parent class constructor");
	}
}
class  demobasic extends basicdata{
	demobasic(){
		System.out.println("This is child class constructor");
	}
}
public class ConstructorInhertance {

	public static void main(String[] args) {
		demobasic db=new demobasic();
	}

}
