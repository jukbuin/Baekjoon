package q10828stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> stk = new Stack<Integer>();

		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);

			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();

				if (cmd.equals("push")) {
					String cmd2 = st.nextToken();
					int p = Integer.parseInt(cmd2);
					stk.push(p);
				} else if (cmd.equals("pop")) {
					if (stk.empty()) {
						System.out.println(-1);
					} else {
						System.out.println(stk.pop());
					}
				} else if (cmd.equals("size")) {
					System.out.println(stk.size());
				} else if (cmd.equals("empty")) {
					if (stk.empty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				} else if (cmd.equals("top")) {
					if (stk.empty()) {
						System.out.println(-1);
					} else {
						System.out.println(stk.peek());
					}
				}
			}
			br.close();

		} catch (Exception e) {

		}

	}

}
