package ch09;
import java.util.*;
public class MethodEx2Main {
	public static void main(String[] args) {
		MethodEx2 m = new MethodEx2();
		
		int num2 = 102545;
		int[] result3 = m.m5a(num2);
		for(int i : result3) {
			System.out.println(i);
		}
		
		// 반환타입 : Map
		// 매개타입 : Student
		Student s9 = new Student();
		s9.num = 99;
		s9.name = "티치";
		HashMap<String,Object> map9 = m.m9a(s9);
		System.out.println(map9.get("num"));
		System.out.println(map9.get("name"));
		
		// 반환타입 : List<String>
		// 매개타입 : 임의의 개수의 문자열
		ArrayList<String> nameList = m.m8a("루피","조로","상디","나미");
		for(String n : nameList) {
			System.out.println(n);
		}
		
		// 반환타입 : Student[]
		// 매개타입 : List<Map>
		ArrayList<HashMap<String, Object>> list2 = new ArrayList<>();
		HashMap<String,Object> m1 = new HashMap<>();
		m1.put("num", 11);
		m1.put("name", "샹크스");
		list2.add(m1);
		
		HashMap<String,Object> m2 = new HashMap<>();
		m2.put("num", 21);
		m2.put("name", "버기");
		list2.add(m2);
		
		HashMap<String,Object> m3 = new HashMap<>();
		m3.put("num", 7);
		m3.put("name", "프랑키");
		list2.add(m3);
		
		Student[] arr7 = m.m7a(list2);
		for(Student s : arr7) {
			System.out.println(m.m25a(s));
		}
		
		// 반환타입 : 클래스
		// 매개타입 : int, String
		Student student = m.m6a(8,"로빈");
		System.out.println(m.m25a(student));
		
		
		
		// 반환타입 : 배열, 매개타입 : int
		int num = 1004;
		String[] result2 = m.m5b(num);
		for(String s : result2) {
			System.out.println(s);
		}
		
		// List를 입력받아서 배열로 변경하는 메소드
		ArrayList<String> list = new ArrayList<String>();
		list.add("101");
		list.add("200");
		list.add("999");
		int[] result = m.m4a(list);
		for(int n : result) {
			System.out.println(n); // 101 200 999
		}
		
		Student s = new Student();
		s.num=2;
		s.name="조로";
		Student s2 = new Student();
		s2.num=3;
		s2.name="나미";
		Student s3 = new Student();
		s3.num = 3;
		s3.name = "나미";
		
		// Student 변수를 비교하는 메소드
		System.out.println(s2==s3); // false
		System.out.println(s2.equals(s3)); // false
		System.out.println(m.m24c(s2, s3)); // true
		
		// Student 변수 디버깅 하는 메소드
		// 반환타입 String
		// 매개타입 Student
		System.out.println(m.m25a(s));
		System.out.println(m.m25a(s2));
		
		
		int[] arr = new int[6];
		System.out.println(m.m24a(arr));
		System.out.println(m.m24b(arr));
	}

}
