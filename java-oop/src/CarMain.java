import service.*;

public class CarMain {

	public static void main(String[] args) {
		// 서로 통신하는 접점역할은 interface가 아니어도 abstract로 구현 가능
		// interface는 다중상속도 가능하기 때문에 사용
		Car c = new NetflixCar();
		c.on();
		c = new SmartCar();
		c.on();
	}

}
