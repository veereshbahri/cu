
public class Arr5 {

	static int fact(int n)
	{
		if(n>1)
			return fact(n-1)*n;
		else
			return 1;
	}
	public static void main(String[] args) {
		int a=fact(5);
		System.out.println(a);
		
	}
}
