package max;

 public class DemoOverloading   {

	public static void main(String[] args) {
		Overloading ob = new Overloading();
		System.out.println("The value of and b is :");
		System.out.println( ob.meth1(12, 13));
		System.out.println("The value of a ,b,c is:");
		System.out.println(ob.meth1(12, 13, 14));
		
	}

}
