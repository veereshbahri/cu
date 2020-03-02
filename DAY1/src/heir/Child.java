package heir;

public class Child {
	String fn,mn,ln;

	public Child(String fn, String mn, String ln) {
		this.fn=fn;
		this.mn=mn;
		this.ln=ln;
		
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
		return "Child [fn=" + fn + ", mn=" + mn + ", ln=" + ln + "]";
	}
	
	

}
