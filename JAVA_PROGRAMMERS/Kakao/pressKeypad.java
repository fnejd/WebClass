
public class pressKeypad {

	public static void main(String[] args) {
		
		
		//2020 카카오 인턴십 -> 키패드 누르기 (level 1)
		
		//int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		int[] numbers = {7,0,8,2,8,3,1,5,7,6,2};
		String hand = "left";
		
		System.out.println(solution(numbers, hand));

	}
	
	public static String solution(int[] numbers, String hand) {
        
		
		//어떤 손가락으로 눌렀는지 결과값
		String result = "";
		
		//*로 시작하는 왼손가락 위치를 숫자로 변환
		int leftPos = 10;
		//#로 시작하는 오른손가락 위치를 숫자로 변환
		int rightPos = 12;
		
		for(int i=0; i<numbers.length; i++) {
			
			
			if(numbers[i]==1 || numbers[i]==4||numbers[i]==7) {//숫자가 1,4,7일 경우 왼손가락 사용
				//결과값에 사용한 손가락 추가
				result+="L";
				
				//현재 왼손가락의 위치 저장
				leftPos = numbers[i];
				
			}else if(numbers[i]==3|| numbers[i]==6 || numbers[i]==9) { //숫자가 3,6,9일 경우 오른손가락 사용
				//결과값에 사용한 손가락 추가
				result+="R";
				
				//현재 오른손가락의 위치 저장
				rightPos = numbers[i];
				
			}else { //숫자가 2,5,8,0 일 경우 현재 키패드에서 가까운 손가락 사용
				
				//숫자가 0일 경우 11으로 변환 (거리 계산을 위해)
				if(numbers[i]==0) {
					numbers[i] = 11;
				}
				
				//현재 키패드에서 왼손가락, 오른손가락과의 거리 구하기
				//같은 y축 상 거리 : 숫자의 차이 / 3
				//같은 x축 상 거리 : 숫자의 차이 % 3
				int leftDis = Math.abs(numbers[i]-leftPos)/3 + Math.abs(numbers[i]-leftPos)%3;
				int rightDis = Math.abs(numbers[i]-rightPos)/3 + Math.abs(numbers[i]-rightPos)%3;
				
				
				if(leftDis>rightDis) { //오른손가락이 가까울 경우 
					result += "R";
					rightPos = numbers[i];
				}else if(leftDis<rightDis) { //왼손가락이 가까울 경우
					result += "L";
					leftPos = numbers[i];
				}else { //현재 키패드에서 오른손가락과 왼손가락의 거리가 동일할 경우
					
					if(hand.equals("right")) { //오른손잡이 인경우 오른손가락 사용
						result += "R";
						rightPos = numbers[i];
						
					}else {	 //왼손잡이인 경우 왼손가락 사용
						result +="L";
						leftPos = numbers[i];
					}
				}
				
			}
		}
		
		return result;
		
    }
	
	

}
