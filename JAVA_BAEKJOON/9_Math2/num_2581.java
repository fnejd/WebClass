import java.util.Scanner;

public class num_2581 {

	public static void main(String[] args) {
		
		
		//소수 
		
		Scanner sc = new Scanner(System.in);
		
		//자연수 m,n 입력 받기 
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		boolean check = true;
		int min = 0, sum = 0;
		int cnt = 0;
	
		
		for(int i=m; i<=n; i++) {
			check = true;
			
			//1은 소수가 아니므로 제외시키기 
			if(i==1) {
				continue;
			}
			
			for(int j=2; j<i; j++) {
				
				//j로 나누어지면 소수가 아니므로 break
				if(i%j==0) {
					check = false;
					break;
				}
				
			}
			
			//check가 true면 소수
			if(check == true) {
				
				//처음 들어오는 소수는 이전까지 소수가 없었으므로 cnt가 0이다.
				if(cnt == 0) {
					//가장 작은 소수 저장 
					min = i;
				}
                
				//소수의 개수 증가시킨다.
                cnt++;
                
                //지금까지 소수들의 합
				sum+= i;
			}
			
			
		}
			
		
		//소수가 하나도 없었을 경우
		if(cnt==0) {
			System.out.println(-1);
		}else {
			//소수가 있었을 경우
			System.out.println(sum);
			System.out.println(min);
		}

		sc.close();
	}

}
