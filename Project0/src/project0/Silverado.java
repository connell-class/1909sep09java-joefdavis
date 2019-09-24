package project0;

public class Silverado extends Cars{

	private int wheels;
	private boolean sprayedInBed;
	
	
	public Silverado(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used,
			double price, int year, int wheels, boolean sprayedInBed) {
		super(color, engine, wheeltype, tintLevel, mpg, used, price, year);
		this.wheels = wheels;
		this.sprayedInBed = sprayedInBed;
	}


	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public boolean isSprayedInBed() {
		return sprayedInBed;
	}


	public void setSprayedInBed(boolean sprayedInBed) {
		this.sprayedInBed = sprayedInBed;
	}


	@Override
	public String toString() {
		return "Silverado [wheels=" + wheels + ", sprayedInBed=" + sprayedInBed + ", getColor()=" + getColor()
				+ ", getEngine()=" + getEngine() + ", getWheeltype()=" + getWheeltype() + ", getTintLevel()="
				+ getTintLevel() + ", getMpg()=" + getMpg() + ", isUsed()=" + isUsed() + ", getPrice()=" + getPrice()
				+ ", getYear()=" + getYear() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	
	

}
