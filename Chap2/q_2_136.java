
import edu.princeton.cs.algs4.StdRandom;

//q 2.136
class q_2_136 {
	static int SIZE=10;
	public static void printArr(int[] a) {
		for(int b: a)
			System.out.println(b);
		
	}
	
	public static void main(String args[]) {						
		int[] a=new int[SIZE];
		for(int i=0;i<SIZE;i++)  //generate half 1 and half 0
		{
			if(i<SIZE/2) a[i]=0;
			else a[i]=StdRandom.uniform(Integer.MAX_VALUE);
		}
		
		StdRandom.shuffle(a);
		
		//print arr
		printArr(a);
		
		
	}
	
	
	
	
	
}
