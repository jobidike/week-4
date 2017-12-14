

public class Name implements Comparable<Name> {

	private String fName;
	private String lName;
	
	public Name(String fName, String lName) {
		this.fName=fName;
		this.lName=lName;
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	@Override
	public String toString() {
		return fName;
	}

	@Override
	public int compareTo(Name o) {
		return 0;
	}

	
}
