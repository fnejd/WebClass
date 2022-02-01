import java.util.Scanner;

public class Queue_Practice2 {

    //enqueue: 큐에 데이터 넣기
    //dequeue: 큐에서 데이터 꺼내기
    //front: 데이터를 꺼내는 쪽, 맨 처음 요소의 인덱스
    //rear: 데이터를 넣는 쪽, 맨 끝 요소의 하나 뒤의 인덱스

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //큐의 용량을 9로 설정
        QueueInt queue =  new QueueInt(9);

        while(true){
            System.out.println("[메뉴] 1.enqueue, 2.dequeue, 3.peek, 4.info, 5.isFull, 6.isEmpty, 7.findData , 8. clear, 9. end ");
            //메뉴 입력 받기
            int menu = Integer.parseInt(sc.nextLine());

            if(menu==9){
                break;
            }else{

                switch (menu){

                    //enqueue
                    case 1:
                        System.out.print("큐에 넣을 데이터를 입력하세요: ");
                        int data = Integer.parseInt(sc.nextLine());
                        try{
                            int result = queue.enqueue(data);
                        }catch (QueueInt.QueueOverFlowException qofe){
                            System.out.println("Queue is full");
                        }
                        break;

                    //deqeue
                    case 2:
                        try{
                            int result = queue.dequeue();
                            System.out.println("큐에서 가져온 데이터는 "+ result);
                        }catch(QueueInt.QueueEmptyException qee){
                            System.out.println("Queue is empty");
                        }
                        break;

                    //peek
                    case 3:
                        try{
                            int result = queue.peek();
                            System.out.println("큐의 제일 앞 데이터는 "+ result);
                        }catch (QueueInt.QueueEmptyException qee){
                            System.out.println("Queue is Empty");
                        }
                        break;

                    //info
                    case 4:
                       System.out.println("큐의 크기: "+ queue.getCapacity());
                        System.out.println("데이터의 수: "+ queue.getSize());
                        System.out.println("front의 index: "+ queue.getFrontIndex());
                        System.out.println("rear의 index: "+ queue.getRearIndex());
                        try {
                            System.out.println("처음 값: " + queue.peek());
                        }catch(Exception e){
                            System.out.println("Queue is Empty");
                        }
                        System.out.println("마지막 값: "+ queue.getRearData());
                        break;

                    //isFull
                    case 5:
                        if(queue.isFull()) {
                            System.out.println("Queue is Full");
                        }else {
                            System.out.println("Not Full");
                        }
                        break;

                    //isEmpty
                    case 6:
                        if(queue.isEmpty()){
                            System.out.println("Queue is Empty");
                        }else{
                            System.out.println("Not Empty");
                        }
                        break;

                    //findData
                    case 7:
                        System.out.println("찾고자 하는 데이터를 입력하시오: ");
                        int find = Integer.parseInt(sc.nextLine());
                        int result = queue.indexOf(find);
                        if(result>=0){
                            System.out.println("찾는 데이터의 index는 "+ result+"입니다.");
                        }else{
                            System.out.println("찾는 데이터는 큐에 없습니다. ");
                        }

                        break;

                    //clear
                    case 8:
                        queue.clear();
                        break;

                    default:
                        System.out.println("메뉴를 잘못 입력하였습니다. ");
                }
            }

        }

        System.out.println("Program is over");

    }


}

class QueueInt{

    //큐의 크기
    int capacity;

    //데이터 저장할 배열
    int[] queue;

    //제일 앞의 위치
    int front;

    //마지막 위치
    int rear;

    //큐에 있는 데이터의 개수
    int cnt;

    //생성자
    public QueueInt(){

    }

    public QueueInt(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        //멤버변수는 초기값이 default
        //정수 - 0
        //front = rear = cnt = 0;
     }



     //큐에 데이터 추가
    public int enqueue(int data) throws QueueOverFlowException{
        //큐가 데이터가 가득찼을 경우 예외 발생
        if(capacity <= cnt){
            throw new QueueOverFlowException();
        }

        //큐에 데이터 넣기
        queue[rear++] = data;
        //큐에 들어있는 데이터 개수 증가
        cnt++;

        //큐를 링형으로 만들어서 rear가 capacity와 같아지면 rear를 0으로 조정
        if(rear == capacity){
            rear = 0;
        }

        return data;

    }

    //큐에서 데이터 꺼내기
    public int dequeue() throws QueueEmptyException{

        //큐에 데이터가 없을 경우 예외 발생
        if(cnt<=0){
            throw new QueueEmptyException();
        }
        //큐에서 데이터 꺼내기
       int data = queue[front++];
        //큐에 들어있는 데이터 개수 감소
        cnt--;

        //큐를 링형으로 만들어서 front가 capacity와 같아지면 front를 0으로 조정
        if(front==capacity){
            front=0;
        }
        //꺼내진 데이터
        return data;
    }

    //큐의 제일 앞 데이터가 무엇인지 보기
    public int peek() throws QueueEmptyException{

        //큐가 비어 있을 경우 예외 발생
        if(cnt<=0){
            throw new QueueEmptyException();
        }
        return queue[front];
    }

    //큐의 크기
    public int getCapacity(){
        return capacity;
    }

    //큐에 들어 있는 데이터의 개수
    public int getSize(){
        return cnt;
    }
    
    //큐의 front 인덱스
    public int getFrontIndex(){
        return front;
    }
    
    //큐의 rear 인덱스
    public int getRearIndex(){
        return rear;
    }

    //큐의 마지막 데이터가 무엇인지 보기
    public int getRearData(){
        if(rear==0){
            return queue[capacity-1];
        }else{
            return queue[rear-1];
        }
    }

    //큐에 데이터가 가득 찼는지 확인
    public boolean isFull(){
        return cnt>=capacity;
    }

    //큐에 데이터가 비어있는지 확인
    public boolean isEmpty(){
        return cnt<=0;
    }

    //큐에서 찾고자 하는 데이터의 index 반환
    public int indexOf(int data){
        int idx;
        for(int i=0; i<cnt; i++){

            idx = (i+front)%capacity;

            if(queue[idx]==data){
                return idx;
            }

        }
        return -1;
    }

    //큐를 비운다.
    public void clear(){
        cnt = front = rear = 0;
    }

    //큐가 비어 있을 때 예외 클래스
    class QueueEmptyException extends RuntimeException{
        QueueEmptyException(){}
    }

    //오버플로우 발생 시 처리할 예외
    class QueueOverFlowException extends RuntimeException{
        QueueOverFlowException(){}
    }


}
