import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class TSORT_fast
{
    public static void main(String[] args)throws Exception
    {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n,temp,i=0;
        n=Integer.parseInt(in.readLine());
        int foo[] =new int[n];

        while(i<n){
            temp=Integer.parseInt(in.readLine());
            foo[i]=temp;
            i++;
        }
        Arrays.sort(foo);
        for(int k = 0;k<n;k++)
        {
            out.write(String.valueOf(foo[k])+"\n");
        }
        out.flush();

    }
}