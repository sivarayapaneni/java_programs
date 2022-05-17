import javafx.beans.value.ObservableIntegerValue;

public class WrapperClass {
    public static void main(String[] args) {
       /* Integer myint=5;
        Character mychar='R';
        Double mydouble=5.99;
        System.out.println(myint.intValue());
        System.out.println(mychar.charValue());
        System.out.println(mydouble.doubleValue());*/
        Integer myint=50000;
        String mystring=myint.toString();
        System.out.println(mystring.length());
        char a='C';
        Character i= a;

        System.out.println(a+" "+i.charValue()+" ");

    }
}
