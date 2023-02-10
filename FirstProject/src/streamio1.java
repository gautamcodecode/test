import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamio1 {
    public static <valiu> void main(String[] args) {
        List<Integer> valiu = Arrays.asList(15, 13, 14, 28, 78, 69, 26);
        System.out.println(valiu.stream().filter(k->k!=0).map(k->k*k).reduce(0,(i,j)->i+j));
        System.out.println(valiu.stream().filter(k->k!=0).map(k->k*k).reduce(1,(i,j)->i+j));
        System.out.println(valiu.stream().filter(k->k%2!=0).map(k->k*k).reduce(1,(i,j)->i*j));
//        see the difference of both sout, and identity
        Stream<String> man= Arrays.stream(new String[]{"som","tom","kom","nomm","gomm"});
        System.out.println(Arrays.stream(man.filter(b->b.length()>3).toArray(String[]::new)).collect(Collectors.toList()));
        List<String> man1= Arrays.asList(new String[]{"som","tom","kom","nomm","gomm"});
        System.out.println(Arrays.stream(man1.stream().filter(l->l.length()<4).toArray(String[]::new)).collect(Collectors.toList()));
        System.out.println(man1.stream().filter(l->l.length()<4).collect(Collectors.toList()));
//        example of for each loop
        man1.forEach(i-> System.out.print(i));
        System.out.println();
        man1.forEach(System.out::print);
    }
}