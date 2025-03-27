package ch07;

public class Calculator {
	public boolean power;
	public int num;
	public double rate;
	public Calculator() {
		// 자동생성
		this.power = false;
	}
	
	// this.num * (0.5 ~ 1.5)
	public double setRateNum(double rate) {
		double result = 0;
		if(!this.power) { // this.power == false
			System.out.println("계산기가 OFF 상태");
		}else {
			if(!(rate>=0.5 && rate <= 1.5)) {
				System.out.println("계산기가 OFF 상태");
			}else if((rate>=0.5 && rate <= 1.5)) {
				result = this.num*rate;
			}
		}
		return result;
	}
	
	
	
	public void setPower() {
		this.power = !this.power;
	}
	
	// 짝수인지 홀수인지
	public void setNum(int num) {
		// 계산기 파워가 ON(true)일때만 실행
		if(this.power == true) { // this.power
			this.num = num;
		}
		else {
			System.out.println("계산기가 OFF 상태");
		}
	}
	
	// this.num이 짝수인지 홀수 인지 알고싶은 메소드
	public String checkNum() {
		String result = "";
		if(this.power == false) { // !this.power
			System.out.println("계산기가 OFF 상태");
			result = "ERROR";	
		}else {
			if(this.num%2==0) {
				result = "짝수";
			}
			else {
				result = "홀수";
			}
		}
		return result;
	}
}