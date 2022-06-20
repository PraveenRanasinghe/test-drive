import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the preffered number: ");
        int number = input.nextInt();
        System.out.println("Entered Number : "+ number);

        int num = number;
        int count = num - 1;
        for (int k = 1; k <= num; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        count = 1;
        for (int k = 1; k <= num - 1; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            for (int i = 1; i <= 2 * (num - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
