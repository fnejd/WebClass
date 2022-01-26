package Homework3;

//과제1) Runnable 인터페이스를 상속받은 Human 클래스를 만드시오. (기본)
public class One {
    public static void main(String[] args) {

        Human bear = new Human("Rachael");
        bear.Name();
        System.out.println(bear.name + "'s distance : " + bear.Distance(2) + "km");
        System.out.println(bear.jump());

        Human tiger = new Human("Monica");
        tiger.Name();
        System.out.println(tiger.name + "'s distance : " + tiger.Distance(3) + "km");
        System.out.println(tiger.jump());


        
    }
    
}

interface Runnable{
    public static final int speed = 100;
    public abstract double Distance(double time);
    public abstract String jump();

}

class Human implements Runnable{

    String name;
    Human(){
        this.name = "Who";
    }
    Human(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    public void Name(){
        System.out.println("Name : " + name);
    }

    public double Distance(double time){

        double distance = time * speed;
        return distance;
    }

    public String jump(){

        String sentence;
        sentence = this.name + " jumped!";
        return sentence;
    }

}

