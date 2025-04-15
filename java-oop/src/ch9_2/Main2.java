package ch9_2;

public class Main2 {

	public static void main(String[] args) {
		Main2 main2 = new Main2();
		// 람다식 (인터페이스가 하나의 메소드만 가지는 함수형 인터페이스일때 사용가능)
		main2.exe((name)->System.out.println(name+"일하다")); // 기능만 넘길때 사용하는 문법 - 람다(Lambda)
		
		// 익명객체
		main2.exe(new IParent() {
			@Override
			public void work(String name) {
				System.out.println(name+"공부하다");
			}
		});
	}

	public void exe(IParent parent) {
		parent.work("구디");
	}
}

@FunctionalInterface
interface IParent{ // 하나의 메소드만 가질때 적용 가능
	void work(String name);
}