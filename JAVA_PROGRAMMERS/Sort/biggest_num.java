import java.util.Arrays;
import java.util.Comparator;

public class biggest_num {

	public static void main(String[] args) {
		
		//정수 -> 2.가장 큰 수 (Level 2)
		int[] numbers = {5,10,9,3,2};
		System.out.println(solution(numbers));

	

	}
	
	public static String solution(int[] numbers) {
		
		String answer = "";
		
		//String으로 변환 
		String tmp = Arrays.toString(numbers);
		//String 배열로 변환
		String[] arr = tmp.substring(1,tmp.length()-1).split(", ");
		
		/* comparator, comparable 모두 인터페이스, 객체를 비교하는 기능 수행 -> 사용하려면 반드시 선언된 메소드 구현*/
		/*comparator 사용하기 위해 compareTo 메소드 구현 - 매개 변수 2개 ( 두 매개변수 객체 비교) 
		 * util 패키지에 속해 있다. 
		 
		  comparable 사용하기 위해 compareTo 메소드 구현 -매개 변수 1개 (자기 자신과 매개변수 객체 비교)
		  lang 패키지에 속해 있다.
		   */
		
		//Comparator로 비교 수행
		Arrays.sort(arr, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				//두 문자열 붙였을때 더 큰 값 기준으로 정렬
				// 내림 차순 
				return (o2+o1).compareTo(o1+o2);
			}
			
			
		});
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		
		
		//0으로만 구성되어 있는 경우가 있을 수 있다.
		if(arr[0].equals("0")) {
			answer = "0";
		}
		
        return answer;
    }	
}


