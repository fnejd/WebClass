import java.util.Scanner;

public class num_10871 {
	
	public static void main(String[] args) {
		
		
		// X보다 작은 수
		Scanner sc = new Scanner(System.in);
		
		//받을 숫자의 개수 입력
		int n = sc.nextInt();
		
		//기준이 될 숫자 x
		int x = sc.nextInt();
		
		int a;
		
		for(int i=0; i<n; i++) {
			//숫자 n회 입력 받기 
			a = sc.nextInt();
			
			//입력 받은 숫자 a가 x보다 작은 경우에만 출력
			if(x>a) {
				System.out.print(a + " ");
			}
		}
		
	}

}
