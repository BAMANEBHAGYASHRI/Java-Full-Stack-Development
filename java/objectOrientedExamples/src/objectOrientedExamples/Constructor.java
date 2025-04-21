package objectOrientedExamples;
class sample{
	int i;
	int j;
	sample( int i , int j){
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println(i +j);
	}
}
public class Constructor {

	public static void main(String[] args) {
		sample s=new sample(10,20);
		s.display();

	}

}
