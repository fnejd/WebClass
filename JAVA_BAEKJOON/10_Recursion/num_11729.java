import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class num_11729{

	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//마지막 원판을 제외한 나머지 원판 n-1개를 2번 막대로 옮긴다.
		//마지막 원판 1개를 3번 막대로 옮긴다.
		//n-1개 원판을 3번 막대로 옮긴다. 
		
		//n-1개를 중간 막대로 옮기는 과정
		//제일 큰 원판을 목적지 막대로 옮기는 과정
		//n-1개 막대를 목적지 막대로 옮기는 과정
		
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write(cntHanoi(n)+"\n");
		
		
		hanoi(n,1,3);
		
		bw.flush();
		bw.close();

	}
	//hanoi(옮겨야 하는 원판의 수, 출발 막대, 도착 막대)
	static void hanoi(int num, int from, int to) throws IOException{
		
		//원판들을 임시로 옮겨 놓는 막대 
		int middle = 6- from - to;
		
		if(num==1) {
			bw.write(from + " " + to+"\n"); 
			return;
			
		}else {
			
			hanoi(num-1,from, middle); //n-1개 원판을 from에서 middle로 옮긴다. (n-1개의 원판을 from에서 to로 옮기는데 middle를 보조로 사용)
			hanoi(1, from, to);  //제일 큰 밑판 1개를 최종 도착 막대로 옮긴다. 
			hanoi(num-1,middle,to); //middle에 있던 n-1개 막대를 최종 도착 막대로 옮긴다. 
				
		}
		
	}
	
	//총 이동 횟수
	static int cntHanoi(int num) {
		
		if(num==1) {
			return 1;
		}else {
			return 2*cntHanoi(num-1)+1;
		}
		
	}

}
