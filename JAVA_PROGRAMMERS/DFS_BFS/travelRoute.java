import java.util.ArrayList;
import java.util.Collections;


public class travelRoute {

	public static void main(String[] args) {
		
		//DFS, BFS -> 4. 여행 경로 (level 3)
		
		//String[][] tickets = {{"ICN", "JFK"},{"HND", "IAD"},{"JFK", "HND" }};
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		
		for(String s: solution(tickets)) {
			System.out.println(s);
		}
		

	}
	
	static ArrayList<String> arr;
	static boolean[] check;
	
	
	public static String[] solution(String[][] tickets) {
        String[] answer = {};
        
        //사용한 항공권인지 확인
        check = new boolean[tickets.length];
        
        //모든 경로 지나갔을 때 담는 공간
        arr = new ArrayList<>();
        
        //출발하는 공항, 경로 , 티켓 배열, 사용한 항공권 수
        dfs("ICN","ICN", tickets,0);
        
        //경로 정렬 (알파벳 순서가 앞서는 경로가 0번째에 위치하게 된다)
        Collections.sort(arr);
        
        //가장 빠른 경로 String 배열에 담기
        answer = arr.get(0).split(" ");
        
        return answer;
    }
	
	public static void dfs(String start, String route, String[][] tickets, int level) {
		
		//항공권 모두 사용했을 때 
		if(level== tickets.length) {
			
			//지금까지 지나간 경로 ArrayList에 추가 
			arr.add(route);
			return;
		}
		
		for(int i=0; i<tickets.length; i++) {
			
			//아직 사용한 항공권이 아닐때, 티켓의 출발하는 공항이 start와 일치할 때
			if(!check[i] && tickets[i][0].equals(start)) {
				
				//항공권 사용 체크 
				check[i] = true;
				dfs(tickets[i][1], route + " " + tickets[i][1], tickets, level+1);
				check[i] = false;
			}
		}
		
	}

}
