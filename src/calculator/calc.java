
import java.util.Scanner;

/**
 * Created by sudarshms on 11/07/14.
 */
class Calculator {
    int  x, y, op;

    public Calculator() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the operator");
        op = kb.nextInt();
        System.out.println("Enter the operand 1");
        x = kb.nextInt();
        System.out.println("Enter the operand 2");
        y = kb.nextInt();
        System.out.println(calc(op));
    }

    public int calc(int op) {
        int result = 0;
        switch (op) {
            case 1: result = add(x,y);
                       break;
        }
        return result;
    }


    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

}


class calc {

    public static void main(String[] args) {
        Calculator mycalc = new Calculator();

        System.out.println("");

    }

}