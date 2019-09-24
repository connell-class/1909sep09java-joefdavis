package project0;

public class Camaro extends Cars{
	
	private boolean convertable;
	private boolean streetModel;
	
	
	public Camaro(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used, double price,
			int year, boolean convertable, boolean streetModel) {
		super(color, engine, wheeltype, tintLevel, mpg, used, price, year);
		this.convertable = convertable;
		this.streetModel = streetModel;
	}


	public boolean isConvertable() {
		return convertable;
	}


	public void setConvertable(boolean convertable) {
		this.convertable = convertable;
	}


	public boolean isStreetModel() {
		return streetModel;
	}


	public void setStreetModel(boolean streetModel) {
		this.streetModel = streetModel;
	}


	@Override
	public String toString() {
		return "Camaro [convertable=" + convertable + ", streetModel=" + streetModel + ", getColor()=" + getColor()
				+ ", getEngine()=" + getEngine() + ", getWheeltype()=" + getWheeltype() + ", getTintLevel()="
				+ getTintLevel() + ", getMpg()=" + getMpg() + ", isUsed()=" + isUsed() + ", getPrice()=" + getPrice()
				+ ", getYear()=" + getYear() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
