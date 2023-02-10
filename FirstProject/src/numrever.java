public class numrever {
    static int num = 2269;
    static int reverse = 0;

    public static void main(String[] args) {
        while (num != 0) {
            int rem = num % 10;
            reverse =reverse*10+rem;
            num=num/10;
        }
        System.out.println("your reverse number is given below\n"+reverse);
    }
}