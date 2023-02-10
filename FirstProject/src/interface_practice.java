interface gautam{
    void m1();
    default void m2(){
        System.out.println("use of default in interface");
    }}


public class interface_practice {
    public static void main(String[] args) {
        gautam obj = () -> {
            System.out.println("override interface abstract method");
        };

        obj.m1();
        obj.m2();
    }

}