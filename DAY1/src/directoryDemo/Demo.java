package directoryDemo;

import java.io.File;

public class Demo {
	public void display(String s)
	{
		File f=new File(s);
		
		
	}
	public static void main(String[] args) {
		
	
	File file=new File("C:\\Day2");
	System.out.println(file.getPath());
	String ab[]=file.list();
	for(String i:ab)
	{
		File f=new File(file.getAbsolutePath()+"\\"+i);
		File f1;
		//while(f.isDirectory())
		//{
		//	System.out.println("     directory is" +f.getName());
		//	f=new File(file.getAbsolutePath()+"\\"+i);
			//continue;
		//}
		if(!f.isFile())
		{
			System.out.println("file"+f.getName());
		}
	}

	}
}
