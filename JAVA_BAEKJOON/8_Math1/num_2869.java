import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class num_2869 {

	public static void main(String[] args) throws IOException {
		
	
		//달팽이는 올라가고 싶다 
		
	
		//while문으로 풀이하면 시간초과가 뜬다. 
		//Scanner로 풀었을 때 시간초과가 떴다. 
	
		// a - b : 하루에 총 올라간 거리
		// a - b + a: 하루 + 다음 날 낮까지 올라간 거리 
		// 낮이 기준 : a -b + a, a -b + a -b + a, ...  (낮에 도달해버리면 끝난다, 저녁에는 올라가는 것이 아니라 내려가므로)
		// x일 낮에 도달: (a -b) * (x-1) + a
		// v = (a-b) * (x-1) + a
		// x = (v -b) / (a -b)
		
		
		//시간 초과 문제 때문에 BufferedReader 와 BufferedWriter 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
	
	
		//날짜 계산
		
		int day= (v-b)/(a-b);
		
		// (v-b) % (a -b) !=0 이면 히루를 더 더해줘야 한다. 
		if((v-b)%(a-b)!=0) {
			day++;
		}
	
	
		bw.write(day+"\n");
		bw.flush();
		bw.close();
		
	
		
	}

}
