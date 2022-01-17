import java.util.Arrays;
import java.util.Scanner;

public class num_1546 {
	public static void main(String[] args) {
		
		//평균
		
		Scanner sc = new Scanner(System.in);
		
		//과목의 개수 n 
		int n = sc.nextInt();
		
		//과목 중 최대값 , 과목의 합계
		double max, sum=0;
		
		//각 과목의 점수를 담는 배열
		double[] score = new double[n];
	
		//과목들 입력 받기 
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		//정렬 수행하면 배열의 마지막 값이 최대값
		Arrays.sort(score);
		max = score[n-1];
		
		for(int i=0; i<score.length;i++) {
			//각 과목의 성적 수정
			score[i] = score[i]/max*100;
			
			//수정한 과목의 성적을 합계에 더한다. 
			sum += score[i];
		}
		
		//평균 출력
		System.out.println(sum/n);
		
		sc.close();
		
	}

}
