import java.util.Scanner;

public class num_8958 {
	public static void main(String[] args) {
		
		
		// OX퀴즈
		
		//cnt : 연속된 O의 개수 , sum: 총 점수
		int cnt, sum;
		
		String s = "";
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 개수 입력 
		int num = sc.nextInt();
		
		//개행문자를 제거한다 
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			
			//테스트 케이스를 입력 받는다. 
			s= sc.nextLine();
			sum = 0;
			cnt = 0;
			
			for(int j=0; j<s.length(); j++) {
				
				
				if(s.charAt(j)=='O') {
					// 'O'와 일치하면 cnt를 증가시킨다. 
					cnt++;
					
				}else {
					// 불일치하면 0으로 초기화
					cnt=0;
				}
				
				//총 합에 현재까지 연속된 개수를 더해준다. 
				sum+= cnt;
				
			}
			
			System.out.println(sum);
			
		}
		
		sc.close();
		
		
	}

}
