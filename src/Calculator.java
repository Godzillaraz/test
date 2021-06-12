import java.util.Scanner;
public class Calculator  {
    Scanner scanner = new Scanner(System.in);
    private double oper1;
    private double oper2;
    private double result;

    public void init() {
        System.out.println("Вводите значения и операции через Enter. После вычисления по каждой операции, нажмите любую клавишу и вводите последющее значение ");
        oper1 = scanner.nextDouble();
        calculation(oper1, oper2,result);
    }
    public void calculation(double oper1, double oper2, double result) {
        char operation = scanner.next().charAt(0);

        switch(operation) {
            case ('^'):
                oper2=scanner.nextDouble();
                result = Math.pow(oper1,oper2);
                System.out.print("result = "+result+ ' ');
                oper1 = result;
                break;
            case ('/'):
                oper2=scanner.nextDouble();
                if (oper2 == 0) {
                    result = Double.MAX_VALUE;
                    System.out.print("Err   ");
                    break;
                }
                result = oper1 / oper2;
                System.out.print("result = "+result + ' ');
                oper1 = result;
                break;
            case ('*'):
                oper2=scanner.nextDouble();
                result = oper1 * oper2;
                System.out.print("result = "+result+ ' ');
                oper1 = result;
                break;
            case ('-'):
                oper2=scanner.nextDouble();
                result = oper1 - oper2;
                System.out.print("result = "+result+ ' ');
                oper1 = result;
                break;
            case ('+'):
                oper2=scanner.nextDouble();
                result = oper1 + oper2;
                System.out.print("result = "+result+ ' ');
                oper1 = result;
                break;
        }
    }
}