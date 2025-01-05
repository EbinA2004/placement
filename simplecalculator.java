import java.util.Scanner;
public class room {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the option");
        System.out.println("1 for Addition\n2 for Subraction\n3 for Multiplication\n4 for Division");
        int calculator=scan.nextInt();

        System.out.print("Enter your first number");
        float a = scan.nextFloat();

        System.out.println("Enter your second number");
        float b = scan.nextFloat();

        switch (calculator) {
            case 1:
                System.out.println("Addition:" +(a+b));
                break;
                case 2:
                System.out.println("Subraction:" +(a-b));
                break;
                case 3:
                System.out.println("Multiplication:" +(a*b));
                break;
                case 4:
                System.out.println("Divition" +(a/b));
                break;

            default:
            System.out.println("INVALID NUMBER");
                break;
        }
        

    }
    
}
