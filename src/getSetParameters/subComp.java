package getSetParameters;

public class subComp {
	private String myName, myHate, myLike;
	public void setComp(String name, String hate, String like) {
		myName = name;
		myHate = hate;
		myLike = like;
	}
	public String getName(){
		return myName;
	}
	public String getHate(){
		return myHate;
	}
	public String getLike() {
		return myLike;
	}
	public void saying() {
		System.out.println(getName() + " also known as the " + getLike() + " killer who loves " + getHate());
	}
}
