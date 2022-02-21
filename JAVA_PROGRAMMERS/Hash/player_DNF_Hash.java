import java.util.Arrays;
import java.util.HashMap;

public class player_DNF_Hash {

	public static void main(String[] args) {
		//해시 -> 1.완주하지 못한 선수 (Level 1)
		
				String[] participant = {"mislav", "stanko", "mislav", "ana"};
				String[] completion = {"stanko", "ana", "mislav"};
				
				System.out.println(solution(participant,completion));

			}
			
			
			public static String solution(String[] participant, String[] completion) {
				
				String answer = "";
				
		      
				HashMap<String, Integer> map = new HashMap<>();
				
				//participant 선수들을 map에 넣기
				//key : 선수 이름 value: 선수의 수 (동명이인이 있을 수 있다)
				
				for(String s : participant) {
					//map에 participant s가 없을 때 
					if(map.get(s)==null) {
						map.put(s, 1);
					}
					else {
						//map에 동명이인이 이미 있을 때 value의 값을 1 증가
						map.put(s, map.get(s)+1);
					}
								
				}
				
				for(String s: completion) {
					//map에 completion s의 선수가 있다면 value의 값을 1 감소
					//완주한 선수들은 map의 value가 최종 0으로 변경되어 저장
					map.put(s, map.get(s)-1);
				}
				
				for(String key: map.keySet()) {
					//value가 0이 아니면 key의 이름인 선수가 완주 못한 선수 
					if(map.get(key) !=0) {
						answer = key;
					}
				}
				
				return answer;
				
		 }

}
