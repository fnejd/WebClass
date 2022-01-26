package Homework3;

public class Three {
	public static void main(String[] args) {

        Animal tiger = new Tiger();
        tiger.setName("Jungle");
        tiger.setLocation("land");
        tiger.print();

        Human hi = new Human("Peter");
        hi.loud();
        hi.silent();
        
    }

}

interface Speak{
    void silent();
    void loud();
}

class Human implements Speak{
    String name;

    Human(String name){
        this.name = name;
    }

    public void silent(){
        System.out.println(name + " Be Quiet");
    }

    public void loud(){
        System.out.println(name + " Speak Up");
    }

}

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

class Tiger extends Animal{
	String species ="Tiger";

    void Sound(){
        System.out.println("Roar");
    }

}