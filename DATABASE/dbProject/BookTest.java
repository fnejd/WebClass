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
				//도서 정보 입력
				BookDTO dto = new BookDTO();
				BookDAO dao = new BookDAO();
				dao.insertBook(dto);
				
			}else if(process ==2) {
				//도서 정보 출력
				BookDAO dao = new BookDAO();
				dao.SelectBook();
				
			}else if(process ==3) {
				//프로그램 종료
				System.exit(0);
			}else {
				System.out.println("수행할 작업을 잘못 입력했습니다.");
				
			}	
			
		}
		
	}
	
	public void printField() {
		
		System.out.println("1.도서 정보 입력 2. 도서 정보 출력 3. 종료? ");
		
	}

	

}
