package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlConnection {

	
	//������� ����, ��ü ����
	//���๮�� ��������� ����� �� �ִ�.
	//�׷��� ��������� ���๮ ����� �� �ְ� �ϴ� Ű���� - static
	
	//1. ����̺� �ε� - �ڵ����� ����Ǿ� �ϱ� ������ static�� �־���. 
	static { //static {} �� ���๮�� ����� �� �ִ� ������ �ȴ�.
		//ȣ�� ���ص� �˾Ƽ� ����Ǵ� ��
		//���๮, �������
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		}catch(Exception e) {
			System.out.println("����̺�ε� ���� �߻�!!!");
			
		}
		
	}
	
	//��������� ������ �����Ѵ�.
	//����� ���� �ʴ� �̻� �� ����ϰ� protected�� ���� ���� ����
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	//2. �����ͺ��̽� ���� �޼ҵ�
	public void getConn() {
		String url = "jdbc:mysql://localhost/mydb";
		String id = "root";
		String password = "root123";
		
		try {
			conn = DriverManager.getConnection(url,id,password);
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� ���� ���� �߻�!!!");
			
		}
		
	}
	//3 �����ͺ��̽� ���� �޼ҵ�
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� �ݱ� ���� �߻�");
		}
	}
	
	

}
