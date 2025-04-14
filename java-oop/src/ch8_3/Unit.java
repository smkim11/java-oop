package ch8_3;

public abstract class Unit implements ICure{ // new Unit()코드를 방지하기위해 추상클래스로
	protected int hp;
    protected String name;
    protected void move() {
        System.out.println(this.name+" Go!");
    }
}
