import java.util.List;
import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberStart {

	Scanner scan = new Scanner(System.in);
	
	public void start() {
	
		while(true) {
			menuOutput();
			
			int menu = Integer.parseInt(scan.nextLine());
			
			if(menu == 1) {
				//데이터베이스에서 회원 정보 전체를 선택하여 콘솔 출력하는 기능 구현
				//목록 출력
				memberAllList();
				
				
			}else if(menu == 2) {
				//회원 등록
				//main -> DTO -> DAO
				memberInsert();
				
				
			}else if(menu == 3) {
				//회원 정보 수정
				memberEdit();
			
			}else if(menu == 4) {
				//회원삭제
				memberDel();
				
			}else if(menu == 5) {
				System.exit(0); //프로그램을 종료시키는 메서드 사용해 프로그램 종료시킨다. 
				
			}else {
				System.out.println("메뉴를 잘못 입력하였습니다.");
			}
			
			
		}//while문
		
	}
	//회원정보 지우기
	public void memberDel() {
		
		//삭제할 회원 번호
		System.out.print("삭제할 회원번호 ->");
		int num = Integer.parseInt(scan.nextLine());
		
		MemberDAO dao = new MemberDAO();
		
		int result = dao.memberDelete(num);
		
		if(result>0) {
			System.out.println(num + "번 회원이 삭제되었습니다.");
		}else {
			System.out.println(num+ "번 회원 삭제 실패하였습니다.");
		}
	}
	
	
	
	//회원정보 수정하기
	public void memberEdit() {
		
		MemberDTO dto = new MemberDTO();
		
		//수정할 회원번호를 입력받고
		System.out.println("수정할 회원번호-> ");
		dto.setNum(Integer.parseInt(scan.nextLine()));
		
		//연락처를 수정할지 , 이메일을 수정할 지 확인을 한 후
		System.out.print("수정할 항목을 입력 (1.연락처 2. 이메일)-> ");
		String que = scan.nextLine();
		
		if(que.equals("1")) {
			//연락처(tel)
			System.out.print("수정할 연락처->");
			dto.setTel(scan.nextLine());
			
			
		}else if(que.equals("2")) {
			//이메일(email)
			System.out.print("수정할 이메일->");
			dto.setEmail(scan.nextLine());	
		}
		
		//데이터 베이스 업데이트 수행
		MemberDAO dao = new MemberDAO();
		//처리 결과
		int cnt = dao.memberUpdate(que, dto);
		
		//결과
		if(cnt>0) {
			//수정됨
			System.out.println("회원정보가 수정되었습니다.");
		}else {
			//수정안됨
			System.out.println("회원정보 수정 실패하였습니다");
		}
		
		
		
	}
	
	
	
	
	//회원등록하기
	public void memberInsert() {
		//등록할 회원 정보를 입력 받아 DTO 객체에 setter를 한다.
		MemberDTO dto = new MemberDTO();
		System.out.print("이름->");
		dto.setUsername(scan.nextLine());
		System.out.print("연락처->");
		dto.setTel(scan.nextLine());
		System.out.print("이메일->");
		dto.setEmail(scan.nextLine());
		System.out.print("생년월일(ex)1900-10-10-->");
		dto.setBirth(scan.nextLine());
		System.out.print("성별(M,F) ->");
		dto.setGender(scan.nextLine());
		
		MemberDAO dao = new MemberDAO();
		int result = dao.memberInsert(dto);
		
		if(result>0) {
			//회원등록이 되었을 때
			System.out.println(dto.getUsername() + "의 정보가 등록되었습니다.");
			
		}else {
			//회원등록 실패
			System.out.println("회원등록이 실패하였습니다.");
		}
		
		
	}
	
	
	
	//전체 회원 목록 선택하기
	public void memberAllList() {
		//DAO에 구현되어 있는 memberList() 호출
		MemberDAO dao = new MemberDAO();
		
		dao.memberList2();
		
		List<MemberDTO> list = dao.memberList();
		
		//  size() : 객체의 수
		for(int idx = 0; idx<list.size() ; idx++) {
			//list에서 index 위치의 객체를 구하여(dto) 콘솔 출력
			 MemberDTO dto= list.get(idx); //1명의 회원
			 //출력
			 oneMemberOutput(dto);
			 
			 //위의 두 줄 대체 가능
			 //oneMemberOutput(list.get(idx));
			 
		}
	}
	//1명의 회원을 출력하는 메서드
	public void oneMemberOutput(MemberDTO dto) {
		//번호, 이름, 연락처, 이메일, 생년월일, 성별, 등록일
		System.out.printf("%5d %10s %20s %20s %10s %5s %20s\n", 
				dto.getNum(), dto.getUsername(), dto.getTel(), dto.getEmail(),
				dto.getBirth(), dto.getGender(), dto.getWritedate());
	}
	
	
	public void menuOutput() {
		System.out.print("[메뉴]1.회원목록 2.회원등록 3.회원수정 4.회원삭제 5.종료?");
	}
	
	public static void main(String[] args) {
		new MemberStart().start();

	}

	public void memberList() {
		MemberDAO dao = new MemberDAO();
		dao.memberList2();
	}
}