package array_programming;

import java.util.Scanner;

public class Program02 {
	// TODO: To print the even elements of the array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the Number " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		System.out.println("\nEven Elements are:");
		getEvenElements(a);
		sc.close();
	}

	public static void getEvenElements(int[] arr) {
		for (int x : arr) {
			if (x % 2 == 0)
				System.out.print(x + " ");
		}
	}
}