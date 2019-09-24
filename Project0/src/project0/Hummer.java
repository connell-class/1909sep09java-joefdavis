package project0;

public class Hummer extends Cars {
	
	private boolean deluxe;
	private boolean superSoundSystem;
	public Hummer(String color, String engine, String wheeltype, int tintLevel, double mpg, boolean used, double price,
			int year, boolean deluxe, boolean superSoundSystem) {
		super(color, engine, wheeltype, tintLevel, mpg, used, price, year);
		this.deluxe = deluxe;
		this.superSoundSystem = superSoundSystem;
	}
	public boolean isDeluxe() {
		return deluxe;
	}
	public void setDeluxe(boolean deluxe) {
		this.deluxe = deluxe;
	}
	public boolean isSuperSoundSystem() {
		return superSoundSystem;
	}
	public void setSuperSoundSystem(boolean superSoundSystem) {
		this.superSoundSystem = superSoundSystem;
	}
	@Override
	public String toString() {
		return "Hummer [deluxe=" + deluxe + ", superSoundSystem=" + superSoundSystem + ", getColor()=" + getColor()
				+ ", getEngine()=" + getEngine() + ", getWheeltype()=" + getWheeltype() + ", getTintLevel()="
				+ getTintLevel() + ", getMpg()=" + getMpg() + ", isUsed()=" + isUsed() + ", getPrice()=" + getPrice()
				+ ", getYear()=" + getYear() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
