public class try_catch {
    public static void main(String[] args) {

        try {
            int a[]= {1,2,3,4};
            a[0]=5;
            int i = 4;
            int j = 0;
            int k = i / j;
            System.out.println("yr value is:" + k);
        }
        catch (Exception e){
            System.out.println("got it");
        }
        finally {
            System.out.println("this one is always be execute");
        }
    }
}