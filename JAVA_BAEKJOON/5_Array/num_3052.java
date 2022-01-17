import java.util.Scanner;

public class num_3052 {
	
	public static void main(String[] args) {
		
		
		//나머지
		
		Scanner sc = new Scanner(System.in);
		
		//나머지의 개수를 세기 위한 배열
		int[] arr = new int[42];
		int cnt = 0;
		
		int num;
		
		for(int i=0; i<10; i++) {
			
			num = sc.nextInt();
			//나머지를 배열의 index에 넣고 해당 나머지를 갖는 숫자가 있다는 의미로 값을 증가시킨다. 
			arr[num%42]++;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			 
			if(arr[i]==0) {
				cnt++;
			}
		}
		
		//서로 다른 나머지 개수 출력
		System.out.println(42-cnt);
		
		sc.close();
		
	}

}
