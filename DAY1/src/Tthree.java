
public class Tthree {
	public static void main(String[] args) {
		int n=1234,n1,sum=0;
		
		while(n>0)
		{
			n1=n%10;
			sum=sum*10+n1;
			n=n/10;
		}
		System.out.println(sum);
		
		
	}

}
