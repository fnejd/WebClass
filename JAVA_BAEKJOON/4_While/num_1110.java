import java.util.Scanner;

public class num_1110 {
	public static void main(String[] args) {
		
		
		//더하기 사이클
		Scanner sc = new Scanner(System.in);
		
		//주어지는 숫자 num
		int num = sc.nextInt();
		
		//사이클 길이 
		int cnt = 0;
		
		//매 사이클 마다 만드는 새로운 숫자
		int s = -1;
		
		//이전 사이클의 숫자
		int tmp = num;
		
		
		//주어지는 숫자와 새로 생성하는 숫자 비교
		while(num != s) {
			
			//새로운 수 생성 
			//[이전 사이클의 가장 오른쪽 수 (일의 자리) + 이전 사이클의 각 자리수를 더한 합의 오른쪽 수]
			s = (tmp%10)*10 + (tmp%10 + tmp/10)%10;
			
			//사이클 수행 수 증가
			cnt += 1;
			
			//다음 사이클을 위해 이번 사이클에 생성된 수 저장
			tmp = s;
			
		}
		System.out.println(cnt);
		
		sc.close();
	
		
	}

}
