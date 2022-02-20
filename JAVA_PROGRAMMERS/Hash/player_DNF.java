import java.util.Arrays;


public class player_DNF {

	public static void main(String[] args) {
		
		//해시 -> 1.완주하지 못한 선수 (Level 1)
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant,completion));

	}
	
	
	public static String solution(String[] participant, String[] completion) {
		
       //참가자 배열과 완주한 선수 배열 정렬
       Arrays.sort(participant);
       Arrays.sort(completion);
       
       int i;
       
       for(i=0; i<completion.length; i++) {
    	   
    	   //정렬된 두 배열이 일치하지 않는 지점이 participant 배열에서 완주하지 못한 선수가 있는 index
    	   if(!(participant[i].equals(completion[i]))) {
    		   return participant[i];
    	   }
       }
        
        
        return participant[i];
    }

}
