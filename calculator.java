// import java.util.Scanner;
// public class calculator{
//     public static void main(String[]args){
//         int operator,n1,n2;
//         double result = 0; //initialize result variable as double

//         System.out.println("1- Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide");
//         System.out.println("Choose Operator: ");

//         Scanner sc =  new Scanner(System.in);
//         operator = sc.nextInt();

//         System.out.println("Enter first number: ");
//         n1 = sc.nextInt();
//         System.out.println("Enter second number: ");
//         n2 = sc.nextInt();

//         switch(operator){
//             case 1:
//             result = n1 + n2;
//             break;

//             case 2:
//             result = n1 - n2;
//             break;

//             case 3:
//             result = n1 * n2;
//             break;

//             case 4:
//             result = n1 / n2;
//             break;

//             default: System.out.println("Enter operator is not valid");
//             return;
//         }
//         System.out.println("Result is : " + result);


//     }
// }
import java.util.Scanner;
public class calculator {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first number :");
        int a = sc.nextInt();

        System.out.println("Enter value of second number :");
        int b = sc.nextInt();

        System.out.println("Select operation");
        System.out.println("Addition +: Subtraction-: Multiplication *: Division /: ");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case '+' :
                System.out.println("Sum of the given two numbers: "+(a+b));
                break;
            case '-' :
                System.out.println("Difference between the two numbers: "+(a-b));
                break;
            case '*' :
                System.out.println("Product of the two numbers: "+(a*b));
            case '/' :
                System.out.println("Result of the division: "+(a/b));
                break;
            default :
                System.out.println("Invalid input");
        }
    }
}