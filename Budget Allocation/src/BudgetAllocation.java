import java.util.ArrayList;
import java.util.Scanner;

public class BudgetAllocation {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("How much can you spend?");
        double budget = input.nextDouble();

        System.out.println("Enter your percentage of various expenses");
        System.out.println("The System stops if cumulative proportions exceeds 100%");
        System.out.println();

        double expenseNumber = 1.0;
        double sum = 0.0;
        double remaining = 0;

        ArrayList<Double> proportion = new ArrayList<>();

        do{

            System.out.print("Your proportion of expense "+expenseNumber+": ");
            double value = input.nextDouble();

            if(sum+value > 100){
                System.out.println("You've exceeded your budget!!");
                break;
            }

            proportion.add(value);
            sum += value;
            expenseNumber++;

        }while (sum <= 100.0);

        System.out.println();
        for(Double value : proportion){
            double res = budget * value/100.0;
            System.out.println("your "+value+"% equals $"+res);
        }

        System.out.println();
        System.out.println("You've remained $"+(100-sum));

    }

}
