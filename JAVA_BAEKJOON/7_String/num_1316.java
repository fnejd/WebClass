import java.util.Scanner;

public class num_1316 {

	public static void main(String[] args) {
		
		
		//그룹 단어 체커
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//단어의 개수 입력
		int n = Integer.parseInt(sc.nextLine());
		
		//단어를 받을 문자열
		String s = "";
		
		//그룹단어 개수
		int cnt = 0;
		
		
		boolean check;
		
		for(int i=0; i<n; i++) {
			//단어 입력 받기
			s = sc.nextLine();
					
			check = true;
			
			
			//단어의 2번째 문자부터 이전 문자와 비교
			for(int j=1; j<s.length(); j++) {
				
				//단어의 문자가 이전 문자와 다를 경우
				if(s.charAt(j) != s.charAt(j-1)) {
					
					//단어의 (0번째 ~ j-2)까지 문자에 이미 현재 문자와 동일한 문자가 있을 경우
					if(s.substring(0, j-1).contains(s.charAt(j)+"")) {
						
						//그룹 문자가 아니기에 check를 false로 설정 
						check = false;
						break;
					}
				}
			}
			
			if(check==true) {
				cnt++;
			}
			
		}
		
		//그룹 문자 개수 출력
		System.out.println(cnt);
		sc.close();

	}

}
