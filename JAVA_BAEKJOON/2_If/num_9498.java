import java.util.Scanner;

public class num_9498 {
	public static void main(String[] args) {
		
		//���� ����
		//���� �Է� �޾� 90~100�� -> A , 80~89�� -> B, 70~79�� ->C , 60 ~69��-> D, ������ F ���
		
		Scanner sc = new Scanner(System.in);
		
		//���� �Է� �ޱ� 
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println('A');
		}else if(score >= 80) {
			System.out.println('B');
		}else if(score >= 70) {
			System.out.println('C');
		}else if(score >= 60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
		
	}

}
