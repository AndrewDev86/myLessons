import java.util.Scanner;
public class Calc
{
public static void main(String[] args) {
        System.out.println("Enter first Value");
        int firstValue = readNumber();
        System.out.println("Enter second Value");
        int secondValue = readNumber();
        System.out.println("1 is + ; 2 is - ; 3 is * ; 4 is / \n Choose opration");
        int operation = readOperation();
        float result = res(firstValue,secondValue,operation);
        System.out.println("Result is" + result);
        //System.out.println(operation);
        }
public static int readNumber() {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter Value");
        return scan.nextInt();
        }
public static int readOperation() {
    Scanner scan = new Scanner(System.in);

    int numberOperation ;
    numberOperation = scan.nextInt();
   // return numberOperation;

    switch (numberOperation) {
        case 1:
            return '+';
        case 2:
            return '-';
        case 3:
            return '*';
        case 4:
            return '/';
        default:
            return readOperation();
    }
 }
public static int add(int firstValue,int secondValue) {
        return firstValue+secondValue;
        }
public static int sub(int firstValue,int secondValue) {
        return firstValue-secondValue;
        }
public static int mul(int firstValue,int secondValue) {
        return firstValue*secondValue;
        }
public static int div(int firstValue,int secondValue) {
    if (secondValue > 0) {
        return firstValue / secondValue;

    } else {
        System.out.println("Zero Diving is Unable");
        readNumber();
        //return firstValue/secondValue;
    }
    return firstValue;
}
public static float res(int firstValue,int secondValue,int operation) {
    switch (operation) {
        case '+':
            return add(firstValue, secondValue);
        case '-':
            return sub(firstValue, secondValue);
        case '*':
            return mul(firstValue, secondValue);
        case '/':
            return div(firstValue, secondValue);
        default:
            return 0;
    }
}
}
