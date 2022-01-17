import java.io.*;
import java.util.*;

public class num_15552 {
	
	public static void main(String[] args) throws IOException {
		
		//빠른 A+B
		
		
		//BufferedReader : enter를 경계로 인식
		//예외 처리 필요
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = 0;
		String s = "";
		
		s = bf.readLine();  //String
		t = Integer.parseInt(s);
		
		
		for(int i=0; i<t ;i++) {
			
			// 한줄 읽고 String 반환
			s = bf.readLine();
			
			
			StringTokenizer st = new StringTokenizer(s);
			
			
			//StringTokenizer- nextToken() : 입력받은 값을 공백단위로 구분해 호출
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			bw.write(n1+n2 + " ");
			//bw.write()는 자동 개행 기능 X
			
			//줄바꿈
			bw.newLine();	
		}
		//버퍼에 남아 있는 데이터 출력
		bw.flush();
		
		//스트림 닫기
		bw.close();
			
	}

}
