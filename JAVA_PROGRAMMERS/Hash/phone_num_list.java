import java.util.HashMap;

public class phone_num_list {

	public static void main(String[] args) {
		
		
		//해시 -> 2. 전화번호 목록 (level 2)

		String[] phone_book = {"12","123","1235","567","88"};
		System.out.println(solution(phone_book));

	}
	
	public static boolean solution(String[] phone_book) {
		
        
        HashMap<String, Integer> map = new HashMap<>();
        
        //phone_book의 번호들을 map에 넣기
        for(int i=0; i<phone_book.length; i++) {
        	map.put(phone_book[i], i);
        }
        
        
        for(int i=0; i<phone_book.length; i++) {
        	
        	for(int j=1; j<phone_book[i].length(); j++) {
        		
        		//전화번호를 substring 한 결과인 s는 해당 번호의 접두어
        		String s = phone_book[i].substring(0,j);
        		
        		
        		//map에 접두어인 s가 있는지 확인
        		if(map.containsKey(s)) {
        			return false;
        		}
        	}
        }
        
        //접두어가 없는 경우
        return true;
    }

}
