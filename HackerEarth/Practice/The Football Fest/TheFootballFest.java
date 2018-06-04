import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

import static java.lang.System.out;

class TheFootballFest {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().split(" ")[0]);
		String a = null;
		String b = null;

		for (int i = 0; i < T; i++) {
			String[] inp = br.readLine().split(" ");
			long N = Long.parseLong(inp[0]);
			Stack<String> s = new Stack<>();
			s.push(inp[1]);
			for (int j = 0; j < N; j++) {
				String id = null;
				String[] current_inp = br.readLine().split(" ");
				if (current_inp[0].equals("P")) {
					id = current_inp[1];
					s.push(id);
				} else if (current_inp[0].equals("B")) {
					try {
						a = s.pop();
						b = s.pop();
						s.push(a);
						s.push(b);
					} catch (EmptyStackException e) {
						continue;
					}
				}
			}
			out.println("Player " + s.peek());
		}
	}
}
