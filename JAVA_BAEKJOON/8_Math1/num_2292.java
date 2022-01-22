import java.util.Scanner;

public class num_2292 {

	public static void main(String[] args) {
		
		
		//벌집
		
		Scanner sc = new Scanner(System.in);
		
		//방 번호 입력 받기
		int num = sc.nextInt();
		
		//해당 층의 제일 큰 숫자를 담을 sum
		int sum = 1, floor = 1;
		
		while(sum < num) {
			// 1 + 6 * 1 + 6 * 2 + 6 * 3 + ...
			
			sum += 6 * floor;
			floor++;
		}
		System.out.println(floor);
		
		sc.close();

	}

}
