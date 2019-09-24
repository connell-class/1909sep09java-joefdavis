package project0;

public class Suburban extends Cars{
	
	private boolean backseatTvs;

	public Suburban(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used,
			double price, int year, boolean backseatTvs) {
		super(color, engine, wheeltype, tintLevel, mpg, used, price, year);
		this.backseatTvs = backseatTvs;
	}

	public boolean isBackseatTvs() {
		return backseatTvs;
	}

	public void setBackseatTvs(boolean backseatTvs) {
		this.backseatTvs = backseatTvs;
	}

	@Override
	public String toString() {
		return "Suburban [backseatTvs=" + backseatTvs + ", getColor()=" + getColor() + ", getEngine()=" + getEngine()
				+ ", getWheeltype()=" + getWheeltype() + ", getTintLevel()=" + getTintLevel() + ", getMpg()=" + getMpg()
				+ ", isUsed()=" + isUsed() + ", getPrice()=" + getPrice() + ", getYear()=" + getYear() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
