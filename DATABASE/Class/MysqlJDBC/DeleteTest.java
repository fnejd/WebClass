import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteTest {

	Scanner scan = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public DeleteTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		try {
			//�����ȣ�� �Է¹޾� �Է� ���� ����� �����϶�. 
			System.out.println("������ �����ȣ -> ");
			int no = Integer.parseInt(scan.nextLine());
			
			//1. 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 
			conn = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root123");
			//3.
			String sql = "delete from emp where empno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  no);
			
			//4. 
			int cnt = pstmt.executeUpdate();
			
			if(cnt >0) {
				System.out.println(cnt + "���� ���ڵ尡 �����Ǿ����ϴ�.");
				
			}else {
				System.out.println("���ڵ� ���� �����Ͽ����ϴ�.");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//5. 
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			}catch(Exception ee){}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DeleteTest().start();

	}

}
