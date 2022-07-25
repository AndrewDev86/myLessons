package test;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fibonacci.toFib();
    }
}
class LimitCreate {
  System.out.println("enter limit");
   private static Scanner in = new Scanner (System.in);
    long lim=in.nextLong();
}
class  Fibonacci {
    public static void toFib () {
   long lim=5;
   long fib1=0;
   long fib2=1;
   long temp=0;
    System.out.println(fib1);
    System.out.println(fib2);
    while (fib2+fib1<lim){
        temp=fib1;
        fib1=fib2;
        fib2+=temp;
        System.out.println(fib2);

    }
    }
}