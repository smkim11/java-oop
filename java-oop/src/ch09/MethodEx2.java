package ch09;
import java.util.*;
public class MethodEx2 {
	
	// 반환타입 : Map
	// 매개타입 : Student
	public HashMap<String,Object> m9a(Student s){
		HashMap<String,Object> result = new HashMap<>();
		result.put("num", s.num);
		result.put("name", s.name);
		
		return result;
	}
	
	// 반환타입 : List<String>
	// 매개타입 : 임의의 개수의 문자열
	// 문자열이 몇개 들어올지 모를때 ... 사용
	public ArrayList<String> m8a(String ... name){ 
		ArrayList<String> result = new ArrayList<String>();
		for(String n : name) {
			result.add(n);
		}
		return result;
	}
	
	
	
	// 반환타입 : Student[]
	// 매개타입 : List<Map>
	public Student[] m7a(ArrayList<HashMap<String,Object>> list) {
		Student[] arr = new Student[list.size()];
		int i = 0;
		for(HashMap<String,Object> m : list) {
			arr[i] = new Student();
			arr[i].num = (Integer)(m.get("num"));
			arr[i].name = (String)(m.get("name"));
			i+=1;
		}
		return arr;
	}
	
	
	// 반환타입 : 클래스
	// 매개타입 : int, String
	public Student m6a(int num, String name) {
		Student s =  new Student();
		s.num = num;
		s.name = name;
		return s;
	}
	
	
	
	// 반환타입 : 배열
	// 매개타입 : int
	// 252 -> {2, 5, 2}
	public int[] m5a(int num) { // 나누기 연산
		int[] result = null;
		String strNum = String.valueOf(num);
		result = new int[strNum.length()];
		for(int i=result.length-1; i>=0; i--) {
				result[i] = num %10;
				num /= 10;
		}
		return result;
	}
	/*
	public int[] m5a(int num) { // 나누기 연산
		int[] result = null;
		String strNum = String.valueOf(num);
		result = new int[strNum.length()];
		for(int i=0; i<result.length; i++) {
				result[result.length-1-i] = num %10;
				num /= 10;
		}
		return result;
	}
	*/
	// 252 -> {"2" , "5" ,"2"}
	public String[] m5b(int num) { // substring() 메소드
		String[] result = null;
		String strNum = String.valueOf(num);
		result = new String[strNum.length()];
		for(int i=0; i<strNum.length();i++) {
			if(i==strNum.length()-1) {
				result[i] = strNum.substring(i);
			}else {
				result[i] = strNum.substring(i,i+1);
			}
		}
		return result;
	}
	
	// 반환타입 : 배열
	// 매개타입 : List
	// List를 입력받아서 배열로 변경하여 반환
	public int[] m4a(ArrayList<String> list) {
		int[] result = new int[list.size()];
		int i = 0;
		for(String s : list) {
			result[i] = Integer.parseInt(s);
			i+=1;
		}
		/*
		int[] result = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			result[i]=Integer.valueOf(list.get(i));
		}
		*/
		return result;
	}
	
	
	// 반환타입 : boolean
	// 매개타입 : 클래스 두개
	public boolean m24c(Student s1, Student s2) {
		boolean result = false;
		if(s1.num == s2.num && s1.name.equals(s2.name)) {
			result = true;
		}
		return result;
	}
	
	// Student 타입을 디버깅한 문자열을 반환하는 메소드
	// 반환타입 : String
	// 매개타입 : 클래스 하나
	public String m25a(Student s) {
		String result ="번호는 "+s.num+"이고,이름은 "+s.name+"입니다.";
	
		return result;
	}
	
	// 반환타입 숫자
	// 매개타입 배열 : 배열
	// 배열을 입력하면 반환값으로 배열의 길이가 반환
	public int m24a(int[] arr) { // ex) int x = new int[7] -> result = 7
		int result = 0;
		for(int i : arr) {
			result++;
		}
		
		return result;
	}
	
	public int m24b(int[] arr) {
		boolean flag = true;
		int i=0;
		while(flag) { // 무한루프
			try {
				int temp = arr[i];
			}catch(Exception e) {
				return i;
			}
			i++;
		}
		
		return i;
	}
}
