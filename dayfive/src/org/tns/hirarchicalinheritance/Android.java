package org.tns.hirarchicalinheritance;

public class Android {
	private String brand;
	private String slotType;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [Brand=" + brand + ", slotType=" + slotType + "]";
	}
	public Android( String brand,String slotType) {
		super();
		this.brand = brand;
		this.slotType = slotType;
	}
	
	

}
