import java.util.Scanner;

public class num_2839 {
	
	//설탕 배달

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//설탕 n kg
		int n = sc.nextInt();
		
		//봉지 수 
		int cnt = 0;
		
		while(true)
		{
			//5로 나누어 떨어지면 5로 나눈 몫을 봉지 수에 추가
			//5로 나누어지면 5kg 봉지들에 다 담긴 것이므로 break
			if(n%5==0) {
				cnt += n/5;
				break;
				
			}else {
				
				//nkg에서 채워진 3kg만큼 제외시키기
				//3kg 봉지 수 개수 증가 
				n -=3;
				cnt++;

			}
			//정확하게 nkg을 만들 수 없는 경우
			if(n<0) {
				cnt = -1;
				break;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
		
		
	}

}
