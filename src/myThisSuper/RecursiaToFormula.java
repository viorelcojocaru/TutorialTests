package myThisSuper;

public class RecursiaToFormula {

	/**
	 * @param args
	 * de a arata recursiv cum se face din
	 * metode in formul 
	 */
	
	
	private static int f(int x) {
		if (x < 2)
			return abc(x);
		else
			return a(x) + f(x - 2) + b(x) + f(x - 1)+c(x);
	}

	private static int abc(int x) {
		System.out.print(x);
		return x;
	}
	private static int a(int x) {
		System.out.print("(");

		return 0;
	}
	private static int b(int x) {
		
		System.out.print("+");
		return 0;
	}
	private static int c(int x) {
		System.out.print(")");
		return 0;
	}
	
	public static void main(String[] args) {
		 f(5);

	}

}
