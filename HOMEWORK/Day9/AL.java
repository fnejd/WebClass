import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/*����7) ArrayList�� ����ð��� Date ��ü�� �Է��ϰ�, 
ArrayList�� ���� ���ʴ�� ����Ͻÿ�.(�⺻)*/ 

/*����8) ArrayList�� ���Ͻð��� Date ��ü�� �Է��ϰ�, 
ArrayList�� ���� ���ʴ�� ����Ͻÿ�.(��ȭ) */

/*����9) ArrayList�� 1�� �̳��� ��¥�� random�ϰ� ���� �Է��ϰ�, 
���� ����ִ� 3���� ���� ����ð��� ���̸� ������� ����Ͻÿ�.(��ȭ) */


public class AL {
	
	public static void main(String[] args) {
		
		//7  ����ð��� Date ��ü�� �Է�
		ArrayList<Date> date = new ArrayList<Date>();
		Date today = new Date(0,"����");
		date.add(today);
		
		//7  ArrayList�� ���� ���ʴ�� ���
		for(int i=0; i<date.size();i++){
            System.out.println(date.get(i).state + " " + date.get(i).time);
        }
		
		//8  ���Ͻð��� Date ��ü�� �Է�
		Date tommorrow = new Date(1,"����");
		date.add(tommorrow);
		
		
		//8  ArrayList�� ���� ���ʴ�� ���
		for(int i=0; i<date.size();i++){
            System.out.println(date.get(i).state + " " + date.get(i).time);
        }
		
		//9 1�� �̳��� ��¥�� random�ϰ� ���� �Է�
		Random random = new Random();
		Date randomDay = new Date(random.nextInt(365)+1,"������¥");

		date.add(randomDay);
		//8  ArrayList�� ���� ���ʴ�� ���
		for(int i=0; i<date.size();i++){
		     System.out.println(date.get(i).state + " " + date.get(i).time);
		}
		
		
		//9  ���� ����ִ� 3���� ���� ����ð��� ���̸� ������� ���
		System.out.println("������¥ - ���� : " + diffDay(date.get(0),date.get(2)));
		System.out.println("������¥ - ���� " + diffDay(date.get(1),date.get(2)));
		
		
		
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