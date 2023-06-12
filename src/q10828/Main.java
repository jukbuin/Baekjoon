package q10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			YeStack ys = new YeStack(cnt);
			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();

				if (cmd.equals("push")) {
					String cmd2 = st.nextToken();
					int p = Integer.parseInt(cmd2);
					ys.push(p);
				} else if (cmd.equals("pop")) {
					ys.pop();
				} else if (cmd.equals("size")) {
					ys.size();
				} else if (cmd.equals("empty")) {
					ys.empty();
				} else if (cmd.equals("top")) {
					ys.top();
				}
			}
			br.close();

		} catch (Exception e) {

		}

	}

}
