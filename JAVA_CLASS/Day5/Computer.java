package Homework2;

class Six{
    public static void main(String[] args) {

        Computer computer = new Computer();
        System.out.println(computer.getPrice());
        
    }
}

public class Computer {

    int price;

    Computer(){
        CPU cpu = new CPU(3.2,"Intel",200000);
        RAM ram = new RAM(8,40000,"SAMSUNG" );
        Monitor monitor = new Monitor(27, 300000);
        Disk disk = new Disk(1000, 80000);
        price = cpu.getPrice()+ram.getPrice() + monitor.getPrice()
            +disk.getPrice();
        }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}


class CPU{
    double speed;
    String company;
    int price;

    CPU(double speed,String company,int price ){
        this.speed = speed;
        this.company = company;
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

class RAM{
    int capacity;
    int price;
    String company;

    RAM(int capacity,int price,String company){
        this.capacity = capacity;
        this.price = price;
        this.company = company;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}

class Monitor{
    double size;
    int price;

    Monitor(double size,int price ){
        this.size = size;
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class Disk{
    int capacity;
    int price;

    Disk(int capacity,int price ){
       this.capacity = capacity;
       this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}