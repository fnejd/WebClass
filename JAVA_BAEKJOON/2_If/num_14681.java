import java.util.Scanner;

public class num_14681 {
	public static void main(String[] args) {
		
		//��и� ����
		
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		//��ǥ �Է� �ޱ�
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0) {
			//x >0 �̸� 1 �Ǵ� 4��и� 
			if(y>0) {
				//x>0 && y>0 
				System.out.println(1);
			}else {
				//x>0 && y<0
				System.out.println(4);
			}
		}else {
			//x <0 �̸� 2 �Ǵ� 3��и� 
			if(y>0) {
				//x<0 && y>0
				System.out.println(2);
			}else {
				//x<0 && y<0
				System.out.println(3);
			}		
		}
		
	}

}
