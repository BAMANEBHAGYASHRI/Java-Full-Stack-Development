package Abstraction;

abstract class digits{
	int num;
	void setvalue(int num) {
		this.num=num;
	}
	
	abstract void getSquare();
    abstract void getCube();
    abstract void getForth();
}
class Square2 extends digits{
	void getSquare() {
		System.out.println("Square of ="+num*num);
	}
	void getCube() {
		
	}
	void getForth() {
		
	}
}
class Cube2 extends digits{
	void getSquare() {
		
	}
	void getCube() {
		System.out.println("cube is= "+num*num*num);
	}
	void getForth() {
		
	}
}
class Forth extends digits{
void getSquare() {
		
	}
	void getCube() {
	
	}
	void getForth() {
		System.out.println("cube is= "+num*num*num*num);
	}
}
public class Digitdata {

	public static void main(String[] args) {
		Square2 s=new Square2();
		s.setvalue(5);
		s.getSquare();
		
		Cube2 c= new Cube2();
		c.setvalue(6);
		c.getCube();
		
		Forth f=new Forth();
		f.setvalue(7);
		f.getForth();
	}

}
