import java.util.Scanner;

public class num_9498 {
	public static void main(String[] args) {
		
		//시험 성적
		//성적 입력 받아 90~100점 -> A , 80~89점 -> B, 70~79점 ->C , 60 ~69점-> D, 나머지 F 출력
		
		Scanner sc = new Scanner(System.in);
		
		//성적 입력 받기 
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
