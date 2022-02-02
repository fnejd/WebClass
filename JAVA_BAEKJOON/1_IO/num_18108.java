import java.util.Scanner;

public class num_18108 {

	public static void main(String[] args) {

		//1998년생인 내가 태국에서는 2541년생?! 

		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		//서기연도와 불교연도 차이 543
		System.out.println(y-543);
		
		sc.close();

	}

}
