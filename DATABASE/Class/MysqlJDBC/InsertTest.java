import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {

	Connection con = null;
	PreparedStatement pstmt = null;
	
	public InsertTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void empInsert() {
		//사원 번호, 이름, 급여, 입사일을 레코드 추가하기
		
		
		try {
			// 1. 드라이브 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. DB 연결                                  서버 주소/dbname
			con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root123");
			
			
			//3. preparedStatement객체 생성 : 쿼리문 이용하여
			//사원번호 : 5555, 이름 : kim, 급여: 4500, 입사일 : 현재 날짜와 시간으로 설정 // 1,2,3  물음표 순서대로 번호가 매겨진다.
			String sql = "insert into emp(empno, ename, sal, hiredate) values (?,?,?, now())";
			
			pstmt = con.prepareStatement(sql);
			
			//?에 값을 셋팅한다.
			//preparedStatement 안에 있는 메서드
			
			//1번째 ?에 5555세팅
			pstmt.setInt(1, 5555);
			pstmt.setString(2, "kim");
			pstmt.setDouble(3,3500);
			
			//4.실행
			//insert, update, delete일 경우에는 executeUpdate() 실행
			//insert된 레코드 수를 반환해 준다.
			//쿼리문 실행해 추가된 레코드의 수를 반환해준다. 
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0) {
				System.out.println("레코드가 추가 되었습니다. ");
				
			}else {
				System.out.println("레코드 추가 실패하였습니다.");
			}
			
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			//DB 종료
			try {
				if(pstmt != null) { pstmt.close();}
				if(con != null) { con.close(); }
				
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new InsertTest().empInsert();
	}

}
