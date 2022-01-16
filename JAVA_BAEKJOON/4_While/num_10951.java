import java.util.Scanner;

public class num_10951 {
	public static void main(String[] args) {
		
		//A+B - 4
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		
		//입력이 int 이면 true
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a+b);
		}
		
		sc.close();
		
		
	}

}
