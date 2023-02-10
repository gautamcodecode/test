

public class fibonacc_series {
    public static void main(String[] args) {
        int num=0;
        int m=num/2;


            for (num=0;num<=100;num++){
                if (num==0||num==1){
                    System.out.println(num+"is not prime");}
                    else if (num==2||num==3) {
                    System.out.println(num + "is prime");
                }
                    else {
                        for (int i=2;i<=m;i++){
                            if (num%i==0){
                                System.out.println(num+"is not prime");
                                break;}
                            else {
                                System.out.println(num+"is prime");
                            }
                        }
                }

                    }
                }
            }






