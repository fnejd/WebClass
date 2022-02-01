import java.util.Scanner;

public class num_3009 {

	public static void main(String[] args) {
		
		
		//네 번째 점
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		//네번째 점의 좌표인 fx좌표와 fy 좌표
		int fx = 0;
		int fy = 0;
		
		for(int i=0; i<3; i++) {
			//x좌표들은 x배열에 저장
			x[i] = sc.nextInt();
			//y좌표들은 y배열에 저장
			y[i] = sc.nextInt();
		}
		
		/*직사각형을 만들기 위해서는 저장한 x좌표 중에서 일치하는 두점을 제외한 
		 * 나머지 한 점이 네번째 점의 fx와 일치하게 된다.*/ 
		
		if(x[0]==x[1]) {
			fx = x[2];
		}else if(x[0]==x[2]) {
			fx = x[1];
		}else {
			fx = x[0];
		}
		
		/*직사각형을 만들기 위해서는 저장한 y좌표 중에서 일치하는 두점을 제외한 
		 * 나머지 한 점이 네번째 점의 fy와 일치하게 된다.*/ 
		
		if(y[0]==y[1]) {
			fy = y[2];
		}else if(y[0]==y[2]) {
			fy = y[1];
		}else {
			fy = y[0];
		}
		
		System.out.printf("%d %d", fx, fy);
		
		
		sc.close();

	}

}
