import java.util.Scanner;


public class num_2739 {
	public static void main(String[] args) {
		//구구단
		
		
		Scanner sc = new Scanner(System.in);
		
		// num 입력
		int num = sc.nextInt();
		
		// num단 출력
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = "+ num*i );
		}
		
	}

}
