import java.util.Scanner;

public class num_2753 {
	public static void main(String[] args) {
	
		//윤년
		Scanner sc = new Scanner(System.in);
		
		//연도 입력받기 
		int y = sc.nextInt();
		
		//윤년이면 1 출력, 윤년이 아니면 0 출력
		//윤년 : 연도가 4의 배수 이면서 100의 배수가 아닌 해 OR 연도가 400의 배수인 해 
		
		if(y%4==0 && y%100!=0) {
			//연도가 4의 배수 이면서 100의 배수가 아닌 해
			System.out.println(1);
		}else if(y%400==0) {
			//연도가 400의 배수인 해
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
		sc.close();
	}

}
