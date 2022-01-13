import java.util.Scanner;

public class num_2588 {
	public static void main(String[] args) {
		
		
		//곱셈
		
		//세자리 수 a, b 입력
		Scanner sc = new Scanner(System.in);
		int a , b;
		
		
		//sum : (a * b) 연산 결과 값 저장
		//tmp : a * (b의 각 자리 수) 저장  
		int sum = 0, tmp = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		// a * (b의 일의 자리 수)
		tmp = a * (b%10);
		sum += tmp;
		b = b/10;
		System.out.println(tmp);
		
		// a * (b의 십의 자리 수)
		tmp = a * (b%10);
		sum += tmp *10;
		b = b/10;
		System.out.println(tmp);
		
		
		//a * (b의 백의 자리 수)
		tmp = a * (b%10);
		sum += tmp *100;
		System.out.println(tmp);
		
		
		//a * b 결과 
		System.out.println(sum);
		
		
		
	}

}
