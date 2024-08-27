package hello_world_program;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,5,8,4,8,7,5,9,6,3};
		int[] dIndex = new int[a.length];
		int count=0;
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					dIndex[count]=i;
					count++;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			boolean check=true;
			for(int j:dIndex) {
				if(i==j) {
					check=false;
				}
			}
			if(check) {
				System.out.println(a[i]);
			}
		}
	}

}
