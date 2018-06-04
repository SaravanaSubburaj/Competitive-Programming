    import java.math.BigInteger;
    import java.util.Scanner;
     
    public class Main{
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int num=0;
           BigInteger b;
            if (n > 0 && n <= 100) {
                while (n-- > 0) {
                    num = input.nextInt();
                    if(num >=0 && num <=100) {
                        b = BigInteger.valueOf(num);
                        System.out.println(factorial(b));
                    }
                    else
                        System.exit(1);
     
                }
            }
        }
     
        public static BigInteger factorial(BigInteger num){
          BigInteger con,ans;
          con=BigInteger.valueOf(1);
          if (num.compareTo(BigInteger.ONE)>=1) {
              ans = num.multiply(factorial(num.subtract(con)));
              return ans;
          }
          else
              return con;
     
        }
    }
     
