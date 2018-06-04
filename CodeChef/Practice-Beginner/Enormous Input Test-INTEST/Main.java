import java.io.*;
import java.util.StringTokenizer;
 
public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s=b.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n=Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count =0;
        while(--n >=0){
            String num =b.readLine();
            StringTokenizer str = new StringTokenizer(num);
            int temp=Integer.parseInt(str.nextToken());
            if (temp % k==0){
                 count+=1;
            }
         }
        System.out.print(count);
    }
}
