import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamio {
    public static void main(String[] args) {
//        ArrayList<String> s=new ArrayList<>();
//        s.add("ram");
//        s.add("shyam");
//        s.add("dhyan");
//        s.add("kyam");
//        s.add("oyam");
//        s.add("lyam");
//        List<String> str= s.stream().filter(s1 -> s1.equals("dhyan")).collect(Collectors.toList());
//        System.out.println(str);
          ArrayList<Integer> arr=new ArrayList<>()   ;
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Integer> li=arr.stream().filter(i ->i<=i*i).collect(Collectors.toList());
        System.out.println(li);
        Stream<Integer> stream1=arr.stream();
//        stream1.forEach(o -> System.out.println(o) );
        stream1.forEach(System.out::print);
        Stream<Integer> stream2=arr.stream();
//        List<Integer> lo=stream2.map(g->g*g).collect(Collectors.toList());
//        System.out.println(lo);
        System.out.println(stream2.map(g->g*g).collect(Collectors.toList()));
        System.out.println(arr.stream().filter(g->g%2==0).map(g->g*g).reduce(0,(i,j)->i+j));
    }
}
