import java.util.Scanner;

public class num_1152 {

	public static void main(String[] args) {
		
		
		//단어의 개수
		Scanner sc = new Scanner(System.in);
		
		//문자열 시작과 끝의 공백 제거
		String s = sc.nextLine().trim();
		
		//단어 사이의 공백으로 구분해서 word배열에 단어 넣기 
		String[] word = s.split(" ");
		
		
		
		if(s.isEmpty()) {
			//비어있는 입력값일 경우
			System.out.println(0);
		}else {
			
			System.out.println(word.length);
		}
		
		sc.close();

	}

}
