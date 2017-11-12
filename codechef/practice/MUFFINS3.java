import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MUFFINS3 {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(input.readLine());
        int N;
        while(T-->0){
            N=Integer.parseInt(input.readLine());
            System.out.println(N/2+1);

        }
    }
}
