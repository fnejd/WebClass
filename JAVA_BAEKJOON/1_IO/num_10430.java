import java.util.Scanner;

public class num_10430 {
	public static void main(String[] args) {
		
		//������
		
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		//(A+B)%C ���
		System.out.println((a + b) %c);
		
		//((A%C) + (B%C))%C ���
		System.out.println((a%c + b%c)%c);
		
		//(A��B)%C ���
		System.out.println((a * b) %c);
		
		//((A%C) �� (B%C))%C ���
		System.out.println(((a%c)*(b%c))%c);
		
	}

}
