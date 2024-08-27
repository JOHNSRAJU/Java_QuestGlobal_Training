package hello_world_program;

public class FrequencyOfElement {
	public static void main(String[] args) {
		int[] a= {4,5,5,8,7,9,4,8,4};
		for(int i = 0;i<a.length;i++){
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			System.out.println("Count of "+a[i]+" = "+count);
		}
			
	}
}
