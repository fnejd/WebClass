import java.util.HashMap;

public class camouflage {

	public static void main(String[] args) {
		
		//해시 -> 3. 위장 (level 2)
		
		//String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
		String[][] clothes = {{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}};
		
		System.out.println(solution(clothes));

	}
	
	public static int solution(String[][] clothes) {
        //해당 종류를 key 값으로 설정
		//해당 종류의 개수를 value로 설정
		int cnt = 1;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<clothes.length; i++) {
			
			//map에 해당 종류와 일치하는 key가 없다면 value를 1로 설정해 map에 추가
			if(map.get(clothes[i][1])==null) {
				map.put(clothes[i][1], 1);
			}
			else {
				//map에 이미 해당 종류와 일치하는 key가 있다면 value의 값을 기존 value에 1 추가한 값으로 변경
				//value : 해당 종류의 개수 
				map.replace(clothes[i][1],map.get(clothes[i][1])+1);
			}
			
		}
		
		//map의 key를 모아서 set 형태로 반환
		//종류별로 value + 1 가지의 경우
		
		//cnt에 각 종류의 경우의 수들을 곱해준다. 
		
		
		for(String s : map.keySet()) {
			
			cnt *= (map.get(s)+1);
		}
		
		//최소 한개의 의상은 입기 때문에 어떤 것도 입지 않았을 때의 경우의 수 1가지 제외
		
		return cnt-1;
		
    }

}
