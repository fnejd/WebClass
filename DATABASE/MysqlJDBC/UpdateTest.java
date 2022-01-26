import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateTest {
	Scanner scan = new Scanner(System.in);
	public UpdateTest() {
		
		// TODO Auto-generated constructor stub
	}

	public void start() {
		//�����ȣ�� �޿��� �Է¹޾� �ش� ����� �޿��� �����ϴ� ���α׷�
		//������ �Է�
		
		System.out.print("������ �����ȣ = ");
		int empno = scan.nextInt();
		System.out.println("������ �޿� = ");
		int sal = scan.nextInt();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1. ����̺� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. db ����
			conn = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root123");
			//3.                             1               2
			String sql = "update emp set sal=? where empno = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			//3-1. �ʿ� ������ ����
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);
			
			
			//4. ���� : ������ ���ڵ��� ���� �������ش�. 
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println(result + "���� ���ڵ尡 �����Ǿ����ϴ�.");
			}else {
				System.out.println("������ ���ڵ尡 �����ϴ�.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//5. dbClose
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				
			}
			
		}
		
	}
	public static void main(String[] args) {

		new UpdateTest().start();

	}

}
