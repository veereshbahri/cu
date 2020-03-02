package Comp;

public class Computer {
	private int ram;
	private int space;
	private String os;
	
	public Computer()
	{
		this(2,2,"win");
	}
	public Computer(int ram,int space)
	{
		
	}

	public Computer(int ram,String os)
	{
		
	}
	public Computer(String os, int space)
	{
		
	}
	public Computer(int ram,int space, String os)
	{
		this.os=os;
		this.ram=ram;
		this.space=space;
	}
}
