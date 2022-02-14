import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class num_2447{

	public static void main(String[] args) throws IOException {
		
		//별 찍기 - 10
		
		//시간 초과나서 -> BufferedReader, BufferedWriter 사용
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//숫자 입력 
		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][n];
		
		//공백으로 초기화
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=" ";
			}
			
		}
		
		star(arr,0,0,n);
		
		//배열 출력 
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				bw.write(arr[i][j]);
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
		

	}
	
	public static void star(String[][] arr, int x, int y, int n) {
		
		if(n==1) {
			//크기가 1이 될때 해당 x,y 좌표에 * 찍기
			arr[x][y] = "*";
			return;
		}
		
		//(0, 0, n/3), (0,n/3,n/3), (0,2*n/3,n/3)
		//(n/3, 0, n/3), (n/3, n/3, n/3) (n/3, 2*n/3,  n/3)
		//(2*n/3, 0, n/3), (2*n/3, n/3, n/3), (2*n/3, 2*n/3, n/3)
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1 && j==1) {
					continue;
				}
				star(arr, x+i*(n/3),y+j*(n/3),n/3 );
			}
		}
	}


}
