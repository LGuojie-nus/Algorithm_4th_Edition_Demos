public class Sort {		
	public static void sort(Comparable<q_2_138>[] a)
	{
	   int N = a.length;
	   for (int i = 0; i < N; i++)
	      for (int j = i; j > 0; j--)
	         if (a[j].compareTo((q_2_138) a[j-1]) < 0)
	              exch(a, j, j-1);
	         else break;
	 }
	private static void exch(Comparable<q_2_138>[] a, int i, int j)
	{
	   Comparable<q_2_138> swap = a[i];
	   a[i] = a[j];
	   a[j] = swap;
	}
	public static void main(String args[]) {
		q_2_138[] arr=new q_2_138[20];
		for(int i=0;i<20;i++)
			arr[i]=new q_2_138();
		
		//for(int i=0;i<10;i++)
		//	arr[i].printVal();
		
		sort(arr);
		
		
		for(int i=0;i<20;i++)
			arr[i].printVal();
		
		
		
	}
	
	
}
