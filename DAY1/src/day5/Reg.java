package day5;

public class Reg {
	public static void main(String[] args) {
		String ch="[0-9]{3}[-][0-9]{2}[-][0-9]{4}";
		String email="[0-9a-zA-Z]+[@][a-zA-Z]+[.](com)";
		System.out.println("vrb-123@gmail.com".matches(email));
	}

}
