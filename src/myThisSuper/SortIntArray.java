package myThisSuper;

import java.util.Arrays;

public class SortIntArray {

	/**
	 * @param args
	 *            cum se sorteaza o lista de elemente de tip int
	 */

	

	private static void pivotSort(int[] arr, int left, int right) {
		int i = left;
		int j = right;
		int pivot = arr[i + (j - i) / 2];
		while (i < j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int tmp;
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		if (j > left) {
			pivotSort(arr, left, j);
		}

		if (i < right) {
			pivotSort(arr, i, right);
		}
	}

	protected static void quikSort(int[] arr) {
		if (arr != null && arr.length > 2) {
			pivotSort(arr, 0, arr.length - 1);
		} else
			return;
	}
	
	private static void bubbleSort(int[] arr){
		int j=arr.length-1;
		int start=0;
		while(start<j){
			for (int i=1;i<j;i++){
				if(arr[i-1] > arr[i]){
					int tmp;
					tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
					System.out.println("         "+Arrays.toString(arr));
				}				
			}
			j--;
		}
	}
	

	protected static int[] randomList(int elm, int coma) {
		int[] arr = new int[elm];
		int zero = 1;
		for (int i = 0; i < coma; i++) {
			zero = zero * 10;
		}
		for (int i = 0; i < elm; i++) {
			int rnd = (int) (Math.random() * (zero * coma));
			arr[i] = rnd;
		}
		return arr;
	}

	public static void main(String[] args) {
//		UniqeElements unicElm = new UniqeElements();
//		int [] arr={5, 1, 4, 2, 8};
		int[] arr =randomList(10,2);
		System.out.println("unsorted " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("  sorted " + Arrays.toString(arr));
//		long t1 = System.currentTimeMillis();
//		System.out.println("\nunique   "+ Arrays.toString(unicElm.quikSortedSet(arr)));
//		long t2 = System.currentTimeMillis();
//		System.out.println("quik In time " + (t2 - t1) + "ms");
		
//
//		System.out.println("unsorted " + Arrays.toString(arr));	 
//		t1=System.currentTimeMillis();			
//		System.out.println("\nunique   "+ Arrays.toString(unicElm.slowSet(arr)));
//		t2=System.currentTimeMillis();
//		System.out.println("slow In time "+(t2-t1)+"ms");
		
		
		
	}

}
