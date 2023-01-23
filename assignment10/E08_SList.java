package assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class E08_SList {
    public static void main(String[] args) {

        System.out.println("Demostrating Slistiterator....");
        SList<String>  s1=new SList<String>();
        System.out.println(s1);
        SListIterator<String> slit = s1.iterator();
        slit.add("One");
        slit.add("Two");
        slit.add("Three");

        System.out.println(slit.hasNext());
        System.out.println(s1);

        slit=s1.iterator();
        slit.add("Four");

for(; slit.hasNext();)
    System.out.println(slit.next());
        System.out.println(s1);
        slit=s1.iterator();
        slit.remove();
        System.out.println(slit.next());
        System.out.println(s1);

        System.out.println("Demonstrating Listiterator");
        List<String> l=new ArrayList<String>();
        System.out.println(l);

        ListIterator<String> lit=l.listIterator();
        lit.add("One");
        lit.add("two");
        lit.add("three");

        System.out.println(lit.hasNext());
        System.out.println(l);

        lit=l.listIterator();
        lit.add("Four");

        for(; lit.hasNext();)
            System.out.println(lit.next());

        System.out.println(l);

        lit=l.listIterator();
        System.out.println(lit.next());
        lit.remove();
        System.out.println(lit.next());
        System.out.println(l);

    }
}
