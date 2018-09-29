import java.util.*;

public class GenSort {
	
	public static <t extends Comparable<t>> void sort(t arr[]) {
		
		t temp;

		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr.length-i-1; j++) {
				if (arr[j].compareTo(arr[j+1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

	}

	public static void main(String []args) {

		Integer arr[] = {9,8,7,6,5,4,3,2,1,0};
		Character brr[] = {'c','d','a','e','f','g','u','o','p','q'};
		Float crr[] = {9.87f,2.22f,3.65f,8.0f,7.0f,6.0f,5.0f,4.0f,1.23f};
		
		sort(arr);
		sort(brr);
		sort(crr);

		System.out.println(Arrays.toString(arr)+"\n"+Arrays.toString(brr)+"\n"+Arrays.toString(crr));

	}

}
