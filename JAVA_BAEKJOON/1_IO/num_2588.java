import java.util.Scanner;

public class num_2588 {
	public static void main(String[] args) {
		
		
		//����
		
		//���ڸ� �� a, b �Է�
		Scanner sc = new Scanner(System.in);
		int a , b;
		
		
		//sum : (a * b) ���� ��� �� ����
		//tmp : a * (b�� �� �ڸ� ��) ����  
		int sum = 0, tmp = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		// a * (b�� ���� �ڸ� ��)
		tmp = a * (b%10);
		sum += tmp;
		b = b/10;
		System.out.println(tmp);
		
		// a * (b�� ���� �ڸ� ��)
		tmp = a * (b%10);
		sum += tmp *10;
		b = b/10;
		System.out.println(tmp);
		
		
		//a * (b�� ���� �ڸ� ��)
		tmp = a * (b%10);
		sum += tmp *100;
		System.out.println(tmp);
		
		
		//a * b ��� 
		System.out.println(sum);
		
		
		
	}

}
