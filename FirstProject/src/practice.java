public class practice {
    practice(double d){
        this(10);
        System.out.println("double arg constucter");
    }
    practice(int i){
        this();
        System.out.println("int arg constucter");
    }
    practice(){
        System.out.println("no arg constucter");
    }




    public static void main(String[] args) {
        practice p=new practice(10.5);
        practice p1=new practice(10);
        practice p2=new practice();

    }  }