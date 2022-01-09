package Homework3;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

//과제4) Airplane 추상 클래스를 만들고 출발날짜과 도착날짜을 Calendar 객체로 받는 setter를 만드시오.
//main에서 객체를 생서후 setter를 통해서 출발날짜 2022년 2월 1일, 도착날짜 2022년 2월 2일로 지정하시오.(기본)

/*과제5) 출발지와 도착지를 멤버변수로 만들고, 
추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오.
출발날짜와 도착날짜를 getter로 만들고, 
02-01-2021 형식으로 출력하는 메소드를 만드시오.(심화) */

/*과제6) Airplane 추상 클래스에 String flight() 추상 메소드를 구현하시오. 자식 클래스에서 도착지가 국내선 또는 국제선에 따라서
Airplane 멤버변수 isDomestic 의 값을 변경하도록 구현하시오.(심화)*/

public class Plane{

	public static void main(String[] args) {

        //4
		Journey day = new Journey();
        day.setStartDay(2022, 2, 1);
        day.setArrivalDay(2022, 2, 1);
        System.out.println("출발시간 ");
        day.printStartDay();
        System.out.println("도착시간 ");
        day.printArrivalDay();

       day.insertDest("싱가폴");
       System.out.println(day.flight());
       System.out.println("isDomestic : " + day.isDomestic);
       System.out.println("---------");
       
       day.insertDest("김포");
       System.out.println(day.flight());
       System.out.println("isDomestic : " +day.isDomestic);
       System.out.println("---------");
       
       day.insertDest("하와이");
       System.out.println(day.flight());
       System.out.println("isDomestic : " + day.isDomestic);
       
        
  
    }

}

abstract class Airplane{
	
    //4
		Calendar startday = Calendar.getInstance();
	    Calendar arrivalday = Calendar.getInstance();
    
    //5
    String destination;
    String departure;
    abstract void insertDest(String des);
    
    
    //6
    String isDomestic;
    abstract String flight();
    
}

class Journey extends Airplane{

	//5
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    
    String[] Domestic = new String[] {"김포","인천","김해","제주","울산"};
    String[] Foureign = new String[] {"도쿄","상하이","홍콩","싱가폴","쿠울라룸프"};
    
    ArrayList<String> Dom = new ArrayList<>(Arrays.asList(Domestic));
    ArrayList<String> Fogn = new ArrayList<>(Arrays.asList(Foureign));
    

    //4
    void setStartDay(int year, int month, int date){
        startday.set(Calendar.YEAR,year);
        startday.set(Calendar.MONTH,month-1);
        startday.set(Calendar.DATE, date);
    }

    void setArrivalDay(int year, int month, int date){
        arrivalday.set(Calendar.YEAR,year);
        arrivalday.set(Calendar.MONTH,month-1);
        arrivalday.set(Calendar.DATE, date);
    }
    
    

    //5
    Date getStartDay() {
           	return startday.getTime();
    }

    Date getArrivalDay() {
        return arrivalday.getTime();
    }
    

    //5
    void printStartDay(){
    	
    	System.out.println(sdf.format(getStartDay()));
    }

    void printArrivalDay(){
    	
    	System.out.println(sdf.format(getArrivalDay()));
    }
    
    //5
    String type;
    
    void insertDest(String des) {
    	
    	destination = des;
    	
    	if(Dom.contains(destination)) {
   		 	type = "국내선";
  
   	 	}
   	 	else if(Fogn.contains(destination)) {
   	 		type = "국외선";
   		 
   	 	}
   	 	else {
   	 		type = "목적지 오류";
   	 		destination = " 없는 목적지 ";
   		 
   	 	}
   	
    }

    String sent;
    
    //6
     String flight(){
    	 if(type.equals("국내선")) {
    		 isDomestic = "YES";
    	 }
    	 else if(type.equals("국외선")) {
            isDomestic = "NO";
    	 }
         else{
            isDomestic = "WRONG DESTINATION";
         }
         sent = "목적지 : " + destination + " / "+ type + "입니다. ";
    	 return sent;

     }

	

	
}