import java.util.Arrays;
import java.util.Scanner;

public class num_10818 {
	public static void main(String[] args) {
		
		
		//최소, 최대
		Scanner sc = new Scanner(System.in);
		
		//정수 n 입력
		int n = sc.nextInt();
		
		//정수 n개 담는 배열 생성
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//배열 정렬 -> 정렬 이후 0번째 원소: 최소값, 마지막 원소: 최대값
		Arrays.sort(arr);
		
		System.out.println(arr[0]+ " " + arr[n-1]);
		
		sc.close();
		
		
		
	}
}
