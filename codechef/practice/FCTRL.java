import java.util.Scanner;

public class FCTRL {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num;
        for(int i=1;i<=n;i++){
           num=input.nextInt();
           System.out.println(Z(num));
        }
    }

    public static int Z(int num){
        int i=1;
        int ans=0;
        double divisor=0;
        do{
            divisor= Math.pow(5,i);
            ans=ans+(num/(int)divisor);
            i++;
        }while(divisor <= num );

       return ans;
    }
}
