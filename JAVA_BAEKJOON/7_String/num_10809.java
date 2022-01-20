import java.util.Scanner;

public class num_10809 {
	public static void main(String[] args) {
		
		
		//알파벳 찾기
		
		
		Scanner sc = new Scanner(System.in);
		
		//알파벳 위치 담을 배열
		int[] alp = new int[26];
		//알파벳 소문자 입력받기 
		String s = sc.nextLine();
		
		// 알파벳 위치 -1초기화 
		for(int i=0; i<alp.length; i++) {
			alp[i] = -1;
		}
		
		//입력된 각 단어에서 알파벳이 처음 등장하면 alp 배열에 인덱스 저장
		for(int i=0; i<s.length(); i++) {
			
			//처음 등장하는 알파벳이라면 alp 배열에서 저장되어 있는 값이 -1
			if(alp[s.charAt(i)-'a'] == -1) {
				//처음 등장하는 알파벳일 때 문자열에서의 위치를 저장해준다. 
				alp[s.charAt(i)-'a'] =i ;
			}
		}
		
		for(int i=0; i<alp.length; i++) {
			System.out.print(alp[i] + " ");
		}
		
		sc.close();
		
	}

}
