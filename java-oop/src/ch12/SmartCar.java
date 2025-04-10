package ch12;

public class SmartCar extends Car{
	public String display;
	public String color;
	public SmartCar() {
		super(); // super.color = null;
		this.display = null;
	}
	// super.onOff()
	
	@Override
	public void onOff() { // 오버라이딩
		System.out.println("버튼 사용");
	}
	
	public static void main(String[] args) {
		SmartCar sc = new SmartCar();
		sc.display = "삼성"; // this
		sc.color = "빨간색"; // super
		System.out.println(sc.display+" "+sc.color);
		sc.onOff(); // super
	}
}
