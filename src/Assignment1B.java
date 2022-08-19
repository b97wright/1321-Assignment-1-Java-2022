import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        double labG, assignG, midExamG, finalExamG, finalG;

        System.out.println("[CSE 1321L Final Grade Calculator]\n");

        System.out.print("Enter your average lab grade: ");
        labG = Double.parseDouble(myObj.nextLine());

        System.out.print("Enter your average assignment grade: ");
        assignG = Double.parseDouble(myObj.nextLine());

        System.out.print("Enter your midterm exam grade: ");
        midExamG = Double.parseDouble(myObj.nextLine());

        System.out.print("Enter your final exam grade: ");
        finalExamG = Double.parseDouble(myObj.nextLine());
        System.out.println(" ");

        labG = labG * .1;
        assignG = assignG * .4;
        midExamG = midExamG * .2;
        finalExamG = finalExamG * .3;

        System.out.println("Your weighted lab average is " + String.format("%.2f", labG));
        System.out.println("Your weighted assignment average is " + String.format("%.2f", assignG));
        System.out.println("Your weighted midterm exam average is " + String.format("%.2f", midExamG));
        System.out.println("Your weighted final exam average is " + String.format("%.2f", finalExamG));
        System.out.println(" ");

        finalG = labG + assignG + midExamG + finalExamG;

        System.out.println("Adding numbers...");
        System.out.println("Your final grade in CSE 1321L is " + String.format("%.2f", finalG));
    
    }
}

