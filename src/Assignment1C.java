import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        char letter;

        
        System.out.println("[And the next letter is]");
        System.out.print("Please enter a letter: ");
        letter = myObj.next().charAt(0);
        System.out.println("The next letters after " + letter + " are " + (char)(letter+1) + ", " + (char)(letter+2) + ", and " + (char)(letter+3) + "!");
    
    }
}

