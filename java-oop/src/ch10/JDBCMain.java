package ch10;
import java.sql.*;
import java.util.*;

import dto.Actor;

public class JDBCMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 키보드를 통해 매개값 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요: ");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요: ");
		String lastName = scanner.nextLine();
		scanner.close();
		
		Actor actor = new Actor();
		actor.setFirstName(firstName);
		actor.setLastName(lastName);
		
		// 입력 Insert 모듈(메소드) 호출
		ActorDAO actorDao = new ActorDAO();
		int row = actorDao.insertActor(actor);
		
		// 조회 Select 모듈(메소드) 호출
		ArrayList<Actor> list = actorDao.selectActorList(5);
		
		// 출력
		for(Actor a:list) {
			System.out.println(a.getActorId()+"\t"+a.getFirstName()+"\t"+a.getLastName()+"\t"+a.getLastUpdate());
		}
	}

}
