import java.util.Scanner;

public class num_11720 {
	public static void main(String[] args) {
		
		
		//숫자의 합
		
		Scanner sc = new Scanner(System.in);
		
		//숫자의 개수 입력
		int n = Integer.parseInt(sc.nextLine());
		
		//공백 없이 주어지는 숫자를 string으로 받는다. (입력되는 숫자가 int의 범위를 넘는 숫자일 수도 있다)
		String s = sc.nextLine();
		
		//숫자의 총합를 저장하는 sum
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			//숫자를 int형으로 변환
			sum += s.charAt(i)-'0';
		}
		
		System.out.println(sum);
		
		sc.close();
		
		
	}

}
