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
		//������ ���̽� ����
		//1. jdbc ����̺긦 jvm�� ��ü�� �����Ͽ� ����Ѵ�.
		//��θ� �ȿ� �־��ش�. �̰͸� ���ָ� �����ͺ��̽� ���� �ִ� ����̹��� ��ϵȴ�.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("����̺� �ε� ����!");
			cnfe.printStackTrace();
		}
		
		//���� ���� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//2. DB����
		//DriverManagerŬ������ getConnection() �޼ҵ带 �����ϸ�
		//�����ͺ��̽��� �����Ͽ� Connection ��ü�� �������ش�. 
		//	                            ����ip, db��
		String url = "jdbc:mysql://127.0.0.1/demo"; //mysql������ �ִ� �ּ� 127.0.0.1
		
		
		//�Ű����� ( �����ּ�, ����, ��й�ȣ) 
		//Connection�� ��ȯ
		conn = DriverManager.getConnection(url,"root","root123");
		
		
		
		//������ - ���ڵ� ����(select)
		//������ ���ڿ��� �����.
		 String sql = "select empno, ename, hiredate, sal from emp order by ename asc";
		
		//3. PreparedStatement ��ü�� ����
		 pstmt= conn.prepareStatement(sql);
		
		 
		 //4. pstmt�� �����Ѵ�. 
		 rs = pstmt.executeQuery();
		 
		 //ù��° ���� �����͸� �����ͼ� ���ڵ� ����ŭ �ݺ� ��ų ���̴�.
		 //����Ʈ�� ù��° �ٷ� �Ű��ش�.
		 //rs�� ����Ʈ �̵���Ű�� �޼��尡 �����Ѵ�. 
		 //first() ����Ʈ�� ���� ������ ������. 
		 //Last() ���� ���������� ����Ʈ�� ������.
		 //next() ����Ʈ�� ��ĭ �� �ڷ� �̵���Ų��. 
		 //previous() ���� ����Ʈ�� 
		 
		 while(rs.next()) {
			 int empno = rs.getInt(1); //rs.getInt("empno"); �� ��������� �� �Ⱦ���. 
			 // empno�� 1, ename�� 2
			 
			 String ename = rs.getString(2); //rs.getString("ename");
			 String hiredate= rs.getString(3);
			 Double sal = rs.getDouble(4);
			 System.out.printf("%6d %10s %22s %10.2f\n", empno, ename, hiredate, sal);
			 
		 }
		 
		 
		}catch(SQLException se) {
			System.out.println("DB ���� ���� �߻�");
			se.printStackTrace();
		}finally {
			//��������
			//�������� ������ ��ü���� ���� �����Ų�� (��������)
			
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
