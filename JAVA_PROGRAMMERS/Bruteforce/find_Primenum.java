import java.util.HashSet;


public class find_Primenum {

	public static void main(String[] args) {
		
		String numbers="011";
		
		System.out.println(solution(numbers));
	}
	
	
	public static int solution(String numbers) {
		
		//set은 중복을 허용하지 않는다. 
		HashSet<Integer> set = new HashSet<>();
		
		int cnt = 0;
		
		//모든 가능한 조합 구하기
		perm("",numbers,set);
		
		//소수 개수 세기
		for(int i: set) {
			if(isPrime(i)) {
				cnt++;
			}
		}
		
		return cnt;
        
    }
	
	public static void perm(String checked, String unchecked, HashSet<Integer> set) {
		
		//가능한 조합을 set에 추가
		//남은 숫자 중 한 개를 추가해 새로운 조합 만들기
		
		//빈 string인 경우를 제외하고 set에 추가
		if(!checked.equals("")) {
			set.add(Integer.valueOf(checked));
		}
		
		for(int i = 0; i<unchecked.length(); i++) {
			//아직 추가되지 않았던 문자형인 숫자들에서 한 개를 선택해 추가 
			perm(checked + unchecked.charAt(i),unchecked.substring(0,i)+unchecked.substring(i+1),set);
		}
	
		
	}
	
	public static boolean isPrime(int num) {
		
		//num이 0,1이면 소수가 아니므로 false
		if(num ==0 || num==1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			//약수가 있으므로 false
			if(num%i==0) {
				return false;
			}
		}
		
		
		return true;

	}

}
