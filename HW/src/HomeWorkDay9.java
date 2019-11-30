import java.util.Scanner;

public class HomeWorkDay9 {

    //TODO Task
    // 1. Write program that gets two inputs from user then prints sum
    // 2. Write simple calculator,
    //     a. reads first input
    //     b. reads operator (+, -, *, /)
    //     c. reads second input
    //     d. prints result
    // 3. Write program that calculates from string:
    //    ex: one plus nine => 10, four subtract 2 => 2

    public static void main(String[] args) {

//1
        Scanner userinput = new Scanner(System.in);
        System.out.print("Write your first number: ");
        int a = userinput.nextInt();
        System.out.print("Write your second number: ");
        int b = userinput.nextInt();

        System.out.println("What do you want to do? ");
        String operator = userinput.nextLine();

        if (operator == "*") {
            System.out.println(a * b);
        } else if (operator == "+") {
            System.out.println(a + b);
        } else if (operator == "/") {
            System.out.println(a / b);
        } else if (operator == "-") {
            System.out.println(a - b);
        } else {
            System.out.println("The symbol you show is not available.");
        }


    }
    }
