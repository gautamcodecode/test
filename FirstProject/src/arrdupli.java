public class arrdupli {
    public static void main(String[] args) {
     int arr1[]={11,12,13,14,15,16,17};
        int arr2[]={14,15,16,17,18,19};
        System.out.println("your duplicate element is:");
        sortedduplicatelement(arr1,arr2);
    }
    public static void sortedduplicatelement(int a1[],int a2[]){
        for (int i=0;i< a1.length;i++){
            for (int j=0;j<a2.length;j++){
                if (a1[i]==a2[j]){
                    System.out.print(a1[i]+" ");
                }
            }
        }
    }
}
