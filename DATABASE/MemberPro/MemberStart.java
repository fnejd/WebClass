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
				//�����ͺ��̽����� ȸ�� ���� ��ü�� �����Ͽ� �ܼ� ����ϴ� ��� ����
				//��� ���
				memberAllList();
				
				
			}else if(menu == 2) {
				//ȸ�� ���
				//main -> DTO -> DAO
				memberInsert();
				
				
			}else if(menu == 3) {
				//ȸ�� ���� ����
				memberEdit();
			
			}else if(menu == 4) {
				//ȸ������
				memberDel();
				
			}else if(menu == 5) {
				System.exit(0); //���α׷��� �����Ű�� �޼��� ����� ���α׷� �����Ų��. 
				
			}else {
				System.out.println("�޴��� �߸� �Է��Ͽ����ϴ�.");
			}
			
			
		}//while��
		
	}
	//ȸ������ �����
	public void memberDel() {
		
		//������ ȸ�� ��ȣ
		System.out.print("������ ȸ����ȣ ->");
		int num = Integer.parseInt(scan.nextLine());
		
		MemberDAO dao = new MemberDAO();
		
		int result = dao.memberDelete(num);
		
		if(result>0) {
			System.out.println(num + "�� ȸ���� �����Ǿ����ϴ�.");
		}else {
			System.out.println(num+ "�� ȸ�� ���� �����Ͽ����ϴ�.");
		}
	}
	
	
	
	//ȸ������ �����ϱ�
	public void memberEdit() {
		
		MemberDTO dto = new MemberDTO();
		
		//������ ȸ����ȣ�� �Է¹ް�
		System.out.println("������ ȸ����ȣ-> ");
		dto.setNum(Integer.parseInt(scan.nextLine()));
		
		//����ó�� �������� , �̸����� ������ �� Ȯ���� �� ��
		System.out.print("������ �׸��� �Է� (1.����ó 2. �̸���)-> ");
		String que = scan.nextLine();
		
		if(que.equals("1")) {
			//����ó(tel)
			System.out.print("������ ����ó->");
			dto.setTel(scan.nextLine());
			
			
		}else if(que.equals("2")) {
			//�̸���(email)
			System.out.print("������ �̸���->");
			dto.setEmail(scan.nextLine());	
		}
		
		//������ ���̽� ������Ʈ ����
		MemberDAO dao = new MemberDAO();
		//ó�� ���
		int cnt = dao.memberUpdate(que, dto);
		
		//���
		if(cnt>0) {
			//������
			System.out.println("ȸ�������� �����Ǿ����ϴ�.");
		}else {
			//�����ȵ�
			System.out.println("ȸ������ ���� �����Ͽ����ϴ�");
		}
		
		
		
	}
	
	
	
	
	//ȸ������ϱ�
	public void memberInsert() {
		//����� ȸ�� ������ �Է� �޾� DTO ��ü�� setter�� �Ѵ�.
		MemberDTO dto = new MemberDTO();
		System.out.print("�̸�->");
		dto.setUsername(scan.nextLine());
		System.out.print("����ó->");
		dto.setTel(scan.nextLine());
		System.out.print("�̸���->");
		dto.setEmail(scan.nextLine());
		System.out.print("�������(ex)1900-10-10-->");
		dto.setBirth(scan.nextLine());
		System.out.print("����(M,F) ->");
		dto.setGender(scan.nextLine());
		
		MemberDAO dao = new MemberDAO();
		int result = dao.memberInsert(dto);
		
		if(result>0) {
			//ȸ������� �Ǿ��� ��
			System.out.println(dto.getUsername() + "�� ������ ��ϵǾ����ϴ�.");
			
		}else {
			//ȸ����� ����
			System.out.println("ȸ������� �����Ͽ����ϴ�.");
		}
		
		
	}
	
	
	
	//��ü ȸ�� ��� �����ϱ�
	public void memberAllList() {
		//DAO�� �����Ǿ� �ִ� memberList() ȣ��
		MemberDAO dao = new MemberDAO();
		//���� ����
		//dao.memberList2();
		
		List<MemberDTO> list = dao.memberList();
		
		//  size() : ��ü�� ��
		for(int idx = 0; idx<list.size() ; idx++) {
			//list���� index ��ġ�� ��ü�� ���Ͽ�(dto) �ܼ� ���
			 MemberDTO dto= list.get(idx); //1���� ȸ��
			 //���
			 oneMemberOutput(dto);
			 
			 //���� �� �� ��ü ����
			 //oneMemberOutput(list.get(idx));
			 
		}
	}
	//1���� ȸ���� ����ϴ� �޼���
	public void oneMemberOutput(MemberDTO dto) {
		//��ȣ, �̸�, ����ó, �̸���, �������, ����, �����
		System.out.printf("%5d %10s %20s %20s %10s %5s %20s\n", 
				dto.getNum(), dto.getUsername(), dto.getTel(), dto.getEmail(),
				dto.getBirth(), dto.getGender(), dto.getWritedate());
	}
	
	
	public void menuOutput() {
		System.out.print("[�޴�]1.ȸ����� 2.ȸ����� 3.ȸ������ 4.ȸ������ 5.����?");
	}
	
	public static void main(String[] args) {
		new MemberStart().start();

	}

	public void memberList() {
		MemberDAO dao = new MemberDAO();
		dao.memberList2();
	}
}
