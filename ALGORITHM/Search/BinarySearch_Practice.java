import java.util.Scanner;

public class BinarySearch_Practice {

    //이진 검색
    //중요 -> 검색하는 대상이 되는 배열 안에 데이터가 정렬이 되어 있어야 한다.
    
    static int binarySearch(int[] data, int n, int key){
        
        int left = 0;
        int right = n-1;
        
        do{
            //중간 index인 center 구하기
            int center = (left+right)/2;
            
            if(data[center] == key){
                //찾는 값 발견
                //찾는 값이 있던 위치 return 
                return center;
            }else if(data[center] <key){
                //찾는 값이 중간 index보다 큰 경우
                //찾는 값이 현재 center보다 뒤쪽에 있으므로 left를 center+1로 조정
                left= center +1;
            }else{
                //찾는 값이 중간 index보다 작은 경우
                //찾는 값이 현재 center보다 앞쪽에 있으므로 right를 center-1로 조정
                right = center-1;
            }
            
        }while(left<=right);
        
        return -1;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("데이터의 개수: ");
        int n = Integer.parseInt(sc.nextLine());

        //배열 생성
        int[] data = new int[n];

        //데이터 입력
        for(int i=0; i<n; i++){
            System.out.println("data["+ i+ "]=");
            data[i] = sc.nextInt();
        }

        //찾을 숫자를 입력 받는다.
        System.out.println("검색할 데이터: ");
        int key = sc.nextInt();

        int result = binarySearch(data,n,key);

        if(result>=0){
            System.out.println(key+"는 " +result +"번째 에 있습니다.");
        }else{
            System.out.println("찾는 데이터가 없습니다. ");
        }

        sc.close();
    }
}
