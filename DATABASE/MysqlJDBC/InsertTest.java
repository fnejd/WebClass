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
		//��� ��ȣ, �̸�, �޿�, �Ի����� ���ڵ� �߰��ϱ�
		
		
		try {
			// 1. ����̺� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. DB ����                                  ���� �ּ�/dbname
			con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root123");
			
			
			//3. preparedStatement��ü ���� : ������ �̿��Ͽ�
			//�����ȣ : 5555, �̸� : kim, �޿�: 4500, �Ի��� : ���� ��¥�� �ð����� ���� // 1,2,3  ����ǥ ������� ��ȣ�� �Ű�����.
			String sql = "insert into emp(empno, ename, sal, hiredate) values (?,?,?, now())";
			
			pstmt = con.prepareStatement(sql);
			
			//?�� ���� �����Ѵ�.
			//preparedStatement �ȿ� �ִ� �޼���
			
			//1��° ?�� 5555����
			pstmt.setInt(1, 5555);
			pstmt.setString(2, "kim");
			pstmt.setDouble(3,3500);
			
			//4.����
			//insert, update, delete�� ��쿡�� executeUpdate() ����
			//insert�� ���ڵ� ���� ��ȯ�� �ش�.
			//������ ������ �߰��� ���ڵ��� ���� ��ȯ���ش�. 
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0) {
				System.out.println("���ڵ尡 �߰� �Ǿ����ϴ�. ");
				
			}else {
				System.out.println("���ڵ� �߰� �����Ͽ����ϴ�.");
			}
			
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			//DB ����
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
