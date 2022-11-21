import java.util.*;
//Comparator
public class TreeSetComparator {
    public static void main(String[] args){
        new TreeSetComparator().go();
    }
    public void go(){
        B b1 = new B("How Cats Work");
        B b2 = new B("Remix your Body");
        B b3 = new B("Finding Emo");
        BookCompare bCompare = new BookCompare();
        TreeSet<B> tree = new TreeSet<B>(bCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
        ArrayList<String> array = new ArrayList<>();
        for(B book:tree){
            array.add(book.title);
        }
        System.out.println(array);
    }
}
class BookCompare implements Comparator<B>{
    public int compare(B one, B two){
        return(one.title.compareTo(two.title));
    }
}
class B {
    String title;
    public B(String t) {
        title = t;
    }
}