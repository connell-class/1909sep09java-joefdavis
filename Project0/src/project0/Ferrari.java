package project0;

public class Ferrari extends Cars{

	boolean deluxeModel;

		
	
	
	public Ferrari(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used, double price,
			int year, boolean deluxeModel) {
		super(color, engine, wheeltype, tintLevel, mpg, used, price, year);
		this.deluxeModel = deluxeModel;
	}

	public boolean isDeluxeModel() {
		return deluxeModel;
	}

	public void setDeluxeModel(boolean deluxeModel) {
		this.deluxeModel = deluxeModel;
	}
	
	
}
