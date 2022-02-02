import java.util.Scanner;

public class num_14681 {
	public static void main(String[] args) {
		
		//사분면 고르기
		
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		//좌표 입력 받기
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0) {
			//x >0 이면 1 또는 4사분면 
			if(y>0) {
				//x>0 && y>0 
				System.out.println(1);
			}else {
				//x>0 && y<0
				System.out.println(4);
			}
		}else {
			//x <0 이면 2 또는 3사분면 
			if(y>0) {
				//x<0 && y>0
				System.out.println(2);
			}else {
				//x<0 && y<0
				System.out.println(3);
			}		
		}
		
		sc.close();
		
	}

}
