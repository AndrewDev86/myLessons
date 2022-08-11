import java.util.Scanner;
public class MoneyConverter {
        public static void main(String[] args) {
            final double dollar = 39.8;
            final double euro = 40.6;
            final double pound = 46.65;
            //toUah();
        }
        public static double toUah (double dollar, double euro, double pound) {
            double result=0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your UAH amount");
            double summ = scan.nextDouble();
            System.out.println("Choose currency");
            String list = scan.nextLine();
            switch (list) {
                case "USD":
                    result = summ / dollar;
                    break;
                case "EUR":
                    result = summ / euro;
                    break;
                case "GBP":
                    result = summ / pound;
                    break;
            }
            return result;


        }


    }
}
