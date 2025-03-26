package ch03;

public class ObjectTest {

	public static void main(String[] args) {
		Car car;
		car = new Car(); 
		car.onOff = true;
		car.name = "그랜저";
		car.color="black";
		car.move();
		
		Car car2 = new Car();
		car2.onOff = false;
		car2.name = "K9";
		car2.color = "gray";
		car.move();
		
		Doctor doctor = new Doctor();
		doctor.person = new Person();	
		doctor.person.age=35;
		doctor.person.name = "홍길동";
		doctor.person.phone="000-0000-0000";
		doctor.major = "내과";
		
		Doctor2 doctor2 = new Doctor2();
		doctor2.age = 34;
		doctor2.name = "홍길둥";
		doctor2.phone = "111-1111-1111";
		doctor2.major = "외과";

	}

}
