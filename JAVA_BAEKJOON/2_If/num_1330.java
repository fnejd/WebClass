import java.util.Scanner;

public class num_1330 {
	
	public static void main(String[] args) {
		
		
		//두 수 비교하기
		//두 정수 a,b 비교 
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {  
			// a가 b보다 크면 '>' 출력
			System.out.println(">");
		}else if(a<b) {    
			// a가 b보다 작으면 '<' 출력
			System.out.println("<");
		}else {
			// a와 b가 같으면 '==' 출력
			System.out.println("==");
		}
		
		
	}

}
