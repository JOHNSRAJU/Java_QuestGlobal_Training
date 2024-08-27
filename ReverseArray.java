package hello_world_program;

public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,45,78,5,6,9};
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[a.length-i-1] +", ");
		}

	}

}
