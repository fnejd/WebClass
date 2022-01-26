package Homework2;

public class Lotto {
    public static void main(String[] args) {

        Number num = new Number();
        num.pickNum();
        num.order();
        num.print();
        
    }
    
}

class Number{
    int[] arr = new int[6];
    
    //6개 번호 뽑기 
    void pickNum(){
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int)(Math.random() * 45) + 1;
        }
    }

    //크기 순으로 정렬 
    void order(){
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
                int minIndex = i;
                for(int j = i+1; j<arr.length; j++){
                    if(arr[minIndex] > arr[j]){
                        minIndex = j;
                    }
                }
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
    }

    //숫자 6개 출력 
    void print(){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
    

