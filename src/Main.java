import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double oper1;
        double oper2;
        double result;
        String operation;
        Calculator calculator = new Calculator();
        calculator.init();

        while (true) {
            System.out.println("Press \"c\" to start new calculation." + " " + "Press any key to continue calculation with previous result");
            operation = calculator.scanner.next();
            if (operation.equals("s")) {
                break;
            }
            if (operation.equals("c")) {
                calculator.init();
            } else {
                calculator.calculation(oper1, oper2, result);
            }


        }

        Scanner sc = new Scanner(System.in);
        String s = "s";
        while(!s.equals("s")){
            s = sc.nextLine();
        }
        System.out.println("See you for your next calculation!");

    }
}