package game;

public class Data {
	public static void main(String[] args) {
		Black b1=new Black();
		White w1=new White();
		Black.setDamagePower(5);
		Black.setPower(50);
		White.setDamagePower(10);
		White.setPower(60);
		int a=White.getPower();
		b1.damage();
		int b=White.getPower();
		System.out.println("value before"+a);
		System.out.println("afeter"+b);
		
	}

}
