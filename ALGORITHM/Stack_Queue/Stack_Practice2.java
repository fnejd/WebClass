import java.util.Scanner;


public class Stack_Practice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("스택의 크기를 입력하세요: ");
        int size = Integer.parseInt(sc.nextLine());

        StackInt stack = new StackInt(size);

        while(true){

            System.out.println("1.push  2.pop  3.peek  4.print  5.search  6.isEmpty 7.isFull  8.Exit");
            int order = Integer.parseInt(sc.nextLine());

            if(order == 8){
                break;
            }

            switch(order){

                //push
                case 1:
                    System.out.println("스택에 추가할 데이터를 입력하세요. ");
                    int num = Integer.parseInt(sc.nextLine());

                    try{
                        stack.push(num);
                    }catch (StackInt.OverFlowStackException ofse){
                        System.out.println("Stack is full");
                    }
                    break;

                //pop
                case 2:
                    try{
                        int result = stack.pop();
                        System.out.println("스택에서 pop 한 값은 " + result + "입니다");
                    }catch(StackInt.EmptyStackException ese){
                        System.out.println("Stack is Empty");
                    }

                    break;

                //peek
                case 3:
                    try{
                        int top = stack.peek();
                        System.out.println("스택의 제일 위의 값은 "+ top + "입니다");
                    }catch (StackInt.EmptyStackException ese){
                        System.out.println("Stack is Empty");
                    }
                    break;


                //print
                case 4:
                    stack.print();
                    break;

                //search
                case 5:
                    System.out.println("검색할 데이터를 입력하시오 : ");
                    int input = Integer.parseInt(sc.nextLine());

                    int idx = stack.indexOf(input);

                    if(idx>=0){
                        System.out.println(input + "은 스택의 "+ idx + "번째에 있습니다.");
                    }else{
                        System.out.println("스택에 없는 데이터 입니다.");
                    }

                    break;


                //isEmpty
                case 6:
                    if(stack.isEmpty()){
                        System.out.println("Stack is Empty");
                    }else{
                        System.out.println("Stack has data");
                    }
                    break;

                //isFull
                case 7:
                    if(stack.isFull()){
                        System.out.println("Stack is full");
                    }else{
                        System.out.println("Stack is not full");
                    }
                    break;

            }

        }

        System.out.println("Program is Over");

    }

}


class StackInt{

    //스택의 크기
    int capacity;
    //안에 담을 배열
    int arr[];
    //스택에 채워진 데이터 개수
    int point;

    StackInt(){

    }

    //스택 생성자
    //스택의 크기를 인자로 받는다.
    StackInt(int size){
        capacity = size;
        point = 0;
        arr = new int[capacity];
    }

    //스택의 데이터 수 리턴
    int getSize()
    {
        return point;
    }

    //스택의 크기 리턴
    int getCapacity(){
        return capacity;
    }

    //스택에 push, 데이터 추가
    public void push(int data) throws OverFlowStackException{

        if(point>=capacity){
            throw new OverFlowStackException();
        }
        arr[point++] = data;
    }

    //스택의 제일 위 데이터 리턴
    public int peek() throws EmptyStackException{

        if(point<=0){
            throw new EmptyStackException();
        }
        return arr[point-1];
    }

    //스택의 모든 데이터 출력
    public void print(){
        if(point<=0){
            System.out.println("스택이 비어 있습니다.");
        }else{
            for(int i=0; i<point;i++){
                System.out.println(i + "번째 데이터 " + arr[i]);
            }
        }
    }

    //제일 위의 데이터 pop
    public int pop() throws EmptyStackException{

        if(point<=0){
            throw new EmptyStackException();
        }

        return arr[--point];
    }

    //스택이 비어 있는지
    //--
    public boolean isEmpty(){

        return point<=0;
    }

    //스택이 가득찼는지
    //--
    public boolean isFull(){

        return point >= capacity;
    }

    //데이터 찾아서 index 리턴
    public int indexOf(int data){

        //먼저 pop되는 데이터를 찾기 위해
        for(int i=point-1; i>=0; i++){
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }


    //오버플로우 발생 시 예외 처리 클래스
    class OverFlowStackException extends RuntimeException{

        public OverFlowStackException(){}
    }

    //스택이 비어 있을 때 발생시킬 예외 처리 클래스
    class EmptyStackException extends RuntimeException{

        public EmptyStackException() {}
    }


}
