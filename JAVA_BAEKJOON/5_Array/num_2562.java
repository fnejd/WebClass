import java.util.Scanner;

public class num_2562 {
	
	public static void main(String[] args) {
		
		//최댓값
		
		Scanner sc = new Scanner(System.in);
		
		
		int num, max = 0, idx = 0;
		
		
		for(int i=1; i<=9; i++){
			//입력 받는 숫자
			num = sc.nextInt();
			
			//max보다 클 때 max에 큰 숫자 저장
			//idx에 몇번째 숫자 인지 저장
			if(num > max) {
				max = num;
				idx = i;
			}
			
		}
		
		System.out.println(max);
		System.out.println(idx);
		
		sc.close();
	}

}
