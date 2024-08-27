package hello_world_program;

public class Sorting {
	public static void main(String[] arg) {
		int[] a = {4,2,3,7,4,5,6,2,8};
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i:a) {
			System.out.println(i);
		}
	}
}
