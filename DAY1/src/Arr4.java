
public class Arr4 {
	public static void main(String[] args) {
		int a[]= {3,2,6,8},temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(a[j]>a[i])
				{temp=a[i];
				a[i]=a[j];
				a[j]=temp;}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
