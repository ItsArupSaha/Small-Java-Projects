import java.text.DecimalFormat;
import java.util.Scanner;

public class InvestmentEarnings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the buying price per share: ");
        double buyingPrice = input.nextDouble();
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");
        int day = 1;

        while(true){

            System.out.println("Enter the closing price for day "+day+" (any negative value to leave: " );
            closingPrice = input.nextDouble();

            if(closingPrice < 0.0) break;

            double earnings = closingPrice - buyingPrice;

            if(earnings > 0){
                System.out.println("After Day "+day+", you earned "+df.format(earnings)+" per share.");
            }
            else if(earnings<0){
                System.out.println("After Day "+day+", you lost "+df.format(-earnings)+" per share.");
            }
            else{
                System.out.println("After Day "+day+", you have no earnings per share.");
            }

            day++;

        }

        input.close();

    }

}
