
public class Calc {

	public static void main(String[] args) {
		char ch='+';
		int a=5,b=7,c = 0;
		switch(ch)
		{
		case '+':
			c=a+b;
			break;
		case '-':
			c=a-b;
			break;
		case '*':
			c=a*b;
			break;
		case '/':
			c=a/b;
			break;
		default:
			System.out.println("WRONG");
			
		}
		System.out.println(c);
	}
}
