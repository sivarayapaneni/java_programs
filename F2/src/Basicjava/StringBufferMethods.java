import java.util.Arrays;

public class StringBufferMethods {
    public static void main(String[] args) {
       /* StringBuffer sb=new StringBuffer("verru ");
        sb.append("anna");
        System.out.println(sb);*/
        /*StringBuffer sb=new StringBuffer("Hello ");
        sb.insert(4,"Java");
        System.out.println(sb);*/
        /*StringBuffer sb=new StringBuffer("Codexbox");
        sb.replace(1,3,"Verru");
        System.out.println(sb);*/
        //Immutable String;
        /*String s="siva";
        s.concat("learning java");
        System.out.println(s);*/
        /*String s="siva";
        s=s.concat("learning java");
        System.out.println(s);*/
        //Split
        String text= new String("Hello, My name is Siva");
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));
/*//Upper case to lower case.
        String s="siva";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);*/
      /*  //Startswith endswith
        String s="Siva";
        System.out.println(s.startsWith("ra"));
        System.out.println(s.endsWith("n"));*/
        /*int a=10;
        String s=String.valueOf(a);
        System.out.println(s+10);*/
    }
}
