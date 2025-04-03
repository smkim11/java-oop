package ch10;

public class a {
	public String s(int n) {
		int answer =0;
		String result ="";
		for(int i=n-1;i>0;i--) {
			if(n%i==0) {
				answer+=i;
			}
		}
		if(answer==n) {
			result+=n;
		}
		return result;
	}
}
