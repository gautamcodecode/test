import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public Object getkey() {
        return null;
    }

    public Object getvalue() {
    return  null;}
}
public class map_functions {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer,Book> map=new HashMap<Integer,Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        //Traversing map
        for(Map.Entry<Integer, Book> e:map.entrySet()){
            int key=e.getKey();
            Book b=e.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
            System.out.println(b.getkey()+" "+b.getvalue());
       // for(Map.Entry m: map.entrySet()){
         //   System.out.println(m.getKey()+" "+b1);

        }
    }
}
