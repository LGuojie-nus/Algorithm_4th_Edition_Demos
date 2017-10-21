
//q2.1.8
public class q_2_1_8{
	private static boolean less(int v, int w)
	{ return v-w < 0; }
	private static void exch(int[] a, int i, int j)
	{ int t = a[i]; a[i] = a[j]; a[j] = t; }
	public static void sort(int[] a)
	{ // sort a[]
		int N = a.length;
		for (int i = 1; i < N; i++)
		{ // 将 a[i] 插入􀒁 a[i-1]􀇋a[i-2]􀇋a[i-3]...􀋧中
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
				exch(a, j, j-1);
		}
	}

	public static void main(String[] args) {
		//generate random array with 3 values, length 30,60,120
		
		int SIZE=2;
		int[][] arr=new int[SIZE][12000];
		int[][] arr30=new int[SIZE][3000];
		int[][] arr60=new int[SIZE][6000];
		int[][] arr120=new int[SIZE][12000];
		for(int j=0;j<SIZE;j++) {
			for(int i=0;i<12000;i++) {
				arr[j][i]=StdRandom.uniform(0, 3);
				arr120[j][i]=arr[j][i];
				if(i<3000)arr30[j][i]=arr[j][i];
				if(i<6000)arr60[j][i]=arr[j][i];
			}
		}

		Stopwatch stopWatch = new Stopwatch();
		for(int j=0;j<SIZE;j++)
			sort(arr30[j]);
		double time=stopWatch.elapsedTime();//in seconds

		Stopwatch stopWatch2 = new Stopwatch();
		for(int j=0;j<SIZE;j++) 
			sort(arr60[j]);	
		double time2=stopWatch2.elapsedTime();//in seconds


		Stopwatch stopWatch3 = new Stopwatch();
		for(int j=0;j<SIZE;j++) 
			sort(arr120[j]);
		double time3=stopWatch3.elapsedTime();//in seconds

		System.out.printf("time1 taken     = %.2f seconds\n",time);
		System.out.printf("time2 taken     = %.2f seconds\n",time2);
		System.out.printf("time3 taken     = %.2f seconds\n",time3);

		for(int i=0;i<120;i++) {

		}
		System.out.println(8/3);
		System.out.println(7/3);
		System.out.println(0%3);
		System.out.println(-1%3);
		System.out.println(0%3);
	}	
		

	}
}

