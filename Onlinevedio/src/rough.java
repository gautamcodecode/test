class jac{
	
}

public class rough {
	static int length;
	

	public static void main(String[] args) {
		
		int[] a=new int[] {56,52,48,98,63,87,16};
		length=a.length;
		givenarray(a);
		System.out.println();
		sortedarray(a);
	}
	
	public static void givenarray(int[] b) {
		for(int i=0;i<length;i++) {
			System.out.print(b[i]+" ");
		}
}
public static void sortedarray(int[] c ) {
	int t=0;
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(c[i]>c[j]) {
				t=c[i];
				c[i]=c[j];
				c[j]=t;
				
			}
			
		}
		System.out.print(c[i]+" ");
	}
	givenarray(c);
	System.out.println();
}

}
