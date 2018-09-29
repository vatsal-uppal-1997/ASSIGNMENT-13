public class PrintGen {

	public static <t> void print(t arr[]) {

		for (t i : arr)
			System.out.print(i+" ");
		System.out.println();

	}

	public static void main(String[] args) {


		Integer arr[] = new Integer[10];
		Character brr[] = new Character[10];

		for (int i=0; i<10; i++)
			arr[i] = i;

		for (int i=0; i<10; i++)
			brr[i] = (char)(97+i);

		print(arr);
		print(brr);

	}


}
