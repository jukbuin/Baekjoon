package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int a[] = new int[10];
		int cnt = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < num.length; i++) {
			a[i] = num[i] % 42;
		}

		for (int j = 0; j < 42; j++) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == j) {
					cnt++;
					break;
				}
			}

		}
		System.out.print(cnt);
	}

}
