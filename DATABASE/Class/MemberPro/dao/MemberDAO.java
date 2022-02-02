package dao;

import java.util.ArrayList;
import java.util.List;

import dbConn.MysqlConnection;
import dto.MemberDTO;

public class MemberDAO extends MysqlConnection {
	
	//회원 선택
	public List<MemberDTO> memberList() {
		
		//dto 객체를 담을 ArrayList 객체를 생성
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		try {
		
			getConn(); //DB연결 
			
			
			//쿼리문 만들기 
			//select
			String sql = "select num, username,tel,email,birth, gender,writedate"
					+ " from member order by num";
			
			pstmt = conn.prepareStatement(sql);
			
			
			//rs
			 rs = pstmt.executeQuery();
			 
			 
			//dto 객체를 사람 수 만큼 만들어서 넣는다.
			//dto 객체를 컬렉션에 담을 것이다.
			 while(rs.next()) {
				 MemberDTO dto = new MemberDTO();
				 dto.setNum(rs.getInt(1));
				 dto.setUsername(rs.getString(2));
				 dto.setTel(rs.getString(3));
				 dto.setEmail(rs.getString(4));
				 dto.setBirth(rs.getString(5));
				 dto.setGender(rs.getString(6));
				 dto.setWritedate(rs.getString(7));
				 
				 list.add(dto);
			 }
			 
		}catch(Exception e) {
			System.out.println("회원선택 예외 발생!!!");
			e.printStackTrace();
			
		}finally {
			//데이터베이스 닫기
			dbClose();
		}
		
		
		return list;
		
		
	}
	//회원 등록
	public int memberInsert(MemberDTO dto) {
		//결과를 리턴시킬 변수
		int result = 0;
		
		try {
			getConn();
			
			String sql = "insert into member(username, tel, email, birth, gender) values(?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			//값을 셋팅
			pstmt.setString(1, dto.getUsername());
			pstmt.setString(2, dto.getTel());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getBirth());
			pstmt.setString(5, dto.getGender());
			
			//추가된 레코드의 수를 반환
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("회원등록예외 발생....");
			e.printStackTrace();
			
			
		}finally {
			dbClose();
			
		}
		
		return result;
	}
	
	
	//회원 수정
	public int memberUpdate(String que,MemberDTO dto) {
		
		int result = 0;
		try {
			
			//DB연결
			getConn();
			
			String sql = "update member set ";
			
			if(que.equals("1")) {
				sql += " tel= ?";
				
			}else if(que.equals("2")){
				sql += " email= ? ";
				
			}
			sql += "where num=?";
			//System.out.println(sql);
			
			pstmt = conn.prepareStatement(sql);
			
			//연락처, 이메일 주소 setting
			if(que.equals("1")) {	
				pstmt.setString(1, dto.getTel());
				
			}else if(que.equals("2")) {
				pstmt.setString(1, dto.getEmail());
			}
			
			pstmt.setInt(2, dto.getNum());
			
			result = pstmt.executeUpdate();
					
			
		}catch(Exception e) {
			
			System.out.println("회원수정 예외 발생...");
			e.printStackTrace();
			
		}finally {
			dbClose();
			
		}
		
		return result;
	}
	//회원 삭제
	public int memberDelete(int num) {
		
		int result = 0;
		try {
			getConn();
			
			String sql = "delete from member where num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println("회원삭제 예외발생...");
			e.printStackTrace();
			
		}finally {
			dbClose();
		}
		
		return result;
	}
	
	//회원전체 목록
	public void memberList2(){
		try {
			getConn();
			String sql = "select num, username,tel,email,birth,gender, writedate "
					+ " from member order by num";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%5d %10s %20s %20s %10s %5s %20s\n", 
						rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
				
			}
		}catch(Exception e) {
			
		}finally {
			dbClose();
		}
		
	}

}