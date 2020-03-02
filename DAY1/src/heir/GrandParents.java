package heir;

public class GrandParents {
	String fn,mn,ln;
	public GrandParents(String fn,String mn, String ln)
	{
		this.fn=fn;
		this.mn=mn;
		this.ln=ln;
		
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getMn() {
		return mn;
	}

	public void setMn(String mn) {
		this.mn = mn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	@Override
	public String toString() {
		return "GrandParents [fn=" + fn + ", mn=" + mn + ", ln=" + ln + "]";
	}
	

}
