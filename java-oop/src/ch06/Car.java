package ch06;
import java.util.*;

public class Car {
	public int num;
	public boolean is;
	public String str;
	public ArrayList<String> list;

	// 생성자 없으면 컴파일러 기계어로 변경할때 기본생성자 모양으로 자동으로 추가
	public Car() {
		this(1, true); // this(1, true) -> Car(1, true)
		// 필드 초기화 코드도 자동으로 추가
		// 필드는 초기화의 규칙이 필요
		/*
		this.num = 0;
		this.is = false;
		this.str = null;
		this.list = null;
		*/
	}

	// 생성자 오버로딩
	public Car(int num) {
		// 일반생성자가 존재하므로 기본생성자를 추가X
		// 생성자 안에 필드초기화 코드가 없다 -> 추가
		this.num = num;
	}
	
	public Car(boolean is) {
		
		this.is = is;
	}
	
	public Car(int num, boolean is) {
		this.num = num;
		this.is = is;
	}
	
	// 메소드 오버로딩
	public void test() {}
	public void test(int x) {}
	
	// this 
	public void print() {
		System.out.println(this.num);
	}
}
