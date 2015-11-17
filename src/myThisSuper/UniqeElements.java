package myThisSuper;

import java.util.Arrays;

public class UniqeElements {

	/**
	 * @param args
	 *            sa returneze elementele sortate unice
	 * @return
	 */

	public static int[] quikSortedSet(int[] arr) {
		
		SortIntArray sort = new SortIntArray();
		sort.quikSort(arr);
		System.out.println("         "+Arrays.toString(arr));
		int i = 0;
		int j = arr.length - 1;
		if (j == 0) {
			return arr;
		}
		if (j == 1) {
			if (arr[0] != arr[1]) {
				return arr;
			} else {
				int[] tmp = new int[1];
				tmp[0] = arr[0];
				return tmp;
			}
		}

		int[] tempArr = null;
		int elm = 1;
		i=0;
		while (i<j) {
			 if ( arr[i] == arr[i+1 ]){
				 i++;	
			}else{
			elm++;
			i++;
			}
		}
		tempArr = new int[elm ];
		int tempelm = 0;
		i=0;
		while (i< j) {
			if (arr[i] == arr[i + 1]) {
				i++;
			}else{
			tempArr[tempelm] = arr[i];
			tempelm++;
			i++;
			}
		}
		tempArr[tempelm] = arr[i];
		return tempArr;

	}
	
	public static int[] slowSet(int[] arr){
		int j=arr.length-1;
		int i=0;
		int elm=0;
		for( i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for( j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
               elm++;
            }
        }
		int [] tempArr= new int [elm];
		int tempelm =0;
		for( i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for( j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){            	
            	tempArr[tempelm] = arr[i];
            	tempelm++;
            }
        }
		return tempArr;
	}
	
	

	public static void main(String[] args) {

	}

}
