package Homework3;

public class Two {
    public static void main(String[] args) {

        Animal one = new Animal();
        one.setName("rabbit");
        one.setLocation("forest");
        one.print();
        
        

        Animal two = new Animal();
        two.setName("fish");
        two.setLocation("sea");
        two.print();

        Animal three = new Animal();
        three.setName("eagle");
        three.setLocation("air");
        three.print();

        Animal four = new Animal();
        four.setName("cat");
        four.setLocation("land");
        four.print();

        
        
    }
    
}

/*과제2) class Animal 을 만들고 멤버변수 name과 location을 private로 지정하고 getter와 setter를 만드시오. 
location 은 land, sea, air 만 입력 할 수 있도록 하시오.(심화)*/ 

class Animal{
    private String name = " ";
    private String location = " ";

    
    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    String getLocation(){
        return location;
    }

    void setLocation(String loc){
        if(loc.equals("land")||loc.equals("sea")||loc.equals("air")){
            this.location = loc;
        }
        
    }

    void print(){
        System.out.println("Name : " + getName());

        if(location.equals(" ")){
            System.out.println(name + "'s Location not allowed, set Location again");
        }
        else{
            System.out.println("Location: " + getLocation());
        }
    }

   



}