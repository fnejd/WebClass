import java.util.Scanner;

public class num_11654 {
	public static void main(String[] args) {
		
		// 아스키 코드
		
		//알파벳 소문자, 대문자, 숫자 0-9 중 하나 입력
		Scanner sc = new Scanner(System.in);
		
		//nextLine() 통해서 입력 받고 charAt()을 통해서 char로 저장
		char ch = sc.nextLine().charAt(0);
		
		//(int) 형변환
		System.out.println((int)ch);
		
		sc.close();
	}

}
