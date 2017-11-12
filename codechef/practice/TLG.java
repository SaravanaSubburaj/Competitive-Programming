import java.io.*;
import java.util.Scanner;


public class TLG {
    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] player1 =new int[n];
        int[] player2 =new int[n];
        player1[0]=input.nextInt();
        player2[0]=input.nextInt();
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
            player1[i]=input.nextInt()+player1[i-1];
            player2[i]=input.nextInt()+player2[i-1];
            diff = player1[i]-player2[i];

        }
        System.out.println(W+" "+lead);
    }
}
