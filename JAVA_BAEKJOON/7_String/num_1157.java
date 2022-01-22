import java.util.Scanner;

public class num_1157 {
	public static void main(String[] args) {
		
		//단어 공부
		
		Scanner sc = new Scanner(System.in);
		
		//알파벳 개수 담을 배열
		int[] arr = new int[26];
		
		//대소문자를 구분 하지 않아서 모두 대문자로 만든다. 
		String s = sc.nextLine().toUpperCase();
		
		int max;
		//가장 많이 사용된 알파벳
		char alp = ' ';
		
		//단어에서 각 알파벳이 몇 개 나왔는지 개수를 배열에 담기
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)-'A']++;
		}
		
		max = -1;
		
		//가장 많이 사용된 알파벳 비교
		for(int i = 0; i<arr.length; i++) {
			
			if(max<arr[i]) {
				alp = (char) ('A'+i);
				max = arr[i];
			}else if(max == arr[i]) {
				//가장 많이 사용된 알파벳 개수가 동일한 경우
				alp = '?';
			}
		}
		
		//가장 많이 사용된 알파벳 출력 
		System.out.print(alp);
		
		sc.close();
		
	}

}
