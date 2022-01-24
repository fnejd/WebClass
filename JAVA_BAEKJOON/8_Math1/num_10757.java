
import java.math.BigInteger;
import java.util.Scanner;


public class num_10757 {

	public static void main(String[] args) {
		
		//큰 수 A+B
		
		
		Scanner sc = new Scanner(System.in);
		
		//숫자 a,b의 크기가 커서 문자열로 입력 받는다. 
		//문자열 배열에 a,b 저장
		String[] s = sc.nextLine().split(" ");
		
		//BigInteger 사용
		//long보다 범위가 큰 자료형. 범위가 무한하다. 
		//생성자의 매개변수를 String으로 받는다. 
		BigInteger a = new BigInteger(s[0]);
		BigInteger b = new BigInteger(s[1]);
		
		BigInteger result = a.add(b);
		
		System.out.println(result);
		
		

	}

}
