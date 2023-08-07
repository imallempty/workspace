package edu.kh.ploy.model.dto;

public class Fish extends Animal {
	
	private int gill; // 아가미 수
	
	public Fish() {
		super();
	}

	public Fish(String type, String eatType, int gill) {
		super(type, eatType);
		this.gill = gill;
	}

	public int getGill() {
		return gill;
	}

	public void setGill(int gill) {
		this.gill = gill;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + gill;
	}

	@Override
	public void breath() {
		System.out.println("물고기 : 아가미로 호흡한다.");
	}
	


	

}
