package Mypack;
abstract class demo{
	 abstract void xx();
	void yy() {
		System.out.println("abcd");
	}
}
class demos extends demo{
	void xx() {
		System.out.println("efgh");
	}
	void zz() {
		System.out.println("ijkl");
	}
}
public class AbsctractClass {

	public static void main(String[] args) {
		demo d= new demos();
		d.xx();
		d.yy();
		demos ds=new demos();
		ds.zz();

	}

}
