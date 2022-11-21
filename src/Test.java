import java.util.*;

public class Test {
    public static void main(String[] args){
        TreeSet<Bo> tree = new TreeSet<>();
        Bo b = new Bo("How it goes");
        tree.add(b);
        System.out.println(tree);
        for(Bo book:tree){
            System.out.println(book.title);
        }
    }
}
class Bo implements Comparable{
    String title;
    public Bo(String s){
        title = s;
    }
    public int compareTo(Object b){
        Bo book = (Bo) b;
        return (title.compareTo(book.title));
    }
}
