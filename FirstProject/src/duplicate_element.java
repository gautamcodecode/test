import java.util.*;

public class duplicate_element {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(4);
        al.add(5);
        Collections.sort(al);
        Iterator<Integer> itr=al.iterator();
        Integer old= itr.next();
        while(itr.hasNext()){
            Integer next= itr.next();
            if(old.equals(next)){
                itr.remove();}
            old=next;
            }
        System.out.println("finalised element is "+al);
            {
        }

    }

}
