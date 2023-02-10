import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        System.out.print("enter number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        logic(num);

    }
    public static void logic(int number){
        int sum=0;
        for (int i=1;i<number;i++){
            if(number%i==0) {
                sum += i;
            }
        }
        if(sum==number)
            System.out.println("number is perfect number");
        else
            System.out.println("number is not perfect number");
        System.out.println(sum);
    }
}




