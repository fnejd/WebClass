import java.util.Scanner;

public class num_2908 {

	public static void main(String[] args) {
		
		//상수
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		//입력받은 숫자를 문자열로 반환
		String as = Integer.toString(a);
		String bs = Integer.toString(b);
		
		String tmp = "";
		
		//입력받은 첫번째 숫자가 거꾸로 저장되게 한다.
		for(int i=as.length()-1; i>=0; i--) {
			tmp += as.charAt(i);
		}
		
		a = Integer.parseInt(tmp);
		tmp = "";
		
		//입력받은 두번째 숫자가 거꾸로 저장되게 한다.
		for(int i=as.length()-1; i>=0; i--) {
			tmp +=bs.charAt(i);
		}
		
		b = Integer.parseInt(tmp);
		
		//두수의 크기 비교해서 큰 수 출력
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		
		sc.close();
		
	}

}
