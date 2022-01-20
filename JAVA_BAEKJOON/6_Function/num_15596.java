
public class num_15596 {
	public static void main(String[] args) {
		
		//정수 N개의 합
		
		int[] a = {1,2,3,4,5};
		Test test = new Test();
		System.out.println(test.sum(a));
		
	}

}

class Test {
    long sum(int[] a) {
        long ans = 0;
        
        //배열에 저장되어 있는 정수들의 합
        for(int i=0; i<a.length; i++)
        {
        	ans += a[i];
        }
        return ans;
    }
}
