package ScannerDemo;

import java.util.Scanner;

public class ClassScanner{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("enter the number");
        int age=sc.nextInt();
        char c=sc.next().charAt(0);
        double d= sc.nextDouble();
        long l= sc.nextLong();
        System.out.println("enter the name:"+name);
        System.out.println("age:"+age);
        System.out.println("Gender name:"+c);

    }
}

