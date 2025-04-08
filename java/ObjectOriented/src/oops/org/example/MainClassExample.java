package oops.org.example;
class AddData{
	int a,b;
	void setValue(int a ,int b) {
		this.a=a;
		this.b=b;
	}
	void getAddition() {
		int c=a+b;
		System.out.println("Addition" + c);
	}
	int  getsubstraction() {
		int c=a-b;
		return c;
//		System.out.println("Substraction" + c);
	}
}
public class MainClassExample {

	public static void main(String[] args) {
		AddData ad=new AddData();
		ad.setValue(20,5);
		ad.getAddition();
		System.out.print(ad.getsubstraction());

	}

}