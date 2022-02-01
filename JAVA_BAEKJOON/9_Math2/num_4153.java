import java.util.Scanner;

public class num_4153 {

	public static void main(String[] args) {
		

		//직각삼각형 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			//세변의 길이 입력 받기
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			if(a==0) {
				break;
			}
			
			
			if(a*a ==  b*b + c*c) {
				//a의 길이가 가장 긴 직각 삼각형 일 때 
				System.out.println("right");
			}else if(b*b == c*c + a*a) {
				//b의 길이가 가장 긴 직각 삼각형 일 때 
				System.out.println("right");
			}else if(c*c == b*b + a*a) {
				//c의 길이가 가장 긴 직각 삼각형 일 때 
				System.out.println("right");
			}else {
				//직각 삼각형이 아니다 
				System.out.println("wrong");
			}
			
		}
		
		sc.close();
	}

}
