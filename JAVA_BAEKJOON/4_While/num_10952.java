import java.util.Scanner;

public class num_10952 {
	
	public static void main(String[] args) {
		
		
		//A+B - 5 
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		//입력이 있으면 true
		while(sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			//입력의 마지막에는 0 0 이 들어온다. 
			if(a==0 && b==0) {
				break;
			}
			
			System.out.println(a+b);
			
		}
		
		sc.close();
		
	}

}
