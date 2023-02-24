import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentHour;
        int currentMinute;
        int currentSecond;

        int nextHour;
        int nextMinute;
        int nextSecond;

        //input current time
        System.out.print("Enter current hour: ");
        currentHour = input.nextInt();
        System.out.print("Enter current minute: ");
        currentMinute = input.nextInt();
        System.out.print("Enter current second: ");
        currentSecond = input.nextInt();

        //input time to go
        System.out.print("Add hour: ");
        nextHour = input.nextInt();
        System.out.print("Add minute: ");
        nextMinute = input.nextInt();
        System.out.print("Add second: ");
        nextSecond = input.nextInt();

        //logic
        int finalHour = currentHour+nextHour;
        int finalMinute = currentMinute+nextMinute;
        int finalSecond = currentSecond+nextSecond;

        if(finalSecond >= 60){
            finalMinute++;
            finalSecond -= 60;
        }
        if(finalMinute >= 60){
            finalHour++;
            finalMinute -= 60;
        }

        System.out.println("Your new time is given below:");
        System.out.println(finalHour+":"+finalMinute+":"+finalSecond);

    }
}