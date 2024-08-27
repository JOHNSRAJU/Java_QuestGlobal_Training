package hello_world_program;
public class LargestElement {

	public static void main(String[] args) {
		int a[]= {4,5,6,8,1,2};
		int largest=a[0];
		for(int i:a) {
			if(i>largest) {
				largest=i;
			}
		}
		System.out.println("Largest = "+largest);

	}

}
