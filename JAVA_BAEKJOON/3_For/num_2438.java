import java.util.Scanner;

public class num_2438 {
	public static void main(String[] args) {
		
		
		// 별 찍기 - 1
		Scanner sc = new Scanner(System.in);
		
		//출력할 줄의 수 입력
		int n = sc.nextInt();
		String s = "";
		
		for(int i=1; i<=n; i++) {
			
			//줄마다 별의 개수 증가
			s += "*";
			System.out.println(s);
			
		}
		
	}

}
