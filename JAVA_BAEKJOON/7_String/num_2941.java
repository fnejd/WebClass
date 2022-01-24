import java.util.Scanner;

public class num_2941 {

	public static void main(String[] args) {
		
		//크로아티아 알파벳 
		
		Scanner sc = new Scanner(System.in);
		//크로아티아 알파벳 저장
		String[] cr = {"c=", "c-","dz=", "d-", "lj", "nj","s=", "z="};
		
		
		//단어 입력 받기
		String s = sc.nextLine();
		
		
		for(int i=0; i<cr.length; i++) {
			//단어안에 해당하는 크로아티아 알파벳 있는지 확인
			if(s.contains(cr[i])) {
				//해당 크로아티아 알파벳을 문자열1로 변경해 저장
				s = s.replace(cr[i], "1");
			}
		}
		//해당하는 알파벳 개수 만큼 1이 있기 때문에 문자열s의 길이 출력
		System.out.println(s.length());
	
		
		sc.close();
		

	}

}
