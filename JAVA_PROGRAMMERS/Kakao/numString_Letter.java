
public class numString_Letter {

	public static void main(String[] args) {
		
		//2021 카카오 채용 연계형 인턴십 -> 숫자 문자열과 영단어 (level 1)
		
		String s = "one4seveneight";
		System.out.println(solution(s));
		
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        String[] numbers={"zero","one","two","three","four","five"
                        ,"six","seven","eight","nine"};
        
        String add = "";
        
            
        for(int j=0; j<s.length(); j++){
                
            if(s.charAt(j)>= '0' && s.charAt(j)<= '9'){ //숫자 문자일 경우
                
                answer =  10 * answer + s.charAt(j)-'0';
                
            }else{
                add += s.charAt(j); //알파벳일 경우 add에 누적
                
                for(int i=0; i<numbers.length; i++){ //numbers의 요소와 일치하는지 확인
                    
                    if(numbers[i].equals(add)){ //일치할 경우 숫자로 변경
                    	
                        answer = 10 * answer + i; 
                        add = "";  //add 초기화
                        break;
                    }
                }
            }                
        }
        
        return answer;
    }
}
