package Methos;

public class MethodOverRiding1 extends MetodOverRiding{
    int shiva(int a, int b,int c) {
        return a+b+c ;
    }

    public static void main(String[] args) {
        MethodOverRiding1 m =new MethodOverRiding1();
        System.out.println( m.shiva(10,50,40));
        System.out.println(m.shiva(10,100));


    }


}
