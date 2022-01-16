import java.util.Scanner;

public class num_2577 {
	
	public static void main(String[] args) {
		
		
		//숫자의 개수
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//0~9까지 각각 몇 번 쓰였는지 저장할 수 있는 배열
		int[] cnt = new int[10];
		
		int num = a*b*c;
		
		
		while(num>0) {
			//오른쪽 끝자리 수 알아내서 배열에 저장
			cnt[num%10]++;
			
			//배열에 저장되면 다음 숫자 파악을 위해 저장된 숫자는 지운다. 
			num /= 10;
		}
		
		for(int i=0; i<cnt.length;i++) {
			System.out.println(cnt[i]);
		}
		
		sc.close();
		
	}

}
