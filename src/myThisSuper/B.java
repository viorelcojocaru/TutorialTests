package myThisSuper;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * extinderea unei clase
 * */
class B extends A {
	static int y, z, x3;

	public B() {
		this(0);
	}

	static {
		System.out.println("Initializam...");
		int t = 1;
		y = 2;
		z = x3 + y + t;
		System.out.println(" End initialization z=" + z);
	}

	public B(int i) {
		super(i);
		System.out.println(i);

	}

	void metoda() {
		super.metoda();
		System.out.println(x3);
	}
	static String valid(String body){
		if (body != null) {
			if (body.contains("\n\r"))
				body = body.replaceAll("\n\r", "");
			if (body.contains("\r\n"))
				body = body.replaceAll("\r\n", "");
			if (body.contains("\n"))
				body = body.replaceAll("\n", "");
			if (body.contains("\r"))
				body = body.replaceAll("\r", "");
			if (body.contains("\t"))
				body = body.replaceAll("\t", "");
			
		}
		return body;
	}
	
	private static String getHtmlBody(String htmlText){
		Pattern p = Pattern.compile("(?i)<html>.*<body.*?>(.*)</body></html>", Pattern.DOTALL);						
		Matcher m = p.matcher(htmlText);		
		if(m.find())
			return m.group(1);							
		else
			return null;
				
	}
	public static void main(String[] args) {
		B b = new B();
		b.metoda();
		
//		UniqeElements unicElm = new UniqeElements();
//		SortIntArray sortArray =new SortIntArray();
//		int[] arr =sortArray.randomList(200000,2);
//		System.out.println("unsorted " + Arrays.toString(arr));	
//		long t1=System.currentTimeMillis();
//		System.out.println("\nunique   "+ Arrays.toString(unicElm.quikSortedSet(arr)));
//		long t2=System.currentTimeMillis();
//		System.out.println("In time "+(t2-t1));
//		String str ="<html>\r\n<body><p>hi "+"\n\r"+"\n\ttext care se \n\rinclude in paragraf "+"\r"+"\nnew</p></body></html>";
//		System.out.println(getHtmlBody(str.replaceAll("(\r\n|\n\r|\r|\n)", "")));
	}

}
