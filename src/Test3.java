
public class Test3 {
	public int solve(int k) {
		if(k==1) return 1;
		if(k==2) return 2;
		if(k%2==0) return solve(k/2)+1;
		return solve(k/2)+2;
		
		}
	public static void main(String args[]) {
		Test3 test3=new Test3();
		System.out.print(test3.solve(100));
		
	}

}
