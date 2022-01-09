import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/*과제7) ArrayList에 현재시간의 Date 객체를 입력하고, 
ArrayList의 값을 차례대로 출력하시오.(기본)*/ 

/*과제8) ArrayList에 내일시간의 Date 객체를 입력하고, 
ArrayList의 값을 차례대로 출력하시오.(심화) */

/*과제9) ArrayList에 1년 이내의 날짜를 random하게 만들어서 입력하고, 
현재 들어있는 3개의 값과 현재시간의 차이를 순차대로 출력하시오.(심화) */


public class AL {
	
	public static void main(String[] args) {
		
		//7  현재시간의 Date 객체를 입력
		ArrayList<Date> date = new ArrayList<Date>();
		Date today = new Date(0,"현재");
		date.add(today);
		
		//7  ArrayList의 값을 차례대로 출력
		for(int i=0; i<date.size();i++){
            System.out.println(date.get(i).state + " " + date.get(i).time);
        }
		
		//8  내일시간의 Date 객체를 입력
		Date tommorrow = new Date(1,"내일");
		date.add(tommorrow);
		
		
		//8  ArrayList의 값을 차례대로 출력
		for(int i=0; i<date.size();i++){
            System.out.println(date.get(i).state + " " + date.get(i).time);
        }
		
		//9 1년 이내의 날짜를 random하게 만들어서 입력
		Random random = new Random();
		Date randomDay = new Date(random.nextInt(365)+1,"랜덤날짜");

		date.add(randomDay);
		//8  ArrayList의 값을 차례대로 출력
		for(int i=0; i<date.size();i++){
		     System.out.println(date.get(i).state + " " + date.get(i).time);
		}
		
		
		//9  현재 들어있는 3개의 값과 현재시간의 차이를 순차대로 출력
		System.out.println("랜덤날짜 - 현재 : " + diffDay(date.get(0),date.get(2)));
		System.out.println("랜덤날짜 - 내일 " + diffDay(date.get(1),date.get(2)));
		
		
		
	}
	
	static int diffDay(Date startdate, Date enddate) {
		
		long startMills = startdate.cal.getTimeInMillis();
		long endMills = enddate.cal.getTimeInMillis();
		
		int start = (int)(startMills/(60*60*24*1000));
		int end = (int)(endMills/(60*60*24*1000));
		
		return Math.abs(end-start);		
		
	
	}

}

class Date{
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	String time;
	String state;
	
	Date(int day, String state){
		cal.add(Calendar.DATE, day);
		this.time = sdf.format(cal.getTime());
		this.state = state;
	}
	
	
}