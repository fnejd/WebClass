import java.util.Scanner;

public class num_2675 {

	public static void main(String[] args) {
		
		
		// 문자열 반복
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 개수 입력
		int t = Integer.parseInt(sc.nextLine());
		int n;
		String s;
		
		for(int i=0; i<t; i++) {

			s = sc.nextLine();
			
			// 문자를 반복할 횟수 int로 변환
			n = s.charAt(0)-'0';
			
			//반복할 테스트 케이스 
			s = s.substring(2);

			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<n;k++) {
					
					//반복할 횟수만큼 각 문자 반복
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
