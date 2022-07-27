import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        double firstValue = readNumber();
        double secondValue = readNumber();
        double operation = readOperation();
        //double result = res(readOperation);
        //System.out.println("Result is" + result);
    }

    public static double readNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value");
            return scan.nextDouble();
    }
    public static  double readOperation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 is + ;2 is - ;3 is * ; 4 is / \n Choose opration");
        double numberOperation =0;
            return scan.nextDouble();
        switch (numberOperation) {
            case 1:
                return firstValue + secondValue;
            case 2:
                return firstValue - secondValue;
            case 3:
                return firstValue*secondValue;
            case 4:
                if (secondValue ==0) {
                    return firstValue / secondValue;
                } else {
                    System.out.println(" Zero diving is unable!");
                    readNumber(); }
            default: readOperation();



        }

    }
    public static void res() {
System.out.println("numberOperation");
    }
