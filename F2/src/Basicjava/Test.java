import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
       /* StringTokenizer st = new StringTokenizer("my company name is codexbox");
        System.out.println("Next token is : " + st.nextToken(","));*/
        StringTokenizer st = new StringTokenizer("my company name is codexbox"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}