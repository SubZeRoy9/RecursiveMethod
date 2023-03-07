
public class mainDriver {

	public static void main(String[] args) {
		int[] a = {3,2,1,3,2,1,3,2,1};
		System.out.println(recursiveMethod1(a,3,3));
		

	}
	
	public static int recursiveMethod1(int[] a, int b, int j){
		if (j < a.length)
		if (a[j] != b) return recursiveMethod1 (a, b, j+1);
		else return recursiveMethod1 (a, b, j+1) + 1;
		else return 0;
		}

}
