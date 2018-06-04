import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Stackez {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		//Stack<Long> s = new Stack<Long>();
		
		Long T = Long.parseLong(br.readLine());

		for (int i = 0; i < T; i++) {
			String[] query;
			Integer code = null;
			Long value = null;

			query = br.readLine().split(" ");
			code = Integer.parseInt(query[0]);

			if (query.length > 1)
				value = Long.parseLong(query[1]);
			else
				value = 0L;
			
			
			switch (code) {
			case 1:
				Stack.push(value);
				break;

			case 2:
				if (!Stack.isEmpty()) Stack.pop();
				break;

			case 3:
				if (!Stack.isEmpty()) pw.println(Stack.peek());
				else pw.println("Empty!");
				break;

			default:
				break;
			}

		}
		
		br.close();
		pw.close();

		
	}
}

class Stack {

	static Long top = -1L;
	static ArrayList<Long> stack = new ArrayList<>();

	static boolean isEmpty() {
		if (top == -1L)
			return true;
		else
			return false;
	}

	static void push(Long data) {
		stack.add(data);
		top++;
	}
	
	static Long peek() {
		return stack.get(stack.size()-1);
	}

	static void pop() {
		stack.remove(stack.size()-1);
		top--;
	}
		
}
