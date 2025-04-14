import service.*;

public class Main {
	
	public static void main(String args[]) { // 추상클래스 객체 X, interface 객체 X
		ITv tv;
		tv = new OttTv(); 
		// 부모타입(클래스, 추상클래스, 인터페이스)에 자식객체를 대입 -> 다형성
		tv.onOff(); // ITv를 통해서 SmartTv의 onOff를 호출
		
		SmartTv stv = new SmartTv();
		stv.onOff();
		
	}
}
