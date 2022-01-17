import java.util.Scanner;

public class num_4344 {
	public static void main(String[] args) {
		
		
		// 평균은 넘겠지
		Scanner sc = new Scanner(System.in);
		
		
		// 테스트 케이스 개수 입력
		int t  = sc.nextInt();
		
		//sum: 점수 합계, avg: 점수 평균, cnt: 평균을 넘은 학생 수
		int sum = 0 , avg= 0, cnt;
		
		//prop: 평균을 넘는 학생들의 비율
		double prop = 0;
		
		for(int i=0; i<t; i++) {
			
			//학생 수 입력
			int num = sc.nextInt();
			
			//학생 점수 담는 배열 생성
			int[] arr = new int[num];
			
			sum = 0;
			avg = 0;
			cnt = 0;
			
			for(int j=0; j<num; j++) {
				
				//학생 점수 입력 받기
				arr[j] = sc.nextInt();
				
				//점수 합계에 더하기 
				sum+= arr[j];
			}
			//학생들 점수의 평균
			avg = sum / num;
			
			for(int j=0; j<num; j++) {
				if(arr[j]>avg) {
					//평균을 넘는 학생 수 
					cnt++;
				}
			}
			
			prop = (double)cnt / num * 100;
			
			//String.format()을 이용해 평균을 넘은 학생 비율을 반올림해서 소수점 셋째짜리 까지 출력
			System.out.println(String.format("%.3f", prop)+"%");
		}
		
		
		sc.close();
	}

}
