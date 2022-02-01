import java.util.Scanner;

public class Factorial_Practice {


    //1. For문으로 Factorial 만들기
   static int FactorialFor(int max){

       int result = 1;
       for(int i= max ; i>=1; i--){
           result *= i;
       }
       return result;

   }

   //2. While문으로 Factorial 만들기
    static int FactorialWhile(int max){
       int result = 1;
       while(true){

           if(max<=1) return result;
           result *= max;
           max--;
       }
    }

    //3. 재귀로 Factorial 만들기
    // (1)반환 값이 void 인 경우, 결과값을 num에 저장
    static int num = 1;
    public static void FactorialRec1(int max){
        if(max<=1){
            return;
        }
        num *= max;
        FactorialRec1(max-1);

    }

    //(2)반환 값이 있는 경우
    public static int FactorialRec2(int max){
        if(max<=1) {
            return 1;
        }
        return max* FactorialRec2(max-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();

        System.out.println("For문으로 만든 Factorial -> "+ FactorialFor(max));
        System.out.println("While문으로 만든 Factorial -> "+ FactorialWhile(max));
        FactorialRec1(max);
        System.out.println("재귀로 만든 Factorial- 반환 값이 void 인 경우-> " + num);
        System.out.println("재귀로 만든 Factorial- 반환 값이 있는 경우-> " + FactorialRec2(max));

    }
}
