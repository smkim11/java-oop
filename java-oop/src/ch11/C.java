package ch11;
// is(상속관계)
public class C extends A{
	public int z;
	public void m3() {
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.x = 1;
		c.m1();
		c.name = "qq";
		
		c.m3();
		c.z = 2;
	}
}
