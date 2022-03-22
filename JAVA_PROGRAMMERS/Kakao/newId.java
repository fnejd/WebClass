
public class newId {

	public static void main(String[] args) {
	
		//2021 카카오  -> 신규 아이디 추천 (level 1)
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		System.out.println(solution(new_id));
		
	}
	
	public static String solution(String new_id) {
		
		String answer = "";
		//(1단계) 대문자 소문자로 변환
        new_id = new_id.toLowerCase();


        for(int i=0; i<new_id.length(); i++) {
        	//2딘계 (소문자, - , _ , ., 숫자만 가능)
            if(Character.isLowerCase(new_id.charAt(i))) {
                answer += new_id.charAt(i);

            }else if(new_id.charAt(i) >= '0' && new_id.charAt(i) <='9') {

                answer += new_id.charAt(i);

            }else if(new_id.charAt(i) == '-' || new_id.charAt(i) == '_') {
                answer += new_id.charAt(i);

            }else if(new_id.charAt(i)=='.') {
            	//3단계 (.이 두번이상 연속되지 못하게)
                if(answer.length()>0){
                    char c = answer.charAt(answer.length()-1);

                    if(c != '.') {
                        answer += new_id.charAt(i);
                    }
                }
            }
        }
        //4단계 (시작과 끝에 있는 . 제거)
        if(answer.length()>0){
            if(answer.charAt(0)=='.') {
                answer = answer.substring(1);
            }
            if(answer.charAt(answer.length()-1) == '.') {
                answer = answer.substring(0,answer.length()-1);
            }
        }
        //5단계 (빈 문자열 이면 a 대입)
        if(answer.equals("")) {
                answer += "a";
        }
        //6단계
        if(answer.length()>=16) {
            answer = answer.substring(0,15);    

            if(answer.charAt(answer.length()-1)=='.') {
                answer = answer.substring(0,answer.length()-1);
            }

        }
        //7단계 (2글자 이하일 경우 마지막 글자 반복해서 추가)
        while(answer.length()<3) {

            char l = answer.charAt(answer.length()-1);
            answer += l;
        }
        return answer;
    }
}
