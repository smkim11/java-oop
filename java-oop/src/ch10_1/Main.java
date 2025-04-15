package ch10_1;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println("hi"); // 모든 코드는 예외를 발생 시킬 수 있다
			args = null;
			System.out.println(args.length);	
			System.out.println("bye");
		}catch(Exception e) {
			System.out.println("null값입니다");
			e.printStackTrace();
			return;
		}finally {
			System.out.println("finally");
		}
		
	}
	

}
