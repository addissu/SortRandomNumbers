
import java.util.Random;

public class Another {

	public static void main(String[] args) {
		Random g = new Random();
		Random f = new Random();

		int[] a = new int[100];
		int[] number = new int[200000];

		System.out.print("Selection sort:");
		for (int c = 0; c < a.length; c++) {
			int RandomG = f.nextInt(50000) + 1;
			a[c] = RandomG;
			// System.out.print(" " +RandomG);
		}

		System.out.print(" Random Numbers:");
		for (int d = 0; d < number.length; d++) {
			int Randomd = g.nextInt(50000) + 1;
			number[d] = Randomd;
			// System.out.print(" " +Randomd);
		}
		System.out.print("\nTimeSelection:" + (SelectionSort(a)));
		System.out.println("\nTimeSelection:" + (SelectionSort(number)));

		System.out.print("\nTimer:" + (BubbleSortAsceMethod(number)));
		System.out.print("\nTimer:" + (BubbleSortAsceMethod(a)));

	}

	public static long BubbleSortAsceMethod(int[] number) {

		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		int temp;

		for (int i = 0; i < number.length - 1; i++) {
			for (int j = 1; j < number.length - i - 1; j++) {
				if (number[j - 1] > number[j]) {
					temp = number[j - 1];
					number[j - 1] = number[j];
					number[j] = temp;
				}
			}
		}
		return (System.currentTimeMillis() - startTime);

	}

	public static long SelectionSort(int[] a) {
		long startTimee = System.currentTimeMillis();
		System.out.println("first" + startTimee);

		for (int i = a.length - 1; i > 0; i--) {
			int largest = i;
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] > a[largest]) {
					largest = j;
				}
			}

			swap(a, i, largest);// swaps the Largest to the back

		}

		return (System.currentTimeMillis() - startTimee);
	}

	public static void swap(int[] a, int i, int j) {
		if (i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

}
