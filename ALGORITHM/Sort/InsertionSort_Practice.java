import java.util.Random;

public class InsertionSort_Practice {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[10];

        for(int i=0; i<arr.length;  i++){
            arr[i] = random.nextInt(100); //0~99
        }

        System.out.println("정렬 전-> ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("정렬 후->");

        InsertionSort(arr,arr.length);
        for(int i: arr){
            System.out.print(i + " ");
        }

    }

    public static void InsertionSort(int[] arr, int n){

        for(int i=0; i<n; i++){

            int tmp = arr[i];
            int j;

            //arr[j-1]>tmp && j>0 가 되면 j가 0일 때 j-1 실행하면서 에러가 난다
            for(j=i ; j>0 && arr[j-1]>tmp; j--){
                arr[j]=arr[j-1];
            }
            arr[j] = tmp;
        }
    }
}
