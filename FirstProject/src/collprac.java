import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class collprac {
    public static void main(String[] args) {
        LinkedList<String> ar=new LinkedList<>();
        ar.add("data");
        ar.add("beta");ar.add("tata");ar.add("kata");ar.add("sata");

        Iterator<String> it= ar.iterator();
        while (it.hasNext()){
            String val= it.next();
            System.out.println(val);
            if (val.equals("beta"))
                it.remove();
        }
        for (String s:ar) {
            System.out.print(s+" ");
        }
    }
}
