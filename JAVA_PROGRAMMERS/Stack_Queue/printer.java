
import java.util.LinkedList;

import java.util.Queue;

public class printer {

	public static void main(String[] args) {
		
		
		//스택/큐 -> 2.프린터 (level2)

		int[] priorities = {2,1,3,2};
		int location = 2;

		System.out.println(solution(priorities,location));

	}
	
	public static int solution(int[] priorities, int location) {
		
		//중요도가 높은 순으로 인쇄
		//큐에 있는 element의 중요도가 가장 높은지 확인 -> 인쇄
		
		//중요도가 가장 높은 작업(인쇄되는 작업)이 내가 요청한 문서가 맞는지 확인
		
		//요청한 문서가 몇번째로 인쇄되는지 return 
		
		Queue<Element> q = new LinkedList<Element>();
		
		//queue에 element 추가 (중요도, 대기 목록 위치)
		for(int i=0; i<priorities.length; i++) {
			q.add(new Element(priorities[i],i));
		}
		
		//인쇄되는 순서
		int cnt = 0;
		
		
		while(!q.isEmpty()) {
			
				//큐에서 element 꺼내기
				//큐에서 꺼낸 element의 가장 중요도가 크면 큐에 다시 넣지 않는다. 
				Element e = q.poll();
								
				
				//큐에서 꺼낸 element 보다 중요도가 큰 element가 있는지 체크
				boolean flag = false;
				
				
				for(Element s : q) {
					if(e.priority <s.priority) {
						//큐에 꺼낸 element보다 중요도가 큰 것이 있다.
						
						flag = true;
						break;
					}
				}
				
				
				if(flag) {
					//꺼냈던 element를 다시 큐의 마지막에 추가
					q.add(e);
				}else{
					//꺼냈던 element가 큐에서 가장 우선순위가 높다. -> 인쇄
					
					//안쇄되는 순서 증가
					cnt++;
					
					//꺼냈던 element의 location이 찾는 문서의 location과 일치하는지 확인
					if(e.location == location) {
						//일치하면 요청한 문서가 몇번째로 인쇄되는지 알아냈다
						break;
					}
				}	
		
		}
		
		return cnt;
        
    }
	
	static class Element{
		int priority;
		int location;
		
		public Element(int priority, int location){
			this.priority = priority;
			this.location = location;
		}
		
	}

}
