public class VariablesApplication {
    String name="siva king";
    static long phoneNo= 96668596685656l;




    public static void main(String[] args) {
        int a =1,b=8;
        a =a+b;
        b= a-b;
        a= a-b;

        System.out.println("a= "+a);
        System.out.println("b= " +b);

        VariablesApplication obj=new VariablesApplication();
        System.out.println(obj.name);
        System.out.println(phoneNo);




    }
}
