import java.util.Scanner;

public class num_5622 {

	public static void main(String[] args) {
		
		//다이얼 
		
		
		//배열로 다이얼 저장
		String[] arr = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		Scanner sc = new Scanner(System.in);
		
		//단어 입력 받기
		String s = sc.nextLine();
		
		//총 시간 
		int sum =0;
		
		for(int i=0; i<s.length(); i++) {
			
			for(int j=0; j<arr.length; j++) {
				
				//입력 받은 단어에서 알파벳 하나를 문자열로 변환
				String l = Character.toString(s.charAt(i));
				
				//몇번째 배열에 있는 알파벳과 일치하는지 파악
				if(arr[j].contains(l)) {
					
					//배열에서 숫자 2와 대응하는 "ABC"의 인덱스는 1, 숫자 2는 3초가 걸리므로
					//나오는 해당 알파벳이 있는 배열 인덱스에 2를 더해 걸리는 시간을 얻는다. 
					sum += j+2;
				}
				
			}
		}
		
		System.out.println(sum);
		
		sc.close();
		

	}

}
