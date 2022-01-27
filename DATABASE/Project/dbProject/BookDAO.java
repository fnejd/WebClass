package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookDAO{
	
	Scanner sc = new Scanner(System.in);
	
	public void insertBook(BookDTO bookDTO) {
		System.out.println("���� ��ȣ : ");
		bookDTO.setBookNo(sc.nextLine());
		System.out.println("���� ���� : ");
		bookDTO.setBookTitle(sc.nextLine());
		System.out.println("���� : ");
		bookDTO.setBookAuthor(sc.nextLine());
		System.out.println("���� ���� : ");
		bookDTO.setBookYear(Integer.parseInt(sc.nextLine()));
		System.out.println("���� : ");
		bookDTO.setBookPrice(Integer.parseInt(sc.nextLine()));
		System.out.println("���ǻ� : ");
		bookDTO.setBookPublisher(sc.nextLine());
		
		
		int result = 0;
		
		try {
			getConn();
			
			//������
			String sql = "insert into book(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher) "
					+ " values(?,?,?,?,?,?)";
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bookDTO.getBookNo());
			pstmt.setString(2, bookDTO.getBookTitle());
			pstmt.setString(3, bookDTO.getBookAuthor());
			pstmt.setInt(4, bookDTO.getBookYear());
			pstmt.setInt(5, bookDTO.getBookPrice());
			pstmt.setString(6, bookDTO.getBookPublisher());
			
			result = pstmt.executeUpdate();
			
			System.out.println(result +"�� ���ڵ� ���");
			
			
		}catch(Exception e) {
			System.out.println("���� ��� ���� �߻�");
			e.printStackTrace();
			
		}finally {
			dbClose();
		}
		
		
		
	}
	
	public void SelectBook() {
		
		try {
			
			getConn();
			
			String sql = "select bookno, booktitle, bookauthor, bookyear, bookprice, bookpublisher"
					+ " from book";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				System.out.printf("%s\t %s\t %s\t %d\t %d\t %s\n", 
						rs.getString(1), rs.getString(2),rs.getString(3),
						rs.getInt(4), rs.getInt(5), rs.getString(6));
			}
			
		}catch(Exception e) {
			System.out.println("��� ���� ��� ����");
			e.printStackTrace();
			
		}finally {
			dbClose();
		}
		
	}
	
	
	
	static {
		//1.����̹� �ε�
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		}catch(Exception e) {
			System.out.println("����̺� �ε� ���� �߻�");
			
		}
	}
	
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;

	
	//2. �����ͺ��̽� ����
	public void getConn() {
		
		String url = "jdbc:mysql://localhost/homework";
		String id = "root";
		String pw = "root123";
		
		try {
			conn = DriverManager.getConnection(url, id, pw);
			
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� ���� ���� �߻�");
		}
	}
	
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
