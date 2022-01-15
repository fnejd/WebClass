import java.util.Scanner;

public class num_11021 {
	public static void main(String[] args) {
		
		
		//A + B - 7
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 입력
		int t = sc.nextInt();
		
		int a,b;
		
		for(int i=1; i<=t; i++) {
			//더 할 두수 입력
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.print("Case #"+ i + ": ");
			System.out.println(a+b);
		}
		
	}

}
