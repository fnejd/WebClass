
public class mocktest {

	public static void main(String[] args) {
		
		
		// 완전 탐색 -> 1. 모의 고사(Level 1)
		
		int[] answers = {1,2,3,4,5};
		
		for(int i: solution(answers)) {
			System.out.println(i);
		}

		
		

	}
	
	 public static int[] solution(int[] answers) {
	        
		//가장 많은 문제를 맞힌 사람이 누구인지 담을 배열 선언
	        int[] arr;
	        
	        //각 수포자가 문제 찍는 방식을 배열에 저장
	        int[] num1 = {1,2,3,4,5};
	        int[] num2 = {2,1,2,3,2,4,2,5};
	        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
	        
	        //최고 점수를 받은 사람의 수 
	        int num=0;
	        
	        //각 수포자가 몇 문제를 맞췄는지 담을 배열
	        int[] cnt = new int[3];
	        
	        //각 수포자가 몇 문제를 맞췄는지 count
	        for(int i=0; i<answers.length; i++) {
	        	
	        	if(num1[i%5]==answers[i]) {
	        		cnt[0]++;
	        	}
	        	
	        	if(num2[i%8]==answers[i]) {
	        		cnt[1]++;
	        	}
	        	if(num3[i%10]==answers[i]) {
	        		cnt[2]++;
	        	}
	        	
	        }
	        
	        //수포자들이 맞춘 개수 중 최고 점수를 max에 저장
	        int max = Math.max(cnt[0], cnt[1]);
	        max = Math.max(max, cnt[2]);
	        
	        //최고 점수를 맞은 사람이 몇 명인지 num에 저장
	       for(int i=0; i<cnt.length;i++) {
	    	   if(max==cnt[i]) {
	    		   num++;
	    	   }
	       }
	      
	       //가장 많은 문제를 맞힌 사람이 누구인지 담을 배열 생성
	      arr = new int[num];
	       
	      //최고점을 받았다면 배열에 누구인지 저장
	      int idx = 0; 
	      for(int i=0; i<cnt.length; i++) {
	    	  if(max==cnt[i]) {
	    		  arr[idx++] = i+1;
	    	  }
	      }
	        
	       
	      return arr;
	        
	    }

}
