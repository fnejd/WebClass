import java.util.Scanner;

public class num_1330 {
	
	public static void main(String[] args) {
		
		
		//�� �� ���ϱ�
		//�� ���� a,b �� 
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {  
			// a�� b���� ũ�� '>' ���
			System.out.println(">");
		}else if(a<b) {    
			// a�� b���� ������ '<' ���
			System.out.println("<");
		}else {
			// a�� b�� ������ '==' ���
			System.out.println("==");
		}
		
		
	}

}
