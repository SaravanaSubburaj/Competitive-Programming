    import java.io.*;
    import java.util.StringTokenizer;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    public class Main {
        public static void main(String args[]) throws IOException{
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            String s=b.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            int[] player1 =new int[n];
            int[] player2 =new int[n];
            s=b.readLine();
            st = new StringTokenizer(s);
            player1[0]=Integer.parseInt(st.nextToken());
            player2[0]=Integer.parseInt(st.nextToken());
            int diff= player1[0]-player2[0];
            int W=0,lead=0;
     
            for (int i = 1; i < n ; i++) {
                if (diff >= 0 && diff > lead )
                {
                    lead = diff;
                    W=1;
                }
                if (diff < 0 && -diff >lead)
                {
                    lead = -diff;
                    W=2;
                }
                s=b.readLine();
                st = new StringTokenizer(s);
                player1[i]=Integer.parseInt(st.nextToken())+player1[i-1];
                player2[i]=Integer.parseInt(st.nextToken())+player2[i-1];
                diff = player1[i]-player2[i];
     
            }
            System.out.println(W+" "+lead);
        }
    }
     
