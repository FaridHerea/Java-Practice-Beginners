package getSetParameters;

public class subGirls {
	private String firstGirl, secondGirl;
	public void setName(String firstName, String secondName) {
		firstGirl = firstName;
		secondGirl = secondName;
	}
	public String getFirstGirlName() {
		return firstGirl;
	}
	public String getSecondGirlName() {
		return secondGirl;
	}
	public void saying() {
		System.out.println("Your gfs were " + getFirstGirlName() + " and " + getSecondGirlName() + ".");
	}
}
