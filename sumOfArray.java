package hello_world_program;
public class sumOfArray {
	public static void main(String[] arg) {
		int[] a= {1,2,3,4,5,6};
		System.out.println("Sum of array - "+sum(a));		
	}
	static int sum(int[] a){
		int total=0;
		for (int i:a) {
			total+=i;
		}
		return total;
	}
}