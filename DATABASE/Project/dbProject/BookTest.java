package dbProject;

import java.util.Scanner;

public class BookTest {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		new BookTest().start();

	}
	
	public void start() {
		
		while(true) {
			
			printField();
			
			int process = Integer.parseInt(sc.nextLine());
			
			if(process == 1) {
				//���� ���� �Է�
				BookDTO dto = new BookDTO();
				BookDAO dao = new BookDAO();
				dao.insertBook(dto);
				
			}else if(process ==2) {
				//���� ���� ���
				BookDAO dao = new BookDAO();
				dao.SelectBook();
				
			}else if(process ==3) {
				//���α׷� ����
				System.exit(0);
			}else {
				System.out.println("������ �۾��� �߸� �Է��߽��ϴ�.");
				
			}	
			
		}
		
	}
	
	public void printField() {
		
		System.out.println("1.���� ���� �Է� 2. ���� ���� ��� 3. ����? ");
		
	}

	

}
