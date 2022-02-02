import java.util.Scanner;

public class num_10430 {
	public static void main(String[] args) {
		
		//나머지
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		//(A+B)%C 출력
		System.out.println((a + b) %c);
		
		//((A%C) + (B%C))%C 출력
		System.out.println((a%c + b%c)%c);
		
		//(A×B)%C 출력
		System.out.println((a * b) %c);
		
		//((A%C) × (B%C))%C 출력
		System.out.println(((a%c)*(b%c))%c);
		
		sc.close();
		
	}

}
