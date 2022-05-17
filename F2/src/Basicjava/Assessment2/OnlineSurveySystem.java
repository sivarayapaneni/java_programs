package Assessment2;
import java.util.Scanner;

public class OnlineSurveySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0, rate5 = 0;
        System.out.println("Welcome to online survey");
        System.out.println("Give the number Of partisp");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(" Enter your name");
            String s = sc.nextLine();
            System.out.println(" say Good or Bad All The Questions");
            System.out.println("1. Do you enjoy our company culture");
            String s1 = sc.nextLine();
            System.out.println("2. Do you fell connected teammates");
            String s2 = sc.nextLine();
            System.out.println("3.Do you fell that you contribute to the company's ");
            String s3 = sc.nextLine();
            System.out.println("4. do you fell valued");
            String s4 = sc.nextLine();
            System.out.println("5. Do you enjoy your day to day tasks");
            String s5 = sc.nextLine();
            System.out.println("Give your ratings out of 5*");
            int rate = sc.nextInt();
            switch (rate) {
                case 1:
                    rate1++;
                    System.out.println("rating is 1* count is  " + rate1);
                    break;
                case 2:
                    rate2++;
                    System.out.println("rating is 1* count is  " + rate2);
                    break;
                case 3:
                    rate3++;
                    System.out.println("rating is 1* count is  " + rate3);
                    break;
                case 4:
                    rate4++;
                    System.out.println("rating is 1* count is  " + rate4);
                    break;
                case 5:
                    rate5++;
                    System.out.println("rating is 1* count is  " + rate5);
                    break;

            }
            count++;
            //  System.out.println("the number of persons in the survey is "+count);
            // System.out.println("Thankey you fedback");


            System.out.println("the number of persons in the survey is " + count);
            System.out.println("Thankey you fedback");


        }
    }
}
