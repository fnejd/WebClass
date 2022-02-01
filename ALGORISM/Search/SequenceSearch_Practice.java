import java.util.Scanner;

public class SequenceSearch_Practice {

    //for문 이용
    static int linearSearch1(int[] data, int n, int key){

        for(int i=0; i<n; i++){

            //찾는 값 있으면 index return
            if(data[i]==key){
                return i;
            }
        }
        //배열 안에 찾는 값이 없을 경우 -1 return
        return -1;
    }


    //while문 이용
    static int linearSearch2(int[] data, int n, int k){
        int i=0;
        while(true){

            if(i==n){
                return -1;
            }
            if(k == data[i]){
                return i;
            }

            i++;
        }
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

        //for문으로 데이터를 찾는 방법
        int idx1 = linearSearch1(data,n,key);

        if(idx1>=0){
            System.out.println(key + "는 " + idx1 + "에 있습니다.");
        }else{
            System.out.println(key + "는 존재하지 않는 데이터 입니다.");
        }

        //while문으로 데이터를 찾는 방법
        int idx2 = linearSearch1(data,n,key);
        if(idx2>=0){
            System.out.println(key + "는 " + idx2 + "에 있습니다.");
        }else{
            System.out.println(key + "는 존재하지 않는 데이터 입니다.");
        }



    }

}
