import java.util.Scanner;

public class num_1085 {

	public static void main(String[] args) {
		
		//직사각형에서 탈출
		
		Scanner sc = new Scanner(System.in);
		
		//(x,y)와 (w,h)입력
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//x좌표 상에서의 최소값 구하기 
		//x축에서 x까지 거리와 w에서 x까지 거리 중 최소값 
		int cx = Math.min(x, w-x);
		
		//y좌표 상에서의 최소값 구하기 
		//y축에서 y까지 거리와 h에서 y까지 거리 중 최소값
		int cy = Math.min(y, h-y);
		
		//경계선까지의 거리 중 최소값 
		//x좌표 상에서의 최소값과 y좌표 상에서의 최소값 중에서 가장 작은 값을 출력한다. 
		System.out.println(Math.min(cx, cy));
		
		sc.close();

	}

}
