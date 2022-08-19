import java.util.Scanner;

public class Assignment1B {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        double height, width, res;

        System.out.println("[Print Resolution]\n");

        System.out.print("Enter the width (in pixels): ");
        height = Double.parseDouble(myObj.nextLine());

        System.out.print("Enter the height (in pixels): ");
        width = Double.parseDouble(myObj.nextLine());

        System.out.print("Enter the resolution (PPI): ");
        res = Double.parseDouble(myObj.nextLine());

        width = width / res;
        height = height / res;

        System.out.println("At " + String.format("%.0f", res) + " PPI, the image is " + String.format("%.3f", height) + "\" wide by " + String.format("%.3f", width) + "\" high.");

    }
}

