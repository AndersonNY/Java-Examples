import java.util.Scanner;

public class HomeWorkDay10 {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int firstNumber = userinput.nextInt();

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " * " + firstNumber + " = " + firstNumber * i);
        }


    }


    }
