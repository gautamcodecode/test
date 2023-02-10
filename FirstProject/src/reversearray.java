class arr{
    int[] a=new int[]{54,62,21,32,58};
    int[] b=new int[a.length];
    public void revarr(){
        System.out.print("your array is : [ ");
        for(int i = 0; i<a.length; i++){
            b[i]=a[a.length-1-i];
            System.out.print(b[i]+" ");
        }
        System.out.print("]");
    }
}
public class reversearray {
    public static void main(String[] args) {
        arr o=new arr();
        o.revarr();

    }

}
