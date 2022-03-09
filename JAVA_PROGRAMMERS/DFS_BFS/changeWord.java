
public class changeWord {

	public static void main(String[] args) {
		
		
		//DFS, BFS ->  3. 단어 변환 (level 3)

		String begin = "hit";
		String target = "cog";
		//String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		String[] words = {"hot", "dot", "dog", "lot", "log"};
		
		System.out.println(solution(begin, target, words));

	}
	
	public static boolean[] check;
	static int answer;
	
	public static int solution(String begin, String target, String[] words) {
        
		//words에 target이 없을 경우
		if(!contain(words, target)) return 0;
        
        //이미 해당 단어로 변환 했었는지 체크하는 배열
        check = new boolean[words.length];
        
        //최소 단계를 저장하는 변수
        answer = 51;
        
        dfs(begin, target, words, 0);
        
        return answer;
        
    }
	
	//words 배열에 target이 있는지 확인
	public static boolean contain(String[] words, String target) {
		
		for(int i=0; i<words.length; i++) {
			if(target.equals(words[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void dfs(String begin, String target, String[] words, int length) {
		
		if(begin.equals(target)) {
			//begin과 target이 일치할 때
			
			//지금까지 저장된 최소 단계보다 현재의 단계가 작을 경우
			if(answer>length) {
				//최소 단계 갱신
				answer=length;
			}
			return;
		}
		
		
		for(int i=0; i<words.length; i++) {
			
        	if(!check[i]) {//해당 단어로 변환한 적이 없는 경우
        		
        		//일치하는 문자 개수 
        		int cnt = 0;
        		
        		for(int j=0; j<words[i].length(); j++) {
        			if(begin.charAt(j)==words[i].charAt(j)) { //begin과 words[i]의 일치하는 문자 개수 세기
        				cnt++;
        			}
        		}
        		
        		if(cnt==begin.length()-1) { //한 문자를 제외하고 다 일치할 경우
        			
        			check[i]=true; 
        			dfs(words[i], target, words, length+1); //begin을 해당 단어로 변환
        			check[i]=false;
        		}
        			
        	}
        }
		
	}

}
