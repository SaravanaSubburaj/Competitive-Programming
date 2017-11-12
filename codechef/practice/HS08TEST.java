import java.util.Scanner;

class HS08TEST {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        int withdraw=0;
        double initialBalance=0;
        withdraw = input.nextInt();
        initialBalance = input.nextDouble();

        if((withdraw <= 2000 && withdraw >0) && (initialBalance >= 0  && initialBalance <=2000) ){
            if((initialBalance > withdraw+0.5) && (withdraw%5==0)) {
                initialBalance = initialBalance - withdraw - 0.5;
            }
            System.out.printf("%.2f",initialBalance);
        }
    }

}