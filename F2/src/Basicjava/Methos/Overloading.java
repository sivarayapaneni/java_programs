package Methos;

public class Overloading {
    int sum(int a ,int b){
        return a+b;

    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading o=new Overloading();
        System.out.println(o.sum(10,20));
        System.out.println( o.sum(10,50,60));;

    }
    }

