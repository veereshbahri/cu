
public class Seventeen {

	public static void main(String[] args) {
		char a='B';
		int c=a;
		if(c>=65 && c<=90 || c>=97 && c<=122)
		{
			char b=Character.toLowerCase(a);
			if(b=='a' || b=='e'|| b=='i' || b=='o' || b=='u')
			{
				System.out.println("VOWEL");
			}
			else
				System.out.println("CONSONANT");
		}
	}
}
