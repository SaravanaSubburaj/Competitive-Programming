import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
public class MaximizeTheEarning {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine().split(" ")[0]);

		for (int i = 0; i < S; i++) {

			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int R = Integer.parseInt(input[1]);
			String[] input1 = br.readLine().split(" ");
			long current = Long.parseLong(input1[0]);
			long count = 0L;
			for (String string : input1) {
				long temp = Long.parseLong(string);
				if ( temp > current) {
					count++;
					current = temp;
				}

			}
			
			out.println((count+1)*R);

		}

	}

}
