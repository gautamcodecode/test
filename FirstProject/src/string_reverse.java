public class string_reverse {
    public static String ReverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for (int i=ch.length-1;i>=0;i--){
            rev+=ch[i];

        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString("WINNING IS SIMPLY A MINDSET,ITS HOWEVER DEVELOPED BY OUTSTANDING INDIVIDUAL"));
        System.out.println(ReverseString("EDUCATION IS MILK OF LIONESS, IF ONE WHO DRINK IT THEN ONE ROARS"));
    }
}
