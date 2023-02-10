public class second_highest {
    public static int SecondHighest(int[] a, int length){
        int temp;
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[length-2];
    }

    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,3,2,1};
        int b[]={90,54,99,100,32,13,65,28,75};
        System.out.println("second largest: "+SecondHighest(a,9));
        System.out.println("second largest: "+SecondHighest(b,9));

    }
        }
