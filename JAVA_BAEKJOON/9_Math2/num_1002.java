import java.util.Scanner;

public class num_1002 {

	public static void main(String[] args) {
		
		
		
		//터렛
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 입력 받기 
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			
			//x1,y1,r1,x2,y2,r2 입력 받기
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			//원으로 생각. 
			//중심(A, B의 위치)으로부터 각각 r1,r2거리 만큼 떨어져 있는 C
			//원의 중심- A, B의 위치 , 반지름의 길이 -  r1: A에서 C까지의 거리 , r2: B에서 C까지의 거리 
			
			//두 점 A, B 사이의 거리 (x1-x2)^2 + (y1-y2)^2 의 제곱근 -> d
			
			//1. (접점 무한) -> 두 원의 중심이 동일, 반지름도 동일, 두 원자체가 일치 (x1=x2, y1=y2, r1=r2)
			
			//2. (접점이 0개 ) 
			//1)두 원이 멀리 떨어져 있을 때 -> 두 원의 중심의 사이의 거리가 두 원의 반지름의 합보다 크다 (d > r1 + r2)
			//2)한 원이 다른 원 안에 들어가 있을 때 -> d < |r1-r2|
			
			//3. (접점이 1개 일 때)
			//1) 원의 안에서 접할 때 (내접) -> (d = |r1 -r2|)
			//2) 원의 밖에서 접할 때 (외접) -> 두 원의 중심과의 거리가 두 원의 반지름의 합과 같다. (d=r1+r2)
			
			//4. (접점이 2개 일 때)
			//두 원의 중심 사이의 거리가 원이 내접할 때 외접할 때의 사이를 고려하면 된다. 
			//두 원의 중심 사이의 거리가 원이 내접할 경우다는 크고 원이 외접할 경우보다 작다. (|r1-r2| < d < r1+r2)
			
			
			//두 중심 A,B 사이의 거리
			double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
			
			
			if(x1==x2 && y1==y2 && r1==r2) {
				//접점이 무한일 경우
				//두 중심 A, B 위치와 A에서 C까지와 B에서 C까지의 거리가 일치 
				System.out.println(-1);
			}else if(d>r1+r2 || d<Math.abs(r1-r2)) {
				//접점이 0개 일 경우 
				System.out.println(0);
			}else if(d==r1+r2 || d==Math.abs(r1-r2)) {
				//접점이 1개 일 경우 (내접, 외접)
				System.out.println(1);
			}else {
				//접점이 2개 일 경우
				System.out.println(2);
			}
			        
		}
		
		sc.close();
	}

}
