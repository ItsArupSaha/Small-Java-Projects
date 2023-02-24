import java.util.ArrayList;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {

        int studentNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        studentNumber = input.nextInt();

        String[] student = new String[studentNumber];
        int[] age = new int[studentNumber];
        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);

        for(int i=0; i<studentNumber; i++){
            System.out.println("Enter name & age: ");
            student[i] = scanName.nextLine();
            age[i] = scanAge.nextInt();
        }

        boolean isPresent = false;
        System.out.println();
        for(int i=0; i<studentNumber; i++){

            if(age[i] >= 15){
                System.out.println(student[i]+" can receive vaccine");
                isPresent = true;
            }
        }

        System.out.println();
        if(!isPresent){
            System.out.println("There are no eligible students to take vaccine");
        }

        input.close();
        scanName.close();
        scanAge.close();

    }

}
