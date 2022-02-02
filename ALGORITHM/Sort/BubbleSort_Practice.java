import java.util.Random;

public class BubbleSort_Practice {

    public static void main(String[] args) {

        int arr[] = new int[10];

        Random random = new Random();

        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(100)+1;  //1~100까지
        }

        System.out.println("정렬 전-> ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("정렬 후->");

        bubbleSort(arr,arr.length);
        for(int i: arr){
            System.out.print(i + " ");
        }


    }

    public static void bubbleSort(int arr[], int n){
        
        //오름차순 정렬
        for(int i=0; i<n;i++){
            for(int j=n-1;j>0;j--){

                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }

    }

    public static void swap(int arr[], int idx1, int idx2){

        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }


}
