package lab2;

import java.util.Arrays;

public class Lab2Exercise1 {
//		void getSecondSmallest(int a[]){
//		int size = a.length;
//		Arrays.sort(a);
//		System.out.println("sorted a ::"+Arrays.toString(a));
//	}

	public static void main(String[] args) {
		
		int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[1];
	      System.out.println("2nd smallest element is ::"+res);
		
//		int a[]=new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=70;
//		a[3]=40;
//		a[4]=50;
//		
//		for(int i=0;i<a.length;i++)
//			System.out.println(a[i]);
	}
}
