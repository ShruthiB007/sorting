package sort;

public class Arrays {
	public static void sort(Object[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(((Comparable)a[j]).compareTo(a[j+1])<=0) {
					Object temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
	}
	
}
