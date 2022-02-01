import java.util.Scanner;

public class num_3053 {

	public static void main(String[] args) {
		
		//택시 기하학
		
		
		//일반적인 원의 넓이 : pie * r * r
		//택시 기하학에서 원의 넓이 : 2 * r * r (마름모 모형의 정사각형)(높이가 r인 직각삼각형 4개)
		
		
		Scanner sc = new Scanner(System.in);
		
		
		//반지름 입력 받기 
		int r = sc.nextInt();
		
		//출력 형식이 소수점 아래 6자리까지 이다. 
		System.out.printf("%.6f\n",Math.PI * r * r);
		System.out.printf("%.6f\n", (double)2 * r * r);
		
		sc.close();

	}

}
