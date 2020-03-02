package example;

public class test1 { 
	int x;

 public static void add3 (Integer i) {
int val = i.intValue ( );
val += 3; 
 i = new Integer (val); 
 } 
 public void set()
 {
	 x=5;
 }

public void dis()
{
	System.out.println(x);
}
public void calc(int a)
{
	int sum=a+x;
	System.out.println(sum);
}
 }