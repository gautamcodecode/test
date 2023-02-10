class Q{
    public Q(){
        System.out.println("this is in Q");
    }
    public Q(int i){
        System.out.println("this is in int Q");
    }
}
class S extends Q{
    public S(){
        super(5);
        System.out.println("this is in S");
    }
    public S(int i){
        super();
        System.out.println("this is in int S");
    }
}

public class Super_practice {
    public static void main(String[] args) {
S obj=new S();
    }
}
