package project0;

public class Corvette extends Cars {
	
	private boolean topdown;
	private String design;
	private String model;
	
	public Corvette(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used,
			double price, int year, boolean topdown, String design, String model) {
		super(color, engine, wheeltype, tintLevel, mpg, used, price, year);
		this.topdown = topdown;
		this.design = design;
		this.model = model;
	}

	public boolean isTopdown() {
		return topdown;
	}

	public void setTopdown(boolean topdown) {
		this.topdown = topdown;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Corvette [topdown=" + topdown + ", design=" + design + ", model=" + model + ", getColor()=" + getColor()
				+ ", getEngine()=" + getEngine() + ", getWheeltype()=" + getWheeltype() + ", getTintLevel()="
				+ getTintLevel() + ", getMpg()=" + getMpg() + ", isUsed()=" + isUsed() + ", getPrice()=" + getPrice()
				+ ", getYear()=" + getYear() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
