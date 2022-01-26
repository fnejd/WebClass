package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlConnection {

	
	//멤버변수 선언, 객체 생성
	//실행문은 멤버영역에 기술할 수 있다.
	//그러나 멤버영역에 실행문 사용할 수 있게 하는 키워드 - static
	
	//1. 드라이브 로딩 - 자동으로 실행되야 하기 때문에 static에 넣었다. 
	static { //static {} 는 실행문을 기술할 수 있는 영역이 된다.
		//호출 안해도 알아서 실행되는 곳
		//실행문, 멤버영역
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		}catch(Exception e) {
			System.out.println("드라이브로딩 예외 발생!!!");
			
		}
		
	}
	
	//멤버영역에 변수를 선언한다.
	//상속을 받지 않는 이상 못 사용하게 protected로 접근 제어 설정
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	//2. 데이터베이스 연결 메소드
	public void getConn() {
		String url = "jdbc:mysql://localhost/mydb";
		String id = "root";
		String password = "root123";
		
		try {
			conn = DriverManager.getConnection(url,id,password);
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 예외 발생!!!");
			
		}
		
	}
	//3 데이터베이스 종료 메소드
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			
		}catch(Exception e) {
			System.out.println("데이터베이스 닫기 예외 발생");
		}
	}
	
	

}
