import java.util.LinkedList;
import java.util.Queue;

public class truck {

	public static void main(String[] args) {
		
		//스택/ 큐 -> 3. 다리를 지나는 트력 (level 2)
		
		int[] truck_weights = {7,4,5,6};
		int bridge_length = 2;
		int weight = 10;
		
		System.out.println(solution(bridge_length,weight,truck_weights));

	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		//큐 이용 
		//다리를 지나는 트럭 - 먼저 들어온 트럭이 먼저 나간다. (FIFO)
		//트럭은 다리에 올라가면 다리의 길이만큼 통과하는데 시간이 걸린다. 
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		//다리 건너는데 걸리는 시간
		int time=0;
		
		//현재 다리에 있는 트럭들의 무게
		int w = 0;
		
		
		for(int i=0; i<truck_weights.length; i++) {
			//1. 다리에 트럭이 한 대도 없는 경우
			//2. 다리에 트럭이 차 있는 경우
			//3. 다리에 트럭이 올라가도 괜찮은지 판별해야 하는 경우(올라가도 되는 경우, 올라가면 안되는 경우)
			
				
			while(true) {
				//1. 다리에 트럭이 전혀 없을 경우
				if(q.isEmpty()) {
					//다리를 올라간 트럭 큐에 추가
					q.add(truck_weights[i]);
					time++;
					//다리에 있는 트럭의 총 무게 업데이트
					w += truck_weights[i];
					//트럭이 다리에 올라갔으므로 다음 트럭의 순서로 넘어가야 한다. 
					break;
					
				}else {
					
					//2. 다리에 트럭이 차있을 경우
					if(q.size()==bridge_length) {
						//빠져나간 트럭의 무게 총 무게에서 빼주기 
						w -= q.poll();
						
					}else if(weight >= w + truck_weights[i]) {
						//3. 다리가 비어 있지도 다 차있지도 않은 경우 다음 트럭이 들어갈 수 있는지 확인
						//다음 트럭의 무게를 합해도 다리가 견딜 수 있는 무게인 경우
						q.offer(truck_weights[i]);
						w += truck_weights[i];
						time++;
						break;
					}else {
						//트럭이 무게로 들어오지 못하는 경우
						//0을 넣어서 앞의 트럭들을 이동시킨다. 
						q.offer(0);
						time++;
					}
					
				}
			
			}
		
		}
		//마지막 트럭이 다리에 들어올때 까지 걸리는 시간 + 마지막 트럭이 다리를 다 지나갈떄 까지 걸리는 시간(다리 길이)
		return time+bridge_length;
    }

}
