package game;

public class White implements Player {


	static int power;
	static int damagePower;
	
	public static int getDamagePower() {
		return damagePower;
	}
	public static void setDamagePower(int damagePower) {
		White.damagePower = damagePower;
	}
	public static void setPower(int power) {
		White.power = power;
	}
	public static int getPower() {
		return power;
	}

	@Override
	public int getHit(int a) {
		if(power>minp)
			{power=power-a;
			if(power<=0)
				power=0;}
		return power;
	}

	@Override
	public int eatPower(int amount) {
		if(power<maxp)
		{
			power+=amount;
			if(power>=100)
			{
				power=100;
			}
		}
		return power;
	}

	@Override
	public void run() {
		System.out.println("Black running");
		
	}
	@Override
	public void damage() {
		Black.power-=damagePower;
		if(White.power<minp)
		{
			Black.power=0;
		}
		
		
	}


	
}
