package q10828;

public class YeStack {
	int stack[];
	public int num = 0;

	YeStack(int num) {
		this.num = num;
		this.stack = new int[num];
	}

	public void push(int x) {
		for (int i = 0; i < num; i++) {
			if (stack[i] == 0) {
				stack[i] = x;
				break;
			}
		}
	}

	public void pop() {
		for (int i = num - 1; i >= 0; i--) {
			if (stack[i] != 0) {
				System.out.println(stack[i]);
				stack[i] = 0;
				break;
			} else if (stack[0] == 0) {
				System.out.println(-1);
				break;
			}
		}
	}

	public void size() {
		int a = 0;
		for (int i = 0; i < num; i++) {
			if (stack[i] != 0) {
				a++;
			}
		}
		System.out.println(a);
	}

	public void empty() {
		for (int i = 0; i < num; i++) {
			if (stack[i] == 0) {
				System.out.println(1);
				break;
			} else if (stack[i] != 0) {
				System.out.println(0);
				break;
			}
		}
	}

	public void top() {
		for (int i = num - 1; i >= 0; i--) {
			if (stack[i] != 0) {
				System.out.println(stack[i]);
				break;
			} else if (stack[0] == 0) {
				System.out.println(-1);
				break;
			}
		}
	}
}
