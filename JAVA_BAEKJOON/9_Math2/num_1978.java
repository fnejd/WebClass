import java.util.Scanner;

public class num_1978 {

	public static void main(String[] args) {
		
		
		//소수 찾기
		
		Scanner sc = new Scanner(System.in);
		
		//숫자의 개수 입력
		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n];
		
		//입력 받은 숫자들 배열에 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		boolean check = true;
		
		for(int i=0; i<arr.length; i++) {
			
			check = true;
			
			//1 은 소수가 아니므로 제외
			if(arr[i]==1) {
				continue;
			}
			
			for(int j=2; j<arr[i]; j++) {
				
				//j로 나누어 떨어지면 소수가 아니므로 바로 break
				if(arr[i]%j==0) {
					check = false;
					break;
				}
				
			}
			
			//check가 true면 소수이므로 소수의 개수를 증가시킨다. 
			if(check == true) {
				cnt++;
			}
		
		}
		
		//소수의 개수 출력
		System.out.println(cnt);
		

		sc.close();
	}
	
	

}
