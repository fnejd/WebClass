import java.util.Scanner;

public class num_4948 {
    public static void main(String[] args) {

    	// 베르트랑 공준
    	
    	
        Scanner sc = new Scanner(System.in);

        //소수 count
        int cnt = 0;

        while(true){

        	//숫자 입력 받기 
            int n = Integer.parseInt(sc.nextLine());

            //0입력 받으면 종료
            if(n== 0){
                break;
            }

            cnt = 0;
            
            //소수 여부 담는 배열 (false - 소수)
            boolean[] arr= new boolean[2*n+1];

            arr[1] = true;

            for(int i=2; i<=2*n; i++) {
    			
    			if(arr[i]==true) {
    				continue;
    			}
    			
    			for(int j=i+i; j<=2*n; j = j+i) {
    				arr[j] = true;
    			}
    			
    		}
            
            //소수이면 false, 소수의 개수 세기
            for(int i=n+1; i<=2*n; i++) {
            	if(arr[i]==false){
                    cnt++;
                }
                
            }
            System.out.println(cnt);

        }

     sc.close();
    }


}
