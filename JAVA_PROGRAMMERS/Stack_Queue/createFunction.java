import java.util.ArrayList;


public class createFunction {

	public static void main(String[] args) {
		
		//스택/큐  -> 1.기능개발 (level 2)
		
		int[] progresses = {95,90,99,99,80,99};
		int[] speeds = {1,1,1,1,1,1};
		
		//int[] progresses = {93,30,55};
		//int[] speeds = {1,30,5};
		
		for(int i: solution(progresses,speeds)) {
			System.out.println(i);
		}
		

	}
	
	
	
	public static int[] solution(int[] progresses, int[] speeds) {
		
		//작업 완료 기준
		final int finish = 100;
		
		//배포 개수
		int cnt = 0;
		
		//작업 끝내는데 걸리는 기간
		int day;
		
		//배포마다 몇 개 기능이 배포되는지 담을 ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0; i<progresses.length; i++) {
			
			
			//이미 배포 되었으면 고려할 필요가 없고 다음 차례로 넘기기 
			//cnt에는 기존 배포에 몇개가 배포되었는지가 저장되어 있다. 
			if(cnt>1) {
				
				cnt--;
				continue;
				
			}
			
			
			//작업을 끝내는데 걸리는 일 수 구하기 
			//남은 작업이 하루 개발 속도로 나누어지지 떨어지지 않으면 하루 더 걸란다.
			if(finish-progresses[i]%speeds[i]==0) {
				
				day = finish-progresses[i]/speeds[i];
				
			}else {
				day = finish-progresses[i]/speeds[i] + 1;
			}
			
        	
			
			//배포 기준의 되는 작업
			cnt=1;
			
			for(int j=i+1; j<progresses.length; j++) {
				
				//현재 배포되는 기준이 되는 작업이 끝나는 기간 안에 이후의 작업들이 끝나는지 확인 
				if(finish-progresses[j]<=day*speeds[j]) {
					//남은 작업 진도, 작업이 끝나는 기간안에 진행되는 작업의 진도 비교
					
					//배포 기준이 되는 작업의 완료기간까지 완료 가능하면 배포 기능 개수 증가
					cnt ++;
					
				}else {
					//완료 불가능하면 이후는 확인할 필요 없다.
					break;
				}
				
			}
			
			//한번에 배포되는 기능의 수 추가하기 
			list.add(cnt);
			
        	
        }
		
		//ArrayList를 int 배열로 변환
		int[] answer = list.stream().mapToInt(i->i).toArray();
		
		
        return answer;
        
        
    }

}
