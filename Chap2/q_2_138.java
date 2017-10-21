
import edu.princeton.cs.algs4.StdRandom;
import java.util.Random;

//q2.138
class q_2_138 implements Comparable<q_2_138>{

	private final double F;
	private final String[] S=new String[10];


	//constructor
	public q_2_138() {
		F=StdRandom.uniform();
		for(int i=0;i<10;i++)
			S[i]=getSaltString();

	}

	public void printVal() {
		System.out.println("F: "+F);
		System.out.println("S: "+S[9]);


	}

	/*****************///String generation 
	/*****************/
	private String getSaltString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

	public int compareTo(q_2_138 m) {

		if (this.F<m.F) return -1;
		if (this.F==m.F) return 0;
		return 1;

	}	

	public static void main(String args[]) {
		q_2_138[] arr=new q_2_138[20];
		for(int i=0;i<20;i++)
			arr[i]=new q_2_138();
		Sort.sort(arr);

		for(int i=0;i<20;i++)
			arr[i].printVal();
	}
}
