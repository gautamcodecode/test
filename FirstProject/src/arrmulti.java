public class arrmulti {
    static int multi = 1;
    static int[] a = new int[]{1, 2, 3, 4,8};
    static int[] b=new int[a.length];

    public static void main(String[] args) {
        System.out.print("your required array is : { ");
        reqarr();
        System.out.print("}");
    }

    public static void reqarr() {
        for (int i = 0; i < a.length; i++) {
            multi *= a[i];
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = (multi / a[i]);

            System.out.print(b[i]+" ");
        }

    }
}


