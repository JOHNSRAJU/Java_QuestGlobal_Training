package hello_world_program;
public class MergeTwoArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,8,4,7,5,9};
		int[] a2= {4,8,7,5,6,9};
		int[] a3= new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			a3[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[i+a1.length]=a2[i];
		}
		for(int i:a3) {
			System.out.println(i);
		}
	}

}
