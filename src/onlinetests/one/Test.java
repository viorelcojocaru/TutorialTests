package onlinetests.one;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		A a =new B();
//		B b =new B();

		 double values[] = {-0.6, -1.0, 0.25, 4};
	        int cnt = 0;
	        for (int x=0; x < values.length; x++) 
	        {
	        	long j=Math.round(values[x]);
	        	double l=Math.ceil(values[x]);
	        	double i=Math.floor(values[x]);
	            if (Math.round(values[x]) + .5 == Math.ceil(values[x])) 
	            {
	                ++cnt;
	            }
	        }
	        
	        System.out.println("same results " + cnt + " time(s)");
	    }
	
}
