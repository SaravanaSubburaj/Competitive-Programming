import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.out;
 
public class Main{
 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().split(" ")[0]);
 
		for (int i = 0; i < T; i++) {
			String[] first = br.readLine().split(" ");
			String A = first[1];
			String B = first[2];
			int countA = 0;
			int countB = 0;
			int countTotal = 0;
 
			String[] second = br.readLine().split(" ");
			for (String s : second) {
				if (A.equals(s))
					countA++;
				if (B.equals(s))
					countB++;
				countTotal++;
			}
			
			double res = ((double)countA / (double)countTotal) * ((double)countB / (double)countTotal);
			out.println(res);
 
		}
 
	}
 
}
