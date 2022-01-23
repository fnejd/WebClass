
public class num_4673 {
	public static void main(String[] args) {
		
		
		// 셀프 넘버 
		
		//셀프 넘버인지를 체크할 배열
		//셀프 넘버는 배열안에 값이 0
		int[] a = new int[10001];
		
		
		int  tmp = 0;
		
		for(int i=1; i<=10000; i++) {
			
			//배열 안의 값이 0이 아니면 셀프 넘버가 아니여서 건너뛴다. 
			if(a[i]!=0) {
				continue;
			}
			
			//i의 d(i)을 구해서 인덱스가 d(i)인 곳의 값을 증가시킨다.
			// ex.3 -> 6 -> 12 -> 15 -> 21 -> 24 -> 30 ->33 -> 39 -> 51 .. 을 인덱스로 갖는 곳의 값을 증가시켜준다. 
			//6, 12, 15, 21, 24... 는 셀프 넘버가 아닌 숫자이므로 나중에 건너뛰기 위해서 해당 인덱스의 값을 증가시킨다. 
			
			for(int dn =i; dn <=10000;) {	
				//각 자리의 수를 더하기 위해 tmp 사용
				tmp = dn;
				while(tmp > 0) {
					dn += tmp % 10;
					tmp /= 10;				
				}
				
				if(dn <= 10000) {
					a[dn]++;
				}
				
			}
			
			System.out.println(i);
			
		}
		
		
	}

}
