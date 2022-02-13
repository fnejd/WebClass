
public class stockPrice {

	public static void main(String[] args) {
		
		//스택/큐 ->  4. 주식 가격 (level 2)
		
		int[] prices = {1,2,3,2,3};
		
		for(int i: solution(prices)) {
			System.out.println(i);
		}
	

	}
	
	public static int[] solution(int[] prices) {
		
		//가격이 떨어지지 않은 기간 몇초인지 담을 배열
		int[] answers = new int[prices.length];
		
		//prices 배열의 요소에서 이후의 가격들과 비교할 때 감소한 가격이 나타나기 전까지만 시간 count
		for(int i=0; i<prices.length; i++) {
			
			
			for(int j=i+1; j<prices.length; j++) {
				
				answers[i]++;
				
				//감소한 가격이 나타나면 더이상 가격이 떨어지지 않은 기간을 구할 필요가 없다. 
				if(prices[i]>prices[j]) { 
					
					break;
				}
			
			}
			

		}
		
		return answers;
    }

}
