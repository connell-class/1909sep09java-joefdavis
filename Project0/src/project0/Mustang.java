package project0;

public class Mustang extends Cars{

	private boolean cobra;

	public Mustang(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used, double price,
			int year, boolean cobra) {
		super(color, engine, wheeltype, tintLevel, mpg, used, price, year);
		this.cobra = cobra;
	}

	public boolean isCobra() {
		return cobra;
	}

	public void setCobra(boolean cobra) {
		this.cobra = cobra;
	}

	@Override
	public String toString() {
		return "Mustang [cobra=" + cobra + ", getColor()=" + getColor() + ", getEngine()=" + getEngine()
				+ ", getWheeltype()=" + getWheeltype() + ", getTintLevel()=" + getTintLevel() + ", getMpg()=" + getMpg()
				+ ", isUsed()=" + isUsed() + ", getPrice()=" + getPrice() + ", getYear()=" + getYear() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
