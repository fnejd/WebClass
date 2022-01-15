import java.util.Scanner;

public class num_2884 {
	public static void main(String[] args) {
		
		// 알람 시계
		
		//입력 받은 시각에서 45분 일찍 시간 설정
		Scanner sc = new Scanner(System.in);
		
		//시, 분 입력
		int hour, min;
		hour = sc.nextInt();
		min = sc.nextInt();
		
		
		if(min>=45) {
			//45분 이상일 경우
			min -= 45;
		}else {
			//45분 이하인 경우는 앞에 hour도 바뀐다. 
			if(hour==0) {
				//hour가 0일 경우 날이 바뀐다. 
				hour = 23;
			}else {
				hour -= 1;
			}
			//min + (60 - 45)
			min += 15;
		}
		
		System.out.println(hour + " " + min);
		
		
	}
}
