package day5;

public class Age {
	public static void main(String[] args) {
		
	
	int a=10;
	
	{try {
		if(a<18)
			throw new NoSuchMethodException("not possible");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}}