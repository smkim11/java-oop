package ch08;

import java.util.*;

public class PersonMain {

	public static void main(String[] args) {		
		Person p1 = new Person();
		Person p2 = new Person("admin","1234");
		// p2.id = admin, p2.pw = 1234
		
		p1.m11();
		
		p1.m11a();
		
		p1.m12(12);
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR);
		p1.m12(h);
		
		p1.m12a(false);
		// 매개변수로 값이 전달
		boolean x = false;
		p1.m12a(x);
		System.out.println(x);
		
		// 1-3
		p1.m13a(null);
		p1.m13a("abcd");
		String name = "abc";
		p1.m13a(name);
		
		p2.m13b("admin", "1234");
		
		// 1-4 
		int[] arr = new int[5]; // 0, 0, 0, 0, 0
		p1.m14a(arr);
		
		
		// 1-5
		Data d = new Data(7,7);
		p1.m15a(d);
		System.out.println(d.x);
		System.out.println(d.y);
		
		// 1-6
		Data[] datas = new Data[4];
		datas[0] = new Data(13, 100);
		datas[1] = new Data(23, 200);
		datas[2] = new Data(20, 300);
		datas[3] = new Data(39, 400);
		p1.m16a(datas);
		p1.m16b(datas , 200);
		
		// 1-7
		String[] names = new String[2];
		names[0] = "루피";
		names[1] = "조로";
		p1.m17a(names);
		
		// 1-8
		ArrayList<Integer> year = new ArrayList<>();
		int y = 2000;
		for(int i=0;i<=50;i++) {
			year.add(y);
			y++;
		}
		p1.m18a(year);
		
		// 1-9
		HashMap<String,Object> map = new HashMap<>();
		map.put("name", "샹크스");
		map.put("age", 40);
		String[] myHobby = {"술","견문색","검도"};
		map.put("hobby",myHobby);
		Data myData = new Data(7,11);
		map.put("data", myData);
		
		p1.m19a(map);
		
	}

}
