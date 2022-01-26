package Homework2;

public class One {
    public static void main(String[] args) {
        
        USA usa = new USA();
        System.out.println(usa.area);
        System.out.println(usa.NumberOfStates);

        UK uk = new UK();
        System.out.println(uk.Island);

        Australia aus = new Australia();
        System.out.println(aus.desert);
        
    }

    
}
//1 - Class Nation 생성 
class Nation{
    
    //1 - 나라이름, 면적, 인구수 멤버변수로 생성 
    //3 - 나라이름은 private 지정, 면적과 인구수는 public 으로 지정
    private String country;
    public double area;
    public int population;

    //4 - 행성이름을 만들고 static으로 지정
    static String planetName ;

    //1- 나라이름변경(), 면적변경(), 인구수변경() 메소드 생성
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    
    Nation(String country, double area, int population){
        this.country = country;
        this.area = area;
        this.population = population;
    }


}


//2- Class Nation 을 상속한 나라를 3개 생성
//2 -나라별로 특수한 멤버변수 하나와 메소드 하나를 생성
class UK extends Nation{
    boolean Island;

    UK(){
        super("UK",24361000,68497913);
        Island = true;
    }

    public boolean getIsland() {
        return Island;
    }

    public void setIsland(boolean Island) {
        this.Island = Island;
    }

    void Capital(){
        System.out.println("Capital of UK is London");
    }

}

class USA extends Nation{

    int NumberOfStates;

    USA(){
        super("USA",983151000,332915074);
        NumberOfStates = 50;
    }

    public int getNumberOfStates() {
        return NumberOfStates;
    }

    public void setNumberOfStates(int NumberOfStates) {
        this.NumberOfStates = NumberOfStates;
    }

    void location(){
        System.out.println("NorthAmerica");
    }
    
}

class Australia extends Nation{

    boolean desert;

    Australia(){
        super("Australia",774122000,25788217);
        desert = true;
    }

    public boolean getDesert() {
        return desert;
    }

    public void setDesert(boolean desert) {
        this.desert = desert;
    }

    void Animal(){
        System.out.println("Koala, Kangaroo .... ");
    }
    
}