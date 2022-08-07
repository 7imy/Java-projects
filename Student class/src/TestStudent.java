import java.util.Vector;
import java.util.*;
public class TestStudent {
    public static void main(String[] args) {
        Vector<Integer> nm = new Vector<Integer>(500);
        System.out.println(nm.add(84));
        System.out.println(nm.add(54));
        System.out.println(nm.add(57));

/*

        System.out.println(); 
        System.out.println(nm.contains(84));
        System.out.println();
        */
        System.out.println(nm.elementAt(1));
       /* System.out.println(nm.firstElement()+"\n");
        System.out.println();
        System.out.println(nm.lastElement());
        System.out.println();
        System.out.println(nm.indexOf(51));
        System.out.println(nm.indexOf(84));
        System.out.println();
        System.out.println(nm.indexOf(84,1));
        System.out.println(nm.indexOf(57,1));
        System.out.println();
        System.out.println(nm.isEmpty());
        System.out.println();
        System.out.println(nm.lastIndexOf(57));
        System.out.println();
        //System.out.println(nm.removeAllElements());
        System.out.println();
        System.out.println(nm.removeElement(57));
        System.out.println(nm.removeElement(100));*/   
    }
}
