import java.util.Scanner;

public class num_2753 {
	public static void main(String[] args) {
	
		//����
		
		Scanner sc = new Scanner(System.in);
		
		//���� �Է¹ޱ� 
		int y = sc.nextInt();
		
		//�����̸� 1 ���, ������ �ƴϸ� 0 ���
		//���� : ������ 4�� ��� �̸鼭 100�� ����� �ƴ� �� OR ������ 400�� ����� �� 
		
		if(y%4==0 && y%100!=0) {
			//������ 4�� ��� �̸鼭 100�� ����� �ƴ� ��
			System.out.println(1);
		}else if(y%400==0) {
			//������ 400�� ����� ��
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
