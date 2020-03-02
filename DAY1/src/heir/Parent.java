package heir;

public class Parent extends GrandParents {
	String fn,mn,ln;
	public Parent(String fn)
	{
		
		super("", "", "");
		this.fn=fn;
		this.mn=mn;
		
		
	}
	public String getFn() {
		return fn;
	}
	
	public String getMn() {
		return mn;
	}
	
	public String getLn() {
		return ln;
	}

	@Override
	public String toString() {
		return "Parent [fn=" + fn + ", mn=" + mn + ", ln=" + ln + "]";
	}
	

}
