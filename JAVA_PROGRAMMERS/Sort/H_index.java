import java.util.Arrays;

public class H_index {

	public static void main(String[] args) {
		
		//정수 -> 3.H- index (Level 2)
		
		int[] citations = {0,0,0,0};
		System.out.println(solution(citations));
		

	}
	
	public static int solution(int[] citations) {
		
		//정렬 
        Arrays.sort(citations);
       
        int result = 0;
        
      
        int h;
        //h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용 (h의 최대값)
        
        for(int i =0; i<citations.length; i++) {
        	
        	//논문의 개수 
        	h = citations.length-i;
        	
        	//논문이 인용된 횟수  citations[i] 
        	//논문이 인용된 횟수, 눈문의 개수 비교
        	if(citations[i]>=h){
        		result = h;
        		break;
        		
        	}
        	
        	
        }
        
       return result;
        
       
    }
}


