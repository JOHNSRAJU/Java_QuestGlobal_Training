package hello_world_program;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {4,5,6,8,1,2};
		int largest=a[0];
		int secondLargest=a[0];
		for(int i:a) {
			if(i>largest) {
				largest=i;
			}
		}
		for(int i:a) {
			if(i<largest&i>secondLargest) {
				secondLargest=i;
			}
		}
		System.out.println("Second Largest = "+secondLargest);
	}


}
