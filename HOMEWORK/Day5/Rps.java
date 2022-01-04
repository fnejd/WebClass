package Homework2;

import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        Start start = new Start();
        System.out.println("가위 바위 보");
        System.out.println("숫자를 입력하시오");
        System.out.println("0: 가위 1: 바위 2: 보");
        start.play();
        
    }
}

class Start {
    
    //Player 객체 생성 
    Player p1 = new Player();
    Player p2 = new Player();

    void play() {
        p1.rps();
        p2.rps();

        if (p1.what == 0) {
            if (p2.what == 0) {
                System.out.println("무승부");
            } else if (p2.what == 1) {
                System.out.println("p1 승리");
            } else {
                System.out.println("p2 승리");
            }
        } else if (p1.what == 1) {
            if (p2.what == 0) {
                System.out.println("p1 승리");
            } else if (p2.what == 1) {
                System.out.println("무승부");
            } else {
                System.out.println("p2 승리");
            }

        } else {
            if (p2.what == 0) {
                System.out.println("p2 승리");
            } else if (p2.what == 1) {
                System.out.println("p1 승리");
            } else {
                System.out.println("무승부");
            }

        }

        System.out.println("p1은 " + p1.rps + "를 냈고 p2는 " + p2.rps + "를 냈다");
    }

}

class Player {
    int what;
    String rps;

   
    Scanner sc = new Scanner(System.in);
    
    void rps() {
        
         //가위바위보 입력 받기
        what = sc.nextInt();

        if (what == 0) {
            rps = "가위";
        } else if (what == 1) {
            rps = "바위";
        } else {
            rps = "보";
        }
    }
}