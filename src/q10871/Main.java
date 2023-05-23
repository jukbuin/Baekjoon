package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = sc.nextInt();
		int num[] = new int[N];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] < a) {
				System.out.print(num[i] + " ");
			}
		}
		sc.close();
	}

}
