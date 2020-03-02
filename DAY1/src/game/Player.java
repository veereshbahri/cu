package game;

public interface Player {
	int minp=0;
	int maxp=0;
	int getHit(int a);
	int eatPower(int amount);
	void run();
	void damage();

}
