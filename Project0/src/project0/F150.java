package project0;

public class F150 extends Cars{

	private boolean heavyDuty;

	public F150(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used, double price,
			int year, boolean heavyDuty) {
		super(color, engine, wheeltype, tintLevel, mpg, used, price, year);
		this.heavyDuty = heavyDuty;
	}

	public boolean isHeavyDuty() {
		return heavyDuty;
	}

	public void setHeavyDuty(boolean heavyDuty) {
		this.heavyDuty = heavyDuty;
	}

	@Override
	public String toString() {
		return "F150 [heavyDuty=" + heavyDuty + ", getColor()=" + getColor() + ", getEngine()=" + getEngine()
				+ ", getWheeltype()=" + getWheeltype() + ", getTintLevel()=" + getTintLevel() + ", getMpg()=" + getMpg()
				+ ", isUsed()=" + isUsed() + ", getPrice()=" + getPrice() + ", getYear()=" + getYear() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
