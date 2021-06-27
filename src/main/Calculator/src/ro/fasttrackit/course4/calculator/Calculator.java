package ro.fasttrackit.course4.calculator;

public class Calculator {
    private double leftVal;
    private double rightVal;
    private char opCode;
    //private double result;

    public static double execute (double leftVal, double rightVal, char opCode) {
        double result=0;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }
}
