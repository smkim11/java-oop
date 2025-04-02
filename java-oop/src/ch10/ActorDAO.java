package ch10;

import java.sql.*;
import java.util.*;

import dto.Actor;

public class ActorDAO {
	// Actor 테이블 데이터를 조회 - Select
	public ArrayList<Actor> selectActorList(int num) throws ClassNotFoundException, SQLException{
		ArrayList<Actor> list = new ArrayList<>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "java1234");
		String sql = "select actor_id actorId, first_name firstName, last_name lastNaem, last_update lastUpdate from actor order by actor_id desc limit ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, num);
		ResultSet rs = stmt.executeQuery();
		
		// ResultSet(특수한:외부 API) -> ArrayList(일반적:기본 API, 문법)
		while(rs.next()) {
			Actor a = new Actor();
			a.setActorId(rs.getInt("actorId"));
			a.setFirstName(rs.getString("firstName"));
			a.setLastName(rs.getString("lastName"));
			a.setLastUpdate(rs.getString("lastUpdate"));
			list.add(a);
		}
		
		conn.close();
		return list;
	}
	
	// Actor 테이블 데이터를 입력 - Insert
	public int insertActor(Actor actor) throws ClassNotFoundException, SQLException {
		int row = 0;
		// 라이브러리를 추가 : 프로젝트 우클릭 -> build path항목에서 추가
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "java1234");
		PreparedStatement stmt = null;
		String sql = "insert into actor(first_name, last_name) values(?,?)";
		
		// 쿼리 실행
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, actor.getFirstName());
		stmt.setString(2, actor.getLastName());
		System.out.println(stmt);
		row = stmt.executeUpdate();
		conn.close();
		return row;
	}
}
