package ch9_2;

public class Main {

	public void exe(Parent parent) {
		parent.work();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Parent parent = new Parent();
		main.exe(parent);
		
		Parent parent2 = new Child(); // 다형성
		main.exe(parent2);
		
		main.exe(new Child()); // 다형성
		
		Parent parent3 = new Parent() { // 일회성 객체, 익명 객체 -> 클래스를 따로 만들 필요가 없다
			@Override
			void work() {
				System.out.println("밥 먹다");
			}
		};
		main.exe(parent3);
		
		main.exe(new Parent() { // class 익명 extends Parent <-이런 형식으로 만들어짐
			@Override
			void work() {
				System.out.println("밥 먹다");
			}
		});
	}
}

class Parent{
	void work() {
		System.out.println("일(직업) 한다");
	}
}

class Child extends Parent{
	@Override
	void work() {
		System.out.println("공부한다");
	}
}