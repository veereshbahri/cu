
public class Swap {
	public static void main(String[] args) {
		int a=100;
		int b=5;
		b=b^a;
		a=a^b;
		b=a^b;
		System.out.println(a + " " + b);
	}

}
