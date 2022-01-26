import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectTest {

	public SelectTest() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		//데이터 베이스 연동
		//1. jdbc 드라이브를 jvm에 객체를 생성하여 등록한다.
		//경로를 안에 넣어준다. 이것만 해주면 데이터베이스 쓸수 있는 드라이버가 등록된다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("드라이브 로딩 실패!");
			cnfe.printStackTrace();
		}
		
		//변수 선언 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//2. DB연결
		//DriverManager클래스의 getConnection() 메소드를 실행하면
		//데이터베이스를 연결하여 Connection 객체를 리턴해준다. 
		//	                            서버ip, db명
		String url = "jdbc:mysql://127.0.0.1/demo"; //mysql서버가 있는 주소 127.0.0.1
		
		
		//매개변수 ( 서버주소, 계정, 비밀번호) 
		//Connection에 반환
		conn = DriverManager.getConnection(url,"root","root123");
		
		
		
		//쿼리문 - 레코드 선택(select)
		//쿼리문 문자열로 만든다.
		 String sql = "select empno, ename, hiredate, sal from emp order by ename asc";
		
		//3. PreparedStatement 객체를 생성
		 pstmt= conn.prepareStatement(sql);
		
		 
		 //4. pstmt를 실행한다. 
		 rs = pstmt.executeQuery();
		 
		 //첫번째 줄의 데이터를 가져와서 레코드 수만큼 반복 시킬 것이다.
		 //포인트를 첫번째 줄로 옮겨준다.
		 //rs에 포인트 이동시키는 메서드가 존재한다. 
		 //first() 포인트를 가장 앞으로 보낸다. 
		 //Last() 제일 마지막으로 포인트를 보낸다.
		 //next() 포인트를 한칸 씩 뒤로 이동시킨다. 
		 //previous() 이전 포인트로 
		 
		 while(rs.next()) {
			 int empno = rs.getInt(1); //rs.getInt("empno"); 도 방법이지만 잘 안쓴다. 
			 // empno가 1, ename이 2
			 
			 String ename = rs.getString(2); //rs.getString("ename");
			 String hiredate= rs.getString(3);
			 Double sal = rs.getDouble(4);
			 System.out.printf("%6d %10s %22s %10.2f\n", empno, ename, hiredate, sal);
			 
		 }
		 
		 
		}catch(SQLException se) {
			System.out.println("DB 연결 에러 발생");
			se.printStackTrace();
		}finally {
			//연결종료
			//마지막에 생성된 객체부터 먼저 종료시킨다 (역순으로)
			
			try{
				if(rs != null) {rs.close();}
				if(pstmt !=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			}catch(Exception e) {}	
		}
	}
	public static void main(String[] args) {
		
		new SelectTest().start();

	}

}
