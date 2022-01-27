import java.util.Scanner;

public class num_11653 {

	public static void main(String[] args) {
		
		
		//소인수분해
		
		Scanner sc = new Scanner(System.in);
		
		//소인수 분해할 숫자 입력
		int n = sc.nextInt();
		
		//나눌수 
		int div = 2;
		
		//소인수분해 완료 후에는 n이 1이 된다. 
		
		while(n>1) {
			
			//div로 나눠지는 경우
			if(n%div==0) {
				
				System.out.println(div);
				n = n /  div;
				
			}else {
				//div로 나눠지지 않으면 나눌 수를 증가시킨다. 
				div++;
			}
			
		}
		
		sc.close();

	}

}
