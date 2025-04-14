package ch8_3;

public class Medic extends Unit implements ICure{
    public Medic(){
        this.name="메딕";
    }
    public void cure(Unit unit){
    	if(unit instanceof ICure) { // ICure를 상속받고 있으면 실행
    		unit.hp++;
    		System.out.println(unit.name+"을 치료하다");
    	}
        
    }
}
